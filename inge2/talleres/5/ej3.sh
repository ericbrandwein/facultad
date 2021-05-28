#!/usr/bin/env bash

cd evosuite-master

java -jar target/evosuite-master-1.0.7-SNAPSHOT.jar -measureCoverage \
    -class org.autotest.StackAr -Djunit=org.autotest.StackAr_ESTest \
    -criterion line:branch -projectCP target/stackar/:evosuite-tests \
    -Dtest_scaffolding=false -Dno_runtime_dependency=true

# a)
# * Coverage of criterion LINE: 100%
# * Number of covered goals: 51 / 51
# * Coverage of criterion BRANCH: 100%
# * Number of covered goals: 29 / 29
# * Total number of covered goals: 80 / 80
# * Total coverage: 100%

cd ../ej3
mvn clean install
$BROWSER target/site/jacoco/index.html

# b)
# JaCoCo reportó una cobertura de líneas del 100%, con 193 líneas
# cubiertas, y de branches del 100%, con 26 branches cubiertos.

# Para correr JaCoCo tuve que hacer que se ignore un test que ocasionaba
# un StackOverflowException. El mismo ocurría porque se
# llamaba a toString() en una instancia de StackAr que contenía otra
# instancia de StackAr, que a su vez contenía a la primera, haciendo
# un bucle infinito de llamadas recursivas a toString().

mvn clean install org.pitest:pitest-maven:mutationCoverage

# c)
# El testsuite logra un mutation score del 54%, matando 20 mutantes de los
# 37 generados.



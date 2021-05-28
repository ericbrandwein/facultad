#!/usr/bin/env bash

cd evosuite-master

mvn clean install -DskipTests
mv ../stackar/ target/stackar
javac target/stackar/org/autotest/StackAr.java
mv master/target/evosuite-master-1.0.7-SNAPSHOT.jar target
java -jar target/evosuite-master-1.0.7-SNAPSHOT.jar \
    -class org.autotest.StackAr -projectCP target/stackar/ -Dtest_scaffolding=false \
    -Dno_runtime_dependency=true
#!/bin/bash

# Para obtener los resultados, tenía el A.java con todos los códigos de los 3 ejercicios
# en el CLASSES_DIR, y corrí este script cambiando el TAGGER dependiendo del ejercicio.
# Para ver el resultado fui al A.jimple resultante y scrolleé a las líneas que correspondían al
# ejercicio.

TAGGER=jap.rdtagger
#TAGGER=jap.lvtagger
# TAGGER=jap.npc

CLASSES_DIR=../talleres/1

javac -target 1.8 -source 1.8 -g ${CLASSES_DIR}/A.java
mv ${CLASSES_DIR}/A.class .
mv ${CLASSES_DIR}/A\$Cell.class .
java -cp .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp .:$JRE -f J A -print-tags -p $TAGGER enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number
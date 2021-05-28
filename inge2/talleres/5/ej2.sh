#!/usr/bin/env bash

cd evosuite-master

mvn dependency:copy-dependencies
export CLASSPATH=target/stackar:evosuite-tests:generated/target/dependency/*
javac evosuite-tests/org/autotest/*.java
java org.junit.runner.JUnitCore org.autotest.StackAr_ESTest

# Corrieron 27 tests, de los cuales falló 1 por un StackOverflowException.
# Esto fue porque se creó un StackAr A que contenía otro Stackar B, que a
# su vez contenía al StackAr A. Por lo tanto, cuando se llama al
# toString(), se genera una llamada recursiva infinita entre ellos.
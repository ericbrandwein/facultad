#!/usr/bin/env bash

STACKAR_DIR=main/java/org/autotest
BUILD_DIR=build
SRC_DIR=src
RANDOOP_CLASS_PATH=lib/randoop-all-4.2.3.jar
TEST_GENERATION_CLASSPATH=$RANDOOP_CLASS_PATH:$BUILD_DIR
GENERATION_TIME=2

mkdir -p build
javac -classpath lib/randoop-all-4.2.3.jar -d $BUILD_DIR $SRC_DIR/${STACKAR_DIR}/StackAr.java

java -ea -classpath $TEST_GENERATION_CLASSPATH randoop.main.Main gentests \
    --testclass=org.autotest.StackAr --time-limit=$GENERATION_TIME --testsperfile=500 \
    --junit-output-dir=src/test/java

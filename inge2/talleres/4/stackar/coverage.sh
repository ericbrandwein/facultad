#!/usr/bin/env bash

mvn -e clean install

$BROWSER target/site/jacoco/index.html

#!/bin/bash
# run Project 1 Application
cd src
export CLASSPATH=$CLASSPATH:lib/jcommon-1.0.23.jar:lib/jfreechart-1.0.19.jar 
javac com/main/Application.java
java com/main/Application
cd ..
rm src/com/*/*.class

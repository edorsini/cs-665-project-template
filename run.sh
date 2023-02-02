#!/bin/bash
mvn clean compile
mvn exec:java -Dexec.executable="edu.utexas.cs.cs378.Main" -Dexec.args="WikipediaPagesOneDocPerLine.txt.bz2"
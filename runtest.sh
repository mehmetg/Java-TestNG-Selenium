#!/usr/bin/env bash
echo "" > errors.txt
x=1

while [ $x -gt 0 ]; do
    ts=$(date) 
    export BUILD_TAG="SC TEST RUN ${ts} - ${x}"
    echo "Running build ${BUILD_TAG}"
    export MAVEN_OPTS="-Xms1024m -Xmx4096m"
    mvn test 2>>errors.txt
    x=$(($x-1))
done

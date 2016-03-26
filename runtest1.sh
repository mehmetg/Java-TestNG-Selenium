#!/usr/bin/env bash
echo "" > errors1.txt
x=1
export SELENIUM_PORT="4446"
export SELENIUM_HOST="localhost"
while [ $x -gt 0 ]; do
    ts=$(date) 
    export BUILD_TAG="SC TEST RUN ${ts} - ${x}"
    echo "Running build ${BUILD_TAG}"
    export MAVEN_OPTS="-Xms1024m -Xmx4096m"
    mvn test 2>>errors.txt
    x=$(($x-1))
done

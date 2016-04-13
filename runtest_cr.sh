#!/usr/bin/env bash
ts=$(date +"%Y%m%d%H%M%S" | cut -c 1-14)
err_file=errors_cr_${ts}.txt
std_file=std_cr_${ts}.txt
echo "" > $err_file
echo "" > $std_file
x=1
export SELENIUM_PORT="4445"
export SELENIUM_HOST="localhost"
while [ $x -gt 0 ]; do
    ts=$(date) 
    export BUILD_TAG="SC TEST RUN ${ts} - ${x}"
    echo "Running build ${BUILD_TAG}"
    export MAVEN_OPTS="-Xms1024m -Xmx4096m"
    mvn test 1>>$std_file  2>>$err_file
    x=$(($x-1))
done

#!/usr/bin/env bash
ts=$(date +"%Y%m%d%H%M%S" | cut -c 1-14)
of="open_connections_${ts}.txt"
open_files="open_files_${ts}.txt"
memf="memory_usage_${ts}.txt"
echo "Writing to file" $of
echo "Writing to file" $memf
echo "Writing to file" $open_files
echo "" > $memf
echo "" > $open_files
echo "TIMESTAMP           # OPEN CONNECTIONS" > $of
echo "TIMESTAMP            PID USER      PR  NI    VIRT    RES    SHR S  %CPU %MEM     TIME+ COMMAND" > $memf

while :
do
    ts=$(date +"%Y%m%d %H%M%S.%N" | cut -c 1-19)
    oc=$(ss -p  | grep "\"sc\"" | wc -l)
    pids=$(ps ax |grep -v grep |grep "bin/sc" | awk '{print $1}')
    pid_line=$(ps ax | grep [bin]/sc  | awk  '{print $1}' | tr "\n" ",")
    ofd=$(lsof -p $pid_line)
    echo "${ts}" >> ${open_files}
    echo "${ofd}" >> ${open_files}
    echo "${ts} ${oc}" >> ${of}
    #echo "${ts} ${oc}"
    for pid in $pids
    do
	mcs=$(top -n 1 -p $pid | grep "${pid} ubuntu" | tr -d '\r' | tr -d '\n')
        echo "${ts} ${mcs}" >> $memf
        #echo "${ts} ${mcs}"
    done
    sleep 1
done

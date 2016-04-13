#!/usr/bin/env bash
ts=$(date +"%Y%m%d%H%M%S" | cut -c 1-14)
rm -rf sc_log.txt
# ulimit -n 65536
echo "bin/sc -vv --wait-tunnel-shutdown -l sc_log_${ts}.txt -d pid.txt --daemonize"
bin/sc -vv --wait-tunnel-shutdown -l sc_log_${ts}.txt -d pid.txt --daemonize

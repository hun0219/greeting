#!/bin/bash

# start the application
# nohup java \
#	-jar build/libs/greeting-0.0.1-SNAPSHOT.jar &
JAR_PATH="build/libs/greeting-0.0.1-SNAPSHOT.jar"
#LOG_DIR="logs"

# JAR 파일 실행
#nohup java -jar $JAR_PATH > logs/app.log 2>&1 &

#echo $! > $LOG_DIR/app.pid
#echo "> Application started with PID $!"


set +e #so "at now" will run even if java -jar fails

#Run java app in background
#echo "java -jar $(ls | grep *.jar | head -n 1)a" | at now
echo "java -jar $JAR_PATH" | at now
echo "> Application started with PID $!"

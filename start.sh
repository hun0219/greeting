#!/bin/bash

# start the application
# nohup java \
#	-jar build/libs/greeting-0.0.1-SNAPSHOT.jar &
JAR_PATH="build/libs/greeting-0.0.1-SNAPSHOT.jar"

# JAR 파일 실행
nohup java -jar $JAR_PATH > logs/app.log 2>&1 &

echo "> Application started with PID $!"

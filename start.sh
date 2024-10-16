#!/bin/bash

# start the application
# nohup java \
#	-jar build/libs/greeting-0.0.1-SNAPSHOT.jar &
JAR_PATH="build/libs/greeting-0.0.1-SNAPSHOT.jar"

# JAR 파일 실행
nohup java -jar $JAR_PATH > logs/app.log 2>&1 &

# 프로세스를 세션과 분리
disown

echo "> Application started with PID $!"

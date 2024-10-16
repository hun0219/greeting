#!/bin/bash

# start the application
#nohup java \
#	-jar build/libs/greeting-0.0.1-SNAPSHOT.jar &
#JAR_PATH="build/libs/greeting-0.0.1-SNAPSHOT.jar"
#LOG_DIR="logs"

# JAR 파일 실행
#nohup java -jar $JAR_PATH > logs/app.log 2>&1 &

#echo $! > $LOG_DIR/app.pid
#echo "> Application started with PID $!"

#!/bin/bash

set +e  # so "at now" will run even if java -jar fails

# JAR 파일 경로 및 로그 디렉토리 설정
#JAR_PATH="build/libs/greeting-0.0.1-SNAPSHOT.jar"
#LOG_DIR="logs"

# 1분 후에 애플리케이션 실행 (at now + 1 min)
#nohup java \
#       -jar build/libs/greeting-0.0.1-SNAPSHOT.jar & | at now

echo "java -jar $(ls | grep greeting-0.0.1-SNAPSHOT.jar | head -n 1)" | at now

echo "> Application started with PID $!"
# PID 파일 기록
#echo $! > $LOG_DIR/app.pid

# 애플리케이션 시작 메시지 출력

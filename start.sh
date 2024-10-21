#!/bin/bash

# start the application
nohup java \
        -jar build/libs/greeting-0.0.1-SNAPSHOT.jar > server.log 2>&1 &

echo "> Application started with PID $!"

#!/bin/bash

APP_SERVER_HOME=${APP_SERVER_HOME:-"/data/project/server-consumer"}
APP_SERVER_CONFIG_HOME=${APP_SERVER_CONFIG_HOME:-"/data/project/server-consumer/config"}
APP=server-consumer-1.0-SNAPSHOT.jar

set -e

exec java -jar ${APP_SERVER_HOME}/${APP} --spring.config.location=${APP_SERVER_CONFIG_HOME}/application.yml

exec "$@"

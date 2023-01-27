#!/bin/bash

APP_SERVER_HOME=${APP_SERVER_HOME:-"/data/project/eureka-server"}
APP_SERVER_CONFIG_HOME=${APP_SERVER_CONFIG_HOME:-"/data/project/eureka-server/config"}
APP=eureka-server-1.0-SNAPSHOT.jar

set -e

exec java -jar ${APP_SERVER_HOME}/${APP} --spring.config.location=${APP_SERVER_CONFIG_HOME}/application.yml

exec "$@"

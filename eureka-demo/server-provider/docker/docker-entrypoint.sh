#!/bin/bash

APP_SERVER_HOME=${APP_SERVER_HOME:-"/data/project/server-provider"}

set -e

exec java -jar ${APP_SERVER_HOME}/server-provider-1.0-SNAPSHOT.jar --spring.config.location=../config/application.yml

exec "$@"

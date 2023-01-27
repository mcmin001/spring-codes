#!/bin/bash

APP_SERVER_HOME=${APP_SERVER_HOME:-"/data/project/server-provider"}
APP_SERVER_CONFIG_HOME=${APP_SERVER_CONFIG_HOME:-"/data/project/server-provider/config"}

set -e

exec java -jar ${APP_SERVER_HOME}/server-provider-1.0-SNAPSHOT.jar --spring.config.location=${APP_SERVER_CONFIG_HOME}/application.yml

exec "$@"

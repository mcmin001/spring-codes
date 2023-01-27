#!/bin/bash

echo "try to build eureka-server docker image now"
docker build -t eureka-server:v1.0.0 .
echo "build build eureka-server docker image success"

#!/bin/bash

echo "try to build server-consumer docker image now"
docker build -t server-consumer:v1.0.0 .
echo "build build server-consumer docker image success"

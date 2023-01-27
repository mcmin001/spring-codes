#!/bin/bash

echo "try to build server-provider docker image now"
docker build -t server-provider:v1.0.0 .
echo "build build server-provider docker image success"

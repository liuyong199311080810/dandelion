#!/usr/bin/env bash

CUR=$(dirname $0)

pushd $CUR/eureka-server
mvn clean
mvn package docker:build
popd
pushd $CUR/service
mvn clean
mvn package docker:build
popd
pushd $CUR/gateway
mvn clean
mvn package docker:build
popd
pushd $CUR/v2-api
mvn clean
mvn package docker:build
popd
pushd $CUR/v2-web
mvn clean
mvn package docker:build
popd
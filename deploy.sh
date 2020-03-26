#!/bin/bash

echo ====================== building and copy jar ======================
./gradlew -x test

echo ====================== starting compose docker ======================
docker-compose up -d

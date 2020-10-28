#!/bin/bash

curl -s -X POST \
  http://localhost:8081/ml-probability-of-default \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
  "user":"Jeff",
  "amount":100
}'

#!/bin/sh
set -e

if [ "$HOSTNAME" = "api" ]; then
  echo "Waiting for 100 seconds before starting db..."
  sleep 100
fi

echo "Starting application..."
exec java -jar app.jar
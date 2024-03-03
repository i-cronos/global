#!/bin/bash
name=cronosdevacr.azurecr.io/cronos/app/workerapp
version=1.0.0

docker image build -t ${name}:${version} .
docker push ${name}:${version}

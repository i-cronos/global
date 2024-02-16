#!/bin/bash
name=cronosdev.azurecr.io/cronos/app/global
version=1.0.0

docker image build -t ${name}:${version} .
docker push ${name}:${version}

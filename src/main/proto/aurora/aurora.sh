#!/usr/bin/env bash

FILE_NAME="aurora"
PROTO_FILE="${FILE_NAME}.proto"
DIR_OF_PROTO_FILE="/home/he/workspace/intellij/grpc-java/src/main/proto/aurora/"
OUTPUT_DIR="/home/he/workspace/intellij/grpc-java/src/main/java/"
#protoc -I ${proto_dir} ${proto_dir}/${file_name}.proto --java_out=plugins.txt=protoc-gen-grpc-java:${OUTPUT_DIR}

protoc --plugin=/home/he/workspace/intellij/grpc-java/protoc-gen-grpc-java --java_out=$OUTPUT_DIR --proto_path=$DIR_OF_PROTO_FILE ${DIR_OF_PROTO_FILE}/${FILE_NAME}.proto
protoc --plugin=/home/he/workspace/intellij/grpc-java/protoc-gen-grpc-java --grpc-java_out=$OUTPUT_DIR --proto_path=$DIR_OF_PROTO_FILE ${DIR_OF_PROTO_FILE}/${FILE_NAME}.proto
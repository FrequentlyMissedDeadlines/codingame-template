#!/bin/bash

LTIME=`find src -type f -regex ".*\.java" -exec stat -c %Z {} +` 
echo "BUILD DONE"
javac builder/FileBuilder.java
java builder.FileBuilder $1

while true
do
   ATIME=`find src -type f -regex ".*\.java" -exec stat -c %Z {} +`

   if [[ "$ATIME" != "$LTIME" ]]
   then    
       java builder.FileBuilder $1 
       echo "BUILD DONE"
       LTIME=$ATIME
   fi
   sleep 1
done
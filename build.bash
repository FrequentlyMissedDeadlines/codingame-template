#!/bin/bash

LTIME=`stat -c %Z src/**/*.java` 
echo "BUILD DONE"
javac builder/FileBuilder.java
java builder.FileBuilder $1

while true
do
   ATIME=`stat -c %Z src/**/*.java`

   if [[ "$ATIME" != "$LTIME" ]]
   then    
       java builder.FileBuilder $1 
       echo "BUILD DONE"
       LTIME=$ATIME
   fi
   sleep 1
done
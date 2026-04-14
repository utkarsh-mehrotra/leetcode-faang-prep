#!/usr/bin/env bash
# run.sh - A simple test runner for FAANG LeetCode Solutions

if [ "$#" -ne 2 ]; then
    echo "Usage: ./bin/run.sh <topic> <LC_Number_Or_File>"
    echo "Example: ./bin/run.sh arrays 001_TwoSum.java"
    exit 1
fi

TOPIC=$1
FILE=$2

# If user just passed the number, we can search for it
if [[ ! "$FILE" == *".java" ]]; then
    # e.g. finding a file starting with the LC number
    MATCH=$(find "$TOPIC/solutions" -name "*${FILE}_*.java" | head -n 1)
    if [ -z "$MATCH" ]; then
        echo "❌ Error: Could not find a Java file matching $FILE in $TOPIC/solutions"
        exit 1
    fi
    FILE=$(basename "$MATCH")
fi

FILEPATH="$TOPIC/solutions/$FILE"
if [ ! -f "$FILEPATH" ]; then
    echo "❌ Error: File $FILEPATH does not exist."
    exit 1
fi

CLASSNAME=$(basename "$FILE" .java)

echo "🛠️ Compiling $FILEPATH ..."
rm -rf /tmp/leetcode-build
mkdir -p /tmp/leetcode-build

javac -d /tmp/leetcode-build "$FILEPATH"
if [ $? -ne 0 ]; then
    echo "❌ Compilation failed."
    exit 1
fi

echo "🚀 Running $CLASSNAME ..."
echo "----------------------------------------"
java -cp /tmp/leetcode-build "_$CLASSNAME"
echo "----------------------------------------"

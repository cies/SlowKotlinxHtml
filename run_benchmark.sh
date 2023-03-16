#!/usr/bin/env bash

printf "Kotlin compiler version: " && grep kotlin.multiplatform build.gradle | cut -d"'" -f4
printf "kotlinx.html version: " && grep kotlinx-html build.gradle | cut -d: -f3 | cut -d'"' -f1

echo "run, realCPU, userCPU, peakMEM"
for i in {0..8}; do
  ./gradlew clean --console=plain --quiet || break;
  /usr/bin/time -f "$i, %E, %U, %M" ./gradlew compileKotlinJvm --console=plain --quiet || break;
done

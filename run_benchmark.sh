#!/usr/bin/env bash

if [[ ! $# -eq 2 ]]; then
  printf "Fatal error: Two arguments are required. The Kotlin version and the kotlinx.html version.\nExample: $0 1.8.0 0.8.0"
  exit 1
fi

printf "Kotlin compiler version: $1\n" 
printf "kotlinx.html version: $2\n"

cp build.gradle.template build.gradle
sed -i "s/KOTLIN_VERSION/$1/" build.gradle
sed -i "s/KOTLINXHTML_VERSION/$2/" build.gradle

printf "\nrun, realCPU, userCPU, peakMEM\n"
for i in {0..8}; do
  ./gradlew clean --console=plain --quiet --no-daemon || break;
  /usr/bin/time -f "$i, %E, %U, %M" ./gradlew compileKotlinJvm --console=plain --quiet --no-daemon || break;
done

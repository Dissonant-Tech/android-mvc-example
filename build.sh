#!/bin/bash

./gradlew assembleDebug && sudo adb install -r build/outputs/apk/PassiveMVCDemo-debug.apk

@echo off
REM Tests with Kotlin
if "%1"=="" goto :paramempty
set OUT=%2
if "%2"=="" SET OUT=%1.out.kl
echo Prueba el caso de prueba: cases\%1 output\%OUT%
kotlin -cp .;classes;lib;%CLASSPATH% kokoslan.kotlin.compile.KoKocKt cases\%1 output\%OUT%
pause
exit
@echo off
REM compila modelo (parser, value, ast y compilador )
rem javac -cp .;classes;lib;%CLASSPATH%  -d classes src/java/parser/*.java src/java/ast/*.java src/java/eval/*.java  src/java/exception/*.java src/java/compiler/*.java 

kotlinc  -cp .;classes;lib;%CLASSPATH% -d classes src/kotlin/ast/*.kt classes src/kotlin/eval/*.kt src/kotlin/exception/*.kt src/kotlin/compiler/*.kt
cls
exit
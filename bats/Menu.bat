@ECHO off
cls
rem Autores:
rem		Alejandro Calderon Acuna
rem		Linsey Garro Le Roy
rem		Angel Gomez Oviedo

:start
cls

ECHO UNIVERSIDAD NACIONAL
ECHO ESCUELA DE INFORMATICA
ECHO CURSO: PARADIGMAS DE PROGRAMACION
ECHO II PROYECTO
ECHO AUTORES: ALEJANDRO C. - LINSEY G. - ANGEL G.
ECHO NOMBRE: KOKOSLAN
ECHO      KOKOSLAN TEST MENU 
ECHO 1. Build Parser
ECHO 2. Build Compiler
ECHO 3. Probar Casos
ECHO 0. Salir

set choice=
set /p choice=Indique la tarea correspondiente:
if not '%choice%'=='' set choice=%choice:~0,1%
if '%choice%'=='1' goto build_parser
if '%choice%'=='2' goto build_compiler
if '%choice%'=='3' goto probar_casos_menu
if '%choice%'=='0' goto OptSalir
ECHO "%choice%" is not valid, try again
ECHO.
goto start

:build_parser
start bats\build_parser.bat
goto start

:build_compiler
start bats\build_compiler.bat
goto start

:probar_casos_menu

cls
ECHO UNIVERSIDAD NACIONAL
ECHO ESCUELA DE INFORMATICA
ECHO CURSO: PARADIGMAS DE PROGRAMACION
ECHO II PROYECTO
ECHO AUTORES: ALEJANDRO C. - LINSEY G. - ANGEL G.
ECHO NOMBRE: KOKOSLAN
ECHO      KOKOSLAN TEST MENU 
ECHO 1. Basics
ECHO 2. Middle
ECHO 3. Advanced
ECHO 0. volver

set choice=
set /p choice=Indique la tarea correspondiente:
if not '%choice%'=='' set choice=%choice:~0,1%
if '%choice%'=='1' goto basics_menu
if '%choice%'=='2' goto middle_menu
if '%choice%'=='3' goto advance_menu
if '%choice%'=='0' goto volver_principal
ECHO "%choice%" is not valid, try again
ECHO.

goto start

:volver_principal
goto start

:basics_menu
cls
ECHO UNIVERSIDAD NACIONAL
ECHO ESCUELA DE INFORMATICA
ECHO CURSO: PARADIGMAS DE PROGRAMACION
ECHO II PROYECTO
ECHO AUTORES: ALEJANDRO C. - LINSEY G. - ANGEL G.
ECHO NOMBRE: KOKOSLAN
ECHO      KOKOSLAN BASICS
ECHO 1. Cases_Closure.kl
ECHO 2. Cases_Formula.kl
ECHO 3. Cases_Formula_Lambda.kl
ECHO 4. Cases_Lambda_Apply.kl
ECHO 5. Cases_Max.kl
ECHO 6. Cases_Xor.kl
ECHO 0. volver

set choice=
set /p choice=Indique la tarea correspondiente:
if not '%choice%'=='' set choice=%choice:~0,1%
if '%choice%'=='1' goto cases_closure
if '%choice%'=='2' goto cases_formula
if '%choice%'=='3' goto cases_formula_lambda
if '%choice%'=='4' goto cases_lambda_apply
if '%choice%'=='5' goto cases_max
if '%choice%'=='6' goto cases_xor
if '%choice%'=='0' goto volver
ECHO "%choice%" is not valid, try again
ECHO.

goto start

:cases_closure
cls
start bats\test_with_kotlin cases_closure.kl
notepad output\cases_closure.kl.out.kl
goto basics_menu

:cases_formula
cls
start bats\test_with_kotlin cases_formula.kl
notepad output\cases_formula.kl.out.kl
goto basics_menu

:cases_formula_lambda
cls
start bats\test_with_kotlin cases_formula_lambda.kl
notepad output\cases_formula_lambda.kl.out.kl
goto basics_menu


:cases_lambda_apply
cls
start bats\test_with_kotlin cases_lambda_apply.kl
notepad output\cases_lambda_apply.kl.out.kl
goto basics_menu

:cases_max
cls
start bats\test_with_kotlin cases_max.kl
notepad output\cases_max.kl.out.kl
goto basics_menu

:cases_xor
cls
start bats\test_with_kotlin cases_xor.kl
notepad output\cases_xor.kl.out.kl
goto basics_menu


:middle_menu
cls
ECHO UNIVERSIDAD NACIONAL
ECHO ESCUELA DE INFORMATICA
ECHO CURSO: PARADIGMAS DE PROGRAMACION
ECHO II PROYECTO
ECHO AUTORES: ALEJANDRO C. - LINSEY G. - ANGEL G.
ECHO NOMBRE: KOKOSLAN
ECHO      KOKOSLAN MIDDLE
ECHO 1. Cases_Car_List_Pat.kl
ECHO 2. Cases_Cdr_List_Pat.kl
ECHO 3. Cases_Cons_First_Rest.kl
ECHO 4. Cases_Fail.kl
ECHO 5. Cases_Insert_List_Pat.kl
ECHO 6. Cases_Length.kl
ECHO 7. Cases_No_Fail.kl
ECHO 8. Cases_Recursive_Dec.kl
ECHO 0. volver

set choice=
set /p choice=Indique la tarea correspondiente:
if not '%choice%'=='' set choice=%choice:~0,1%
if '%choice%'=='1' goto cases_m1
if '%choice%'=='2' goto cases_m2
if '%choice%'=='3' goto cases_m3
if '%choice%'=='4' goto cases_m4
if '%choice%'=='5' goto cases_m5
if '%choice%'=='6' goto cases_m6
if '%choice%'=='7' goto cases_m7
if '%choice%'=='8' goto cases_m8
if '%choice%'=='0' goto volver
ECHO "%choice%" is not valid, try again
ECHO.

goto start

:cases_m1
cls
start bats\test_with_kotlin cases_car_list_pat.kl
notepad output\cases_car_list_pat.kl.out.kl
goto middle_menu

:cases_m2
cls
start bats\test_with_kotlin cases_cdr_list_pat.kl
notepad output\cases_cdr_list_pat.kl.out.kl
goto middle_menu

:cases_m3
cls
start bats\test_with_kotlin cases_cons_first_rest.kl
notepad output\cases_cons_first_rest.kl.out.kl
goto middle_menu


:cases_m4
cls
start bats\test_with_kotlin cases_fail.kl
notepad output\cases_fail.kl.out.kl
goto middle_menu

:cases_m5
cls
start bats\test_with_kotlin cases_insert_list_pat.kl
notepad output\cases_insert_list_pat.kl.out.kl
goto middle_menu

:cases_m6
cls
start bats\test_with_kotlin cases_length.kl
notepad output\cases_length.kl.out.kl
goto middle_menu

:cases_m7
cls
start bats\test_with_kotlin cases_no_fail.kl
notepad output\cases_no_fail.kl.out.kl
goto middle_menu

:cases_m8
cls
start bats\test_with_kotlin cases_recursive_dec.kl
notepad output\cases_recursive_dec.kl.out.kl
goto middle_menu

:advance_menu
cls
ECHO UNIVERSIDAD NACIONAL
ECHO ESCUELA DE INFORMATICA
ECHO CURSO: PARADIGMAS DE PROGRAMACION
ECHO II PROYECTO
ECHO AUTORES: ALEJANDRO C. - LINSEY G. - ANGEL G.
ECHO NOMBRE: KOKOSLAN
ECHO      KOKOSLAN ADVANCED

ECHO 1. Cases_Compose.kl
ECHO 2. Cases_When_Car.kl
ECHO 3. Cases_When_Dec.kl
ECHO 4. Cases_When_Fac.kl
ECHO 5. Cases_When_Length_pat.kl
ECHO 6. Cases_When_Map.kl
ECHO 0. volver

set choice=
set /p choice=Indique la tarea correspondiente:
if not '%choice%'=='' set choice=%choice:~0,1%
if '%choice%'=='1' goto cases_compose
if '%choice%'=='2' goto cases_when_car
if '%choice%'=='3' goto cases_when_dec
if '%choice%'=='4' goto cases_when_fact
if '%choice%'=='5' goto cases_when_length_pat
if '%choice%'=='6' goto cases_when_map
if '%choice%'=='0' goto volver
ECHO "%choice%" is not valid, try again
ECHO.

goto start

:cases_compose
cls
start bats\test_with_kotlin cases_compose.kl
notepad output\cases_compose.kl.out.kl
goto advance_menu

:cases_when_car
cls
start bats\test_with_kotlin cases_when_car.kl
notepad output\cases_when_car.kl.out.kl
goto advance_menu

:cases_when_dec
cls
start bats\test_with_kotlin cases_when_dec.kl
notepad output\cases_when_dec.kl.out.kl
goto advance_menu

:cases_when_fact
cls
start bats\test_with_kotlin cases_when_fact.kl
notepad output\cases_when_fact.kl.out.kl
goto advance_menu

:cases_when_length_pat
cls
start bats\test_with_kotlin cases_when_length_pat.kl
notepad output\cases_when_length_pat.kl.out.kl
goto advance_menu

:cases_when_map
cls
start bats\test_with_kotlin cases_when_map.kl
notepad output\cases_when_map.kl.out.kl
goto advance_menu

:volver
cls
goto probar_casos_menu

:OptSalir
ECHO Sale del programa
goto end

:end

@echo off
cd %USERPROFILE%\Desktop\DAW\ASIGNATURAS\1-PROGRAMACION\JavaCourse\JavaCourse
echo [COMMIT]:
set /p commit=
git status
git add .
git commit -m "%commit%"
git push
pause
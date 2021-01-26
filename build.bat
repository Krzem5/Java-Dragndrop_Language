echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac com/krzem/dragndrop_language/Main.java&&java com/krzem/dragndrop_language/Main
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"


@echo off
cls
if exist build rmdir /s /q build
mkdir build
cd src
javac -d ../build com/krzem/dragndrop_language/Main.java&&jar cvmf ../manifest.mf ../build/dragndrop_language.jar -C ../build *&&goto run
cd ..
goto end
:run
cd ..
pushd "build"
for /D %%D in ("*") do (
	rd /S /Q "%%~D"
)
for %%F in ("*") do (
	if /I not "%%~nxF"=="dragndrop_language.jar" del "%%~F"
)
popd
cls
java -jar build/dragndrop_language.jar
:end

echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac com/krzem/dragndrop_language/Main.java&&java com/krzem/dragndrop_language/Main
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"
set projectpath=E:\Java\TestAntomationProject
cd %projectpath%
set classpah=%projectpath%\bin;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\testng.xml
pause
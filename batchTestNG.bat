set projectLocation=C:\Users\Hoai Quang\workspace\hvnBlackCapProject
cd %projectLocation%
mvn clean install test -DsuiteXmlFile=testng.xml
pause > nul && pause > nul
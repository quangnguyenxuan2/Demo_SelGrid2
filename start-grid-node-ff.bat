cd C:\DevPrograms\SeleniumGrid
java -Dwebdriver.gecko.driver=C:/DevPrograms/BrowserDriver/geckodriver-v0.16.0-win64/geckodriver.exe -jar selenium-server-standalone-3.5.2.jar -port 5557 -role node -hub http://localhost:4444/grid/register -browser "browserName=firefox, maxInstances=10, platform=ANY, seleniumProtocol=WebDriver"

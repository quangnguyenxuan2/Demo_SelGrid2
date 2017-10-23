cd C:\DevPrograms\SeleniumGrid
java -Dwebdriver.ie.driver=C:/DevPrograms/BrowserDriver/IEDriverServer/IEDriverServer_x64_3.6.0/IEDriverServer.exe -jar selenium-server-standalone-3.5.2.jar -port 5555 -role node -hub http://localhost:4444/grid/register -browser "browserName=internet explorer, version=11, platform=WINDOWS, maxInstances=10"

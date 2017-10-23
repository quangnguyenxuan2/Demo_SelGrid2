cd C:\DevPrograms\SeleniumGrid
java -Dwebdriver.chrome.driver=C:/DevPrograms/BrowserDriver/chromedriver_win32_v2.33/chromedriver.exe -jar selenium-server-standalone-3.5.2.jar -port 5556 -role node -hub http://localhost:4444/grid/register -browser "browserName=chrome, version=ANY, maxInstances=10, platform=WINDOWS"

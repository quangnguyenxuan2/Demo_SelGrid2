package BetaTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test_Selenium_Grid {

	//public static WebDriver driver;
	String baseURL;
	String nodeURL_FF;
	String nodeURL_Chrome;
	String nodeURL_IE;
	
	@Parameters("browser")
	@BeforeTest
	public void Launch_App(String browser) throws Exception{
		DesiredCapabilities caps = null;
		RemoteWebDriver Driver = null;
		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Executing on firefox");
			String node = "http://40.71.254.60:5557/wd/hub";
			caps = new DesiredCapabilities();
			caps.setBrowserName("firefox");
			Driver = new RemoteWebDriver(new URL(node), caps);
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.navigate().to("https://angularjs.org/");

		}
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Executing on chrome");
			String node = "http://40.71.254.60:5556/wd/hub";
			caps = new DesiredCapabilities();
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);
			Driver = new RemoteWebDriver(new URL(node), caps);
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.navigate().to("https://angularjs.org/");
		}
		if(browser.equalsIgnoreCase("ie")){
			System.out.println("Executing on internet explorer");
			String node = "http://40.71.254.60:5555/wd/hub";
			caps = new DesiredCapabilities();
			caps.setBrowserName("internet explorer");
			caps.setPlatform(Platform.WINDOWS);
			caps.setVersion("11");
			Driver = new RemoteWebDriver(new URL(node), caps);
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.navigate().to("https://angularjs.org/");
		}
		
		System.out.println("Launch app process is completed");

	}
	
	@Test
	public Test_Selenium_Grid() throws Exception{

		System.out.println("Test process is completed");
		
		
	}
}

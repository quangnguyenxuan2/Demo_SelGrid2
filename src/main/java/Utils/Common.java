package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {

	public final WebDriver driver;
	
	public Common(WebDriver driver){
		this.driver = driver;
	}
	
	public void WaitForLoad(int timeoutSec)
	{        
	    WebDriverWait wait = new WebDriverWait(driver, timeoutSec );
	    wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));           
	}
}

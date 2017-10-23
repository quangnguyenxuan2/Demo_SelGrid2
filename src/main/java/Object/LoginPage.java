package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private final WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	By txt_username = By.id("UserName");
	By txt_password = By.id("Password");
	By chk_remember = By.id("RememberLogin");
	By btn_login = By.xpath(".//*[@id='page-container']/div/form/div[2]/button");
	By lnk_forgotpwd = By.xpath(".//*[@id='page-container']/div/form/div[1]/fieldset[2]/div/div[2]/a");
	By lnk_signupnow = By.xpath(".//*[@id='page-container']/div/form/div[2]/p/a");
	By msg_errormsg = By.xpath(".//*[@id='page-container']/div/form/div[1]/div/ul/li");
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean IsCorrectedPage() {
		String pageTitle = "Log in - Blackcap";
		return getPageTitle().contains(pageTitle);
	}

	
	public UserProfilePage LoginAsValidAccount(String username, String password) throws InterruptedException{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		Thread.sleep(5000);
		return new UserProfilePage(driver);
		
	}
	
	public LoginPage LoginAsInvalidAccount(String username, String password) throws InterruptedException{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		Thread.sleep(3000);
		return this;		
	}
	
	public String getErrorMessage(){
		String strErrorMessage = null;
		WebElement errorMessage  = driver.findElement(msg_errormsg);
		if (errorMessage.isDisplayed())
			strErrorMessage = errorMessage.getText();
		return strErrorMessage;
	}
}

package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private final WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	By btn_signup = By.xpath(".//*[@id='widget-home-banner-item-1']/div/a[1]");
	By btn_login = By.xpath(".//*[@id='widget-home-banner-item-1']/div/a[2]");
	By img_banner = By.xpath(".//*[@id='widget-home-banner-item-1']/div/img");
	
	public AgreementPage ClickSignUpBtn() throws Exception{
		driver.findElement(btn_signup).click();
		Thread.sleep(3000);
		return new AgreementPage(driver);
	}
	
	public LoginPage ClickLoginBtn() throws Exception{
		driver.findElement(btn_login).click();
		Thread.sleep(3000);
		return new LoginPage(driver);
	}
	
	
	
}

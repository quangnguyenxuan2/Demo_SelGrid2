package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	private final WebDriver driver;
	
	public SignUpPage(WebDriver driver){
		this.driver = driver;
	}
	
	By btn_disagree = By.xpath(".//*[@id='agreement']/button[1]");
	By btn_agree = By.xpath(".//*[@id='agreement']/button[2]");
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}	
	public boolean IsCorrectedPage() {
		String pageTitle = "Sign Up - Blackcap";
		return getPageTitle().contains(pageTitle);
	}
	
	public HomePage ClickDisagree(){
		driver.findElement(btn_disagree).click();
		return new HomePage(driver);
	}
	
	public SignUpPage ClickAgree(){
		driver.findElement(btn_agree).click();
		return new SignUpPage(driver);
	}
}

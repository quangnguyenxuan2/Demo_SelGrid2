package Object;

import org.openqa.selenium.WebDriver;

public class UserProfilePage {

	private final WebDriver driver;
	
	public UserProfilePage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean IsCorrectedPage() {
		String pageTitle = "Blackcap";
		return getPageTitle().contains(pageTitle);
	}
	
	
	
	
	
}

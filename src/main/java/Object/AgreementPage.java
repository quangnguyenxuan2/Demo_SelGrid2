package Object;

import org.openqa.selenium.WebDriver;

public class AgreementPage {

	private final WebDriver driver;
	
	public AgreementPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean IsCorrectedPage() {
		String pageTitle = "Agreement - Blackcap";
		return getPageTitle().contains(pageTitle);
	}
}

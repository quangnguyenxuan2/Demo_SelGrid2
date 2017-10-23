package Global;

import org.openqa.selenium.WebDriver;

public class Constant {

	public static WebDriver driver;
	public static String URL_Root = "https://blackcap-uat.azurewebsites.net";
	public static String URL_Login = "https://blackcap-uat-api.azurewebsites.net/account/login?returnUrl=%2Fconnect%2Fauthorize%2Flogin%3Fclient_id%3D0009cc9a75484f81975e9728417cb005%26redirect_uri%3Dhttps%253A%252F%252Fblackcap-uat.azurewebsites.net%252Fauth.html%26response_type%3Did_token%2520token%26scope%3Dopenid%2520profile%2520stepone_api_accountmanagement%26state%3D4753ae1a2022465d84434b077a3685d8%26nonce%3Db69d825e361045a6bedb22edacc44d7d";
	public static String localPath = "C:\\SeleniumTemp";
}

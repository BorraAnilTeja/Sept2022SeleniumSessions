package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtils brwutil = new BrowserUtils();
		WebDriver driver = brwutil.launchBrowser("chrome");
		brwutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brwutil.getPageTitle());
		
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.dosendKeys(emailID, "anilteja72@gmail.com");
		eleutil.dosendKeys(password, "Anil@9465");
		
		brwutil.quitBrowser();
	}

}

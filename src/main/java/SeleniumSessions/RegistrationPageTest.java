package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) {


		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By first_Name = By.id("input-firstname");
		By last_Name = By.id("input-lastname");
		By email_ID = By.id("input-email");
		By tele_ph = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwd_cnfm = By.id("input-confirm");
		By checkbox = By.name("agree");
		By cntinue = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By acntregistered = By.tagName("h1");
		
		


		ElementUtilPR eleUtil = new ElementUtilPR(driver);
		eleUtil.dosendKeys(first_Name, "anil");
		eleUtil.dosendKeys(last_Name, "teja");
		eleUtil.dosendKeys(email_ID, "zxndkasn@gmail.com");
		eleUtil.dosendKeys(tele_ph, "9177474609");
		eleUtil.dosendKeys(pwd, "anil@12345");
		eleUtil.dosendKeys(pwd_cnfm, "anil@12345");
		eleUtil.doClick(checkbox);
		eleUtil.doClick(cntinue);
		String Header = eleUtil.doGetElementText(acntregistered);
		
		System.out.println("After registration....." + Header);
		
		if(Header.contains("Created")) {
			System.out.println("Registered successfully");
		}
		else {
			System.out.println("Not registered");
		}
		

		//brUtil.quitBrowser();
		
	}

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtilPR eleutil = new ElementUtilPR(driver);
		//1.ID - Unique attribute
		
//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.dosendKeys(emailID, "anilteja72@gmail.com");
//		eleutil.dosendKeys(password, "Anil@9465");
		
		//2.name- can be duplicate
//		By emailID = By.name("email");
//		eleutil.dosendKeys(emailID, "anilteja72@gmail.com");
		
		//3.class name - can be duplicate
//		By emailID = By.className("form-control");
//		eleutil.dosendKeys(emailID, "anilteja72@gmail.com");
		
		//4.xpath - not an attribute....address of the web element
//		By emailID = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
//		eleutil.dosendKeys(emailID, "anilteja72@gmail.com");
//		eleutil.dosendKeys(password, "Anil@9465");
//		eleutil.doClick(loginBtn);
		
		//5. CSS selector - not an attribute
//		By emailID = By.cssSelector("#input-email");
//		eleutil.dosendKeys(emailID, "anilteja72@gmail.com");
		
		//6.linktext-only for links
		By reglink = By.linkText("Register");
		eleutil.doClick(reglink);
		
		//7.partial link text - can be duplicate
		
		By registerlink = By.partialLinkText("Forgotten");
		eleutil.doClick(registerlink);
		
		//8.tagName -HTML tag name
		
		By newcust = By.tagName("h2");
		eleutil.doGetElementText(newcust);
		
		
		//brUtil.quitBrowser();

		
	}
	

}

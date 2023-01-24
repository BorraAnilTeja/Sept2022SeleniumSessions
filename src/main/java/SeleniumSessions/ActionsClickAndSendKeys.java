package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emaildId = By.id("input-email");
		By passWord = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(emaildId), "anil123@gmail.com").build().perform();
//		act.sendKeys(driver.findElement(passWord), "anil@123").build().perform();
//		act.click(driver.findElement(loginBtn)).build().perform();
		
		doActionsSendKeys(emaildId,"anil@gmail.com");
		doActionsSendKeys(passWord,"anil@123");
		doActionsClick(loginBtn);

		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();

	}

}

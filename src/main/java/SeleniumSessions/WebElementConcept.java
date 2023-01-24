package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("anilteja72@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Anil@9465");

		//2.
//		WebElement emailID = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailID.sendKeys("anilteja72@gmail.com");
//		password.sendKeys("Anil@9465");
		
		//3.By locator approach
//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
//		WebElement email_ele = driver.findElement(emailID);
//		WebElement pwd_ele = driver.findElement(password);
//		email_ele.sendKeys("anilteja72@gmail.com");
//		pwd_ele.sendKeys("Anil@9465");
		
		//4.By locator + generic function -getElement()
		
//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailID).sendKeys("anilteja72@gmail.com");
//		getElement(password).sendKeys("Anil@9465");
		
		//5.By locator + generic function -getElement() + action methods
//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
//		
//		dosendKeys(emailID,"anilteja72@gmail.com");
//		dosendKeys(password,"Anil@9465");
		
		//6.By locator + generic function -getElement() + action methods in util class
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.dosendKeys(emailID, "anilteja72@gmail.com");
		eleutil.dosendKeys(password, "Anil@9465");
		
		//7.create a separate generic element util class and loginpage test class with main() method
		


	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void dosendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

}

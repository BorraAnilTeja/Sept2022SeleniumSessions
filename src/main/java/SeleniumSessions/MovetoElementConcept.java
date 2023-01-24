package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		selectSubMenu("a","Laptops & Notebooks","Macs (0)");
		
	
		
		
		
	}public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void selectSubMenu(String htmltag,String parentMenu,String childMenu) throws InterruptedException {
		
		By parentMenulocator = By.xpath("//"+htmltag+"[text()='"+parentMenu+"']");
		By childMenulocator = By.xpath("//"+htmltag+"[text()='"+childMenu+"']");

		
	WebElement parentMenuElement =  getElement(parentMenulocator);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(parentMenuElement).build().perform();
		
		Thread.sleep(2000);
		
		doClick(childMenulocator);
		
		
	}

}

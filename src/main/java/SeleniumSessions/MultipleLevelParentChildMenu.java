package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelParentChildMenu {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By parentMenu = By.xpath("//a[@qa='categoryDD']");
	
		selectLevel4MenuItem(parentMenu,"a","Beverages","Tea","Green Tea");

		
	}
	public static void selectLevel4MenuItem(By ParentMenuLocator,String htmltag,String level1Menu,String level2Menu,String level3Menu) throws InterruptedException {

		WebElement parentLocator =driver.findElement(ParentMenuLocator);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(parentLocator).build().perform();
		
		Thread.sleep(2000);
		
		WebElement level1Locator = driver.findElement(By.xpath("(//"+htmltag+"[text()='"+level1Menu+"'])[2]"));
		act.moveToElement(level1Locator).build().perform();
		Thread.sleep(2000);

		WebElement level2Locator = driver.findElement(By.xpath("(//"+htmltag+"[text()='"+level2Menu+"'])[2]"));
		act.moveToElement(level2Locator).build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//"+htmltag+"[text()='"+level3Menu+"'])[2]")).click();
	}

}

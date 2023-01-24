package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindowConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		By lnkdIn = By.xpath("//a[contains(@href,'linkedin')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(lnkdIn)).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> handle1 =driver.getWindowHandles();
		Iterator<String> it =handle1.iterator();
		
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowID);
	}

}

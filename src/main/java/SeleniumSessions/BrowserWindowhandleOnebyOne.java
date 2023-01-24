package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandleOnebyOne {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		//1
		WebElement lnkdIn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		lnkdIn.click();
		
		Set<String> handle1 =driver.getWindowHandles();
		Iterator<String> it =handle1.iterator();
		
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowID);
		
		//2
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		fbEle.click();
		
		Set<String> handle2 =driver.getWindowHandles();
		Iterator<String> it2 =handle2.iterator();
		
		 parentWindowID = it2.next();
		 childWindowID = it2.next();
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowID);


	}

}

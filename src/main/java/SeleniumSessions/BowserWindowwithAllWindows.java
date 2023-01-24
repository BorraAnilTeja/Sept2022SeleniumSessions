package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BowserWindowwithAllWindows {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		WebElement lnkdIn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		lnkdIn.click();
		fbEle.click();
		twEle.click();
		ytEle.click();
		
	String parentWindowID =	driver.getWindowHandle();
		
		Set<String> links =driver.getWindowHandles();
		Iterator<String> it =links.iterator();
		
		while(it.hasNext()) {
			String WindowId = it.next();	
			driver.switchTo().window(WindowId);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(!(WindowId.equals(parentWindowID))) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowID);

	}

}

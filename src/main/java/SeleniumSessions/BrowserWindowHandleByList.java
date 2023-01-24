package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleByList {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		WebElement lnkdIn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		lnkdIn.click();
		
		Set<String> handle1 =driver.getWindowHandles();
		
		List<String> list = new ArrayList<String>(handle1);
		
		String PWID =list.get(0);
		String CWID = list.get(1);
		
		driver.switchTo().window(CWID);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(PWID);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}

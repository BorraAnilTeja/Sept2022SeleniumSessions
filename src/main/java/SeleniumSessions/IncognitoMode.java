package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		

		driver.get("https://classic.crmpro.com/index.html");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("borraanil");
		driver.findElement(By.name("password")).sendKeys("anil@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		System.out.println(driver.getTitle());
	}

}

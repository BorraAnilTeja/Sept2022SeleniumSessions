package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathWebTablePR {
static WebDriver driver;
	public static void main(String[] args) {


		 driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("borraanil");
		driver.findElement(By.name("password")).sendKeys("anil@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='rani mb']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
         System.out.println(getUserCompanyName("rani mb"));
         System.out.println(getUserPhNmbr("rani mb"));
         System.out.println(getUserEmail("rani mb"));


	}
	public static String getUserCompanyName(String username) {
		return driver
	    .findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	public static String getUserPhNmbr(String username) {
		return driver
	    .findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td/span[@context='phone'])[3]")).getText();
	}
	public static String getUserEmail(String username) {
		return driver
	    .findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[contains(@href,'mailto')]")).getText();
	}
}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FrameHandlingWithActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("borraanil");
		driver.findElement(By.name("password")).sendKeys("anil@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.linkText("New Contact"))).build().perform();
		
		driver.findElement(By.id("first_name")).sendKeys("anilteja");
		WebElement title = driver.findElement(By.name("title"));
		Select select = new Select(title);
		select.selectByVisibleText("Mr.");
		driver.findElement(By.id("image_file")).sendKeys("C:\\Users\\anilt\\OneDrive\\Desktop\\my pics\\ALM03173 (1).JPG");
		Thread.sleep(2000);
		driver.quit();
	}

}

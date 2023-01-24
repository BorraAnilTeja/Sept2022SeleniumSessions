package testNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageASTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	@Test
	public void registerTest() {
		driver.findElement(By.name("firstname")).sendKeys("Anil");
		driver.findElement(By.name("lastname")).sendKeys("teja");
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9177474695");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.name("confirm")).sendKeys("test@123");
		driver.findElement(By.name("agree")).click();



	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

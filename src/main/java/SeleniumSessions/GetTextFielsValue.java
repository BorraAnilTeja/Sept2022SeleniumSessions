package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFielsValue {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailID = driver.findElement(By.name("email"));
		emailID.sendKeys("anilteja72@gmail.com");
		
		//to get the value   which we entered
		String val = emailID.getAttribute("value");
		System.out.println(val);
		
		
	}

}

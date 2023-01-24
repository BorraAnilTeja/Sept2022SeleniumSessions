package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame-one748593425");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("Ap21CC1347");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Log in")).click();
		
	
	}

}

package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {

	 driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	
	Alert JSalert = driver.switchTo().alert();
	
	String text = JSalert.getText();
	System.out.println(text);
	JSalert.accept();
	//------------------------------------------------------------------//
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	
    Alert JSconfirmalert = driver.switchTo().alert();
	
	String Confirmtext = JSconfirmalert.getText();
	System.out.println(Confirmtext);
	JSconfirmalert.dismiss();

	//-----------------------------------------------------------//
 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	
	Alert JSprompt = driver.switchTo().alert();
	
	String prompttext = JSprompt.getText();
	System.out.println(prompttext);
	Thread.sleep(3000);

	JSprompt.sendKeys("12345");
	
	
	JSprompt.accept();
	}

}

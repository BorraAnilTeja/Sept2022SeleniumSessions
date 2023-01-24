package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTitleURLAlerts {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
			
		
//		System.out.println(alert.getText());
//		alert.accept();
//		//1.title of the page
//	    String actTitle =	waitForTitleContains("Register",10);
//	    System.out.println(actTitle);
		
		//URL of the page
//		String url =waitForURLContains("jobs",5);
//		System.out.println(url);
//		
//	String actUrl =	waitForUrlTobe("https://www.amazon.jobs/en/",5);
//	System.out.println(actUrl);
//		
		
		
		
	}	
	public static String waitForTitleContains(String titleFractionValue,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleContains(titleFractionValue))) {
			return driver.getTitle();
		}
		else {
			System.out.println("Expected title is not visible");
			return null;
		}
	}
	public static String waitForTitleIs(String actTitle,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(actTitle))) {
			return driver.getTitle();
		}
		else {
			System.out.println("Expected title is not visible");
			return null;
	}
	}
	public static String waitForURLContains(String UrlFractionValue,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlContains(UrlFractionValue))) {
			return driver.getCurrentUrl();
		}
		else {
			System.out.println("Expected Url is not visible");
			return null;
		}
	}
	public static String waitForUrlTobe(String UrlValue,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlToBe(UrlValue))) {
			return driver.getCurrentUrl();
		}
		else {
			System.out.println("Expected Url is not visible");
			return null;
		}
	}
	public static Alert waitForAlertIsPresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static String getAlertText(int timeout) {
		return waitForAlertIsPresent(timeout).getText();
	}
	public static void acceptAlert(int timeout) {
		 waitForAlertIsPresent(timeout).accept();
	}
	public static void dismissAlert(int timeout) {
		 waitForAlertIsPresent(timeout).dismiss();
	}
	public static void AlertSendKeys(String msg, int timeout) {
		 waitForAlertIsPresent(timeout).sendKeys(msg);
	}
	
}
	
	



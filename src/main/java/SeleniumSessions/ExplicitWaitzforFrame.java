package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitzforFrame {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//waitForFramePresentAndSwitch(2,5);
		
	// waitForFramePresentAndSwitch( driver.findElement(By.xpath("(//a[text()='Home'])[1]")),5)	;
		
		//waitForFramePresentAndSwitch(By.linkText("Home"),5);
		waitForFramePresentAndSwitch("main",5);
		

	}
	public static void waitForFramePresentAndSwitch(int frameIndex,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		
	}
	public static void waitForFramePresentAndSwitch(By framelocator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
	public static void waitForFramePresentAndSwitch(WebElement frameElement,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	public static void waitForFramePresentAndSwitch(String nameOrID, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrID));
	}
	
}

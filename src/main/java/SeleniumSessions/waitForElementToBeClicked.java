package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForElementToBeClicked {
static WebDriver driver;
	public static void main(String[] args) {

         driver = new ChromeDriver();
        
        driver.get("https://classic.freecrm.com/index.html?e=1");
        
        By forgotPwd =By.linkText("Forgot Password?");
        clickElementWhenReady(forgotPwd,5);
//        
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot Password?"))).click();
	}
	public static void clickElementWhenReady(By locator,int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.elementToBeClickable(locator)).click(); 
	}

}

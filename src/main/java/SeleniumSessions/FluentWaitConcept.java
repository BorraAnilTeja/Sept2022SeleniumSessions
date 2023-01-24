package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {

         driver = new ChromeDriver();
        
        driver.get("https://classic.freecrm.com/index.html?e=1");
        By forgotPwd =By.linkText("Forgot Password?");
        
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//        		               .withTimeout(Duration.ofSeconds(10))
//        		               .pollingEvery(Duration.ofSeconds(2))
//        		               .ignoring(ElementNotInteractableException.class)
//        		               .ignoring(NoSuchElementException.class)
//        		               .ignoring(StaleElementReferenceException.class)
//        		               .withMessage("Element not found....");
//    WebElement ele =    wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPwd));
//    ele.click();
       // waitForElementToBeVisibleWithFluentWait(forgotPwd,10,2).click();
        waitForElementToBeVisible(forgotPwd,10,2).click();		               
        
	}
	public static WebElement waitForElementToBeVisibleWithFluentWait(By locator,int timeOut,int intervalTime) {
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	               .withTimeout(Duration.ofSeconds(timeOut))
	               .pollingEvery(Duration.ofSeconds(intervalTime))
	               .ignoring(ElementNotInteractableException.class)
	               .ignoring(NoSuchElementException.class)
	               .ignoring(StaleElementReferenceException.class)
	               .withMessage("Element not found....");
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static WebElement waitForElementToBeVisible(By locator,int timeOut,int intervalTime) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut),Duration.ofSeconds(intervalTime));
		  wait.ignoring(ElementNotInteractableException.class);
		  wait.ignoring(NoSuchElementException.class);
		  wait.ignoring(StaleElementReferenceException.class);
		  wait.withMessage("Element not found....");
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}
}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {
 static WebDriver driver;
	public static void main(String[] args) {

        driver = new ChromeDriver();	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	    By search = By.name("search");
	    By logo = By.xpath("//img[@title='naveenopencart']");
	    
	   // if(doIsDisplayed(search)) {System.out.println("PASS");}
	    //if(doIsDisplayed(logo)) {System.out.println("PASS");}
	    
	    if(isSingleElementExist(search)) {System.out.println("Element is displayed");}
	    if(isSingleElementExist(logo)) {System.out.println("Element is displayed");}
	    if(isMultipleElementExist(logo)) {System.out.println("Element is displayed");}

	    if(isMultipleElementExist(logo,5)) {System.out.println("Element is displayed");}
	    else {
	    	System.out.println("FAIL");
	    }

	    
	    
	    
	}
	public static boolean isSingleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element==="+ actCount);
		if(actCount==1) {
			return true;	
		}
		return false;
	}
	
	public static boolean isTwoElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element==="+ actCount);
		if(actCount==2) {
			return true;	
		}
		return false;
	}
	public static boolean isMultipleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element==="+ actCount);
		if(actCount>1) {
			return true;	
		}
		return false;
	}
	public static boolean isMultipleElementExist(By locator,int expectedElementCount) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element==="+ actCount);
		if(actCount==expectedElementCount) {
			return true;	
		}
		return false;
	}
	public static List<WebElement> getElements(By locator) {
		 return driver.findElements(locator);
	}

	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}

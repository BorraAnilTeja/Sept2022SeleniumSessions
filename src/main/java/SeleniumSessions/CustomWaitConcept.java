package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator,int timeOut) {
		
		WebElement element  = null;
		int attempts = 0;
		
		while(attempts<timeOut) {
			try {
			element = getElement(locator);
			System.out.println("element is found in attempt :"+attempts);
			break;
			}catch(NoSuchElementException e) {
				System.out.println("Element is not found in attempt :"+attempts+ "for"+ locator);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}				
			}			
			attempts++;
		}	
	    if(element==null) {		
		    System.out.println("Element is not found..tried for attempts: "+ timeOut +" secs"+"with the interval of 500milli sec");	
	        	throw new FrameworkException("TimeOutException");
	}
	return element;
}
public static WebElement retryingElement(By locator,int timeOut,int intervaltime) {
		
		WebElement element  = null;
		int attempts = 0;
		
		while(attempts<timeOut) {
			try {
			element = getElement(locator);
			System.out.println("element is found in attempt :"+attempts);
			break;
			}catch(NoSuchElementException e) {
				System.out.println("Element is not found in attempt :"+attempts+ "for"+ locator);
					try {
						Thread.sleep(intervaltime*1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}				
			}			
			attempts++;
		}	
	    if(element==null) {		
		    System.out.println("Element is not found..tried for attempts: "+ timeOut +" secs"+"with the interval time of secs"+intervaltime);	
	        	throw new FrameworkException("TimeOutException");
	}
	return element;
}
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		By firstName = By.name("first_name111");
		//retryingElement(firstName, 20).sendKeys("Naveen");
		retryingElement(firstName, 10, 2).sendKeys("Naveen");

		
	}

	}


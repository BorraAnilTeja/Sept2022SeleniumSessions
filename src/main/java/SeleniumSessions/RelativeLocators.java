package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		
	      WebElement ele=	driver.findElement(By.linkText("Vernon, Canada"));
	
	     //right of ele
	    
	String RightEle =	driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(RightEle);
	
	//left of ele
	
	String leftEle = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftEle);
	
	//above ele
	
	String aboveEle = driver.findElement(with(By.tagName("p")).above(ele)).getText();
	System.out.println(aboveEle);
	
	//below ele
	String belowEle = driver.findElement(with(By.tagName("p")).below(ele)).getText();
	System.out.println(belowEle);
	
	//near ele
	String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getText();
	System.out.println(nearEle);
	
	
	
	
	
	
	
	
	
	}

}

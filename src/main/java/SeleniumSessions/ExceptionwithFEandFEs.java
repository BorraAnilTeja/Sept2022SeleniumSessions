package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionwithFEandFEs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		
		//if id is given wrong for FE .... type of exception we get is....
		//driver.findElement(By.id("twotabsearchtextbo")).sendKeys("laptops");//NoSuchElementException
		
		//List<WebElement> linksList = driver.findElements(By.tagName("a"));
		//if you give wrong tagname is FEs- you get empty list you dont get any exception
		
		//List<WebElement> linksList = driver.findElements(By.tagName("asdddfb"));
		
		//if xpath sytax is given wrong you will get InvalidSelectorException
		
		List<WebElement> linksList = driver.findElements(By.xpath("//input[@@@@@@id======'fghjkl']/asdddfb")); 


		System.out.println("total links :"+ linksList.size());
		
		
	}

}

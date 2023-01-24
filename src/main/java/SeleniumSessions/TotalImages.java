package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imageslist = driver.findElements(By.tagName("img"));
		
		System.out.println("total images :"+imageslist.size());
		
		//print src,alt,height of each image 
		int count = 1;
		for(WebElement e : imageslist) {
			String srcVal =  e.getAttribute("src");
			String altVal =  e.getAttribute("alt");
			String heightVal =  e.getAttribute("height");
			
			System.out.println(count +" = " +srcVal + " | | "+altVal+" | | "+heightVal);
			}count++;
		
	}

}

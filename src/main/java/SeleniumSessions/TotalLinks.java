package SeleniumSessions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		int count =0;
		for(WebElement e :linkslist) {
			String text = e.getText();
			if(!(text.length()==0)) {
				System.out.println(count +"="+text);
			}
			count++;
		}
	}

}

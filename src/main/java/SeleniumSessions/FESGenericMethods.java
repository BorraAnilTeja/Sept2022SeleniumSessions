package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FESGenericMethods {
    static  WebDriver driver ;
	public static void main(String[] args) {

         driver = new ChromeDriver();
		 driver.get("https://freshworks.com/");
		By footerLinks = By.xpath("//div[contains(@class,'footer-left-section')]//a");
		int actualFooterCount = totalElementsCount(footerLinks);
		if(actualFooterCount==21) {System.out.println("footer count ....pass");}
		
		List<String>  actualEleList = getElementsTextList(footerLinks);
		System.out.println(actualEleList);
		
		if(actualEleList.contains("Leadership")) {System.out.println("PASS");}
		if(actualEleList.contains("Investors")) {System.out.println("PASS");}
		if(actualEleList.contains("Affiliates")) {System.out.println("PASS");}

		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int totalElementsCount(By locator) {
		return getElements(locator).size();
	}
		
		public static List<String> getElementsTextList(By locator) {
		
		List<WebElement> footerList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e:footerList) {
			String text = e.getText();
			  eleTextList.add(text);
		}
		return eleTextList;

	}

}

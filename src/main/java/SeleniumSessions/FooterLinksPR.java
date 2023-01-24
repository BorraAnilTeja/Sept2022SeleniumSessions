package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksPR {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		By footerLinks = By.xpath("//div[contains(@class,'footer-copyrights')]//a");
		int actfooterLinkCount = totalElementCount(footerLinks);
		if(actfooterLinkCount==7) {System.out.println("footer count-----PASS");}
		
		List<String> actualElementList = getElementsLinkText(footerLinks);
		System.out.println(actualElementList);
		
		if(actualElementList.contains("Security")) {System.out.println("PASS");}
		if(actualElementList.contains("Unsubscribe")) {System.out.println("PASS");}
		if(actualElementList.contains("Takedown Policy")) {System.out.println("PASS");}


		
		
		}
	
	public static List<WebElement> getElements(By locator) {
		 return driver.findElements(locator);
	}
	public static int totalElementCount(By locator) {
		return getElements(locator).size();
	}
		
		public static List<String> getElementsLinkText(By locator) {
			List<WebElement> footerLinks = getElements(locator);
			List<String> eleTextList = new ArrayList<String>();
			for(WebElement e:footerLinks) {
				String text = e.getText();
				eleTextList.add(text);

		}
			return eleTextList;
	}

}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GogleLanguageLinks {
static WebDriver driver ;
	public static void main(String[] args) {


         driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		By langlocator = By.xpath("//div[@id='SIvCob']/a");
		
		ElementUtilPR eleUtil = new ElementUtilPR(driver);
		
		
		eleUtil.doClickOnElement(langlocator,"తెలుగు");
		
		
		By footerlinks = By.xpath("//div[@class='KxwPGc AghGtd']/a");
		//ElementUtilPR eleUtil = new ElementUtilPR(driver);
		eleUtil.doClickOnElement(footerlinks, "పరిచయం");
		
			}
	
//			public static void doClickOnElement(By locator , String linkText) {
//				List<WebElement> langList = driver.findElements(locator);
//				
//				System.out.println("total languages :"+langList.size());
//				
//				for(WebElement e :langList) {
//					String text =e.getText();
//					
//					System.out.println(text);
//					
//					if(text.contains("తెలుగు")) {
//						e.click();
//						break;
				
			
		}
	



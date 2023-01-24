package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitForPageLoadConcept {
	
	static WebDriver driver;
	
	public static void waitForPageLoad(int timeOut) {
		long endTime = System.currentTimeMillis()+ timeOut ;
		while(System.currentTimeMillis()<endTime) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String pageState = js.executeScript("return document.readyState").toString();
			
			if(pageState.equals("complete")) {
				System.out.println("Page DOM is fully loaded now...");
				break;
			}
		}
	}
	

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com/pricing.html");
		waitForPageLoad(10);


	}

}

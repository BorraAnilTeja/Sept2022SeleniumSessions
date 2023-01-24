package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
//		String hrefval = driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
//		String ariaval = driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");
//		
//		System.out.println(hrefval);
//		System.out.println(ariaval);
		
		By logo = By.id("nav-logo-sprites");
		By search = By.id("nav-search-submit-button");
		
		ElementUtilPR eleutil = new ElementUtilPR(driver);
		String hrefVal= eleutil.dogetAttribute(logo, "href");
		String ariaVal = eleutil.dogetAttribute(search, "aria-label");
		
		System.out.println(hrefVal);
		System.out.println(ariaVal);

	}
	

}

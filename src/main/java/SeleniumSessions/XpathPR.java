package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPR {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//1.
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptops");
		driver.findElement(By.xpath("(//a[contains(@href,'logo')])[1]")).click();
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement label =driver.findElement(By.xpath("//input[@id='input-email']/preceding-sibling::label"));
		System.out.println(label.getText());
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> List = driver.findElements(By.xpath("//div[text()='Get to Know Us']/following-sibling::ul//a"));
		
	for(WebElement e : List) {
		String text = e.getText();
		System.out.println(text);
		
List<WebElement> headerlist = driver.findElements(By.xpath("//div[contains(@class,'navFooterLinkCol navAccessibility')]/div"));
		
		for(WebElement e1 : headerlist) {
			String headertext = e1.getText();
			System.out.println(headertext);
		
		
		List<WebElement> footerlist = driver.findElements(By.xpath("//div[contains(@class,'navFooterLinkCol navAccessibility')]/child::div/following-sibling::ul//a"));
		
		for(WebElement e2 : footerlist) {
			String footertext = e2.getText();
			System.out.println(footertext);
			
			driver.get("https://selectorshub.com/xpath-practice-page/");
			driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td//input[@type='checkbox']")).click();
			
		
	}
		
	}
	}
}
}


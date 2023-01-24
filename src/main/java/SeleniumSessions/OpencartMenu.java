package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpencartMenu {

	public static void main(String[] args) {

          WebDriver driver = new ChromeDriver();
          driver.get("https://naveenautomationlabs.com/opencart/");
        List<WebElement> menuItems = driver.findElements(By.xpath("//ul[contains(@class,'navbar-nav')]//a"));
        Actions act = new Actions(driver);
        for(WebElement e :menuItems ) {
        	act.moveToElement(e).build().perform();
        	System.out.println(e.getText());
        	
        }
	}

}

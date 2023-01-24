package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalValuesInSelectDropDown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		Thread.sleep(3000);
		By country =By.id("Form_getForm_Country");
		
		doSelectDropDownValue(country ,"Canada");
	
	}
	public static WebElement getElement(By locator) {
				return driver.findElement(locator);
	}
    public static void doSelectDropDownValue(By locator,String value) {
				Select select = new Select(getElement(locator));

         	List<WebElement> optionslist = select.getOptions();
	
           	System.out.println(optionslist.size());
	
	                for(WebElement e :optionslist) {
		              String text = e.getText();
		                System.out.println(text);
		                  if(text.equals(value)) {
			                e.click();
			                  break;
			
		}
		
		
	}

}
}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		By choice = By.xpath("//span[@class='comboTreeItemTitle']");
		
		//1.for selecting single choice from choicelist
		//selectChoice(choice,"choice 1");
		
		
		//2.selecting multiple choices
		//selectChoice(choice,"choice 1","choice 6","choice 7");
		
		//3.for selecting all choices
		//selectChoice(choice,"ALL");
		
		//4.no choice 
		//selectChoice(choice,"choice 9");
		}
		
		
		
		
		
		
	/**
	 * this method is handling single,multiple and all choices selection
	 * this method is also handling if there is no choice
	 * please pass the choices which are present in case of multiple choices
	 * please pass "all" in case of selecting all choices
	 * @param locator
	 * @param choice
	 */
		
		
	public static void selectChoice(By locator,String... choice) {
		List<WebElement> choicelist =driver.findElements(locator);
		System.out.println(choicelist.size());
		
		boolean flag= false;
		if(!choice[0].equalsIgnoreCase("all")) {
			
            for(WebElement e : choicelist) {
			String text =e.getText();
			//System.out.println(text);
			
			for(int i=0;i<choice.length;i++) {
			
			if(text.equals(choice[i])) {
				flag= true;
				e.click();
				break;
			}
			}
            }
		}
            else {
            	try {
            	for(WebElement e:choicelist) {
            		e.click();
            	}
            	}catch(Exception e) {
            		
            	}
            }
		if(flag==false) {
			System.out.println("choice not found....");
		}
	}
	
	}



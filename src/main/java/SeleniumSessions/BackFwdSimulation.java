package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackFwdSimulation {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
      
		driver.navigate().refresh();
		
		driver.quit();

	}

}

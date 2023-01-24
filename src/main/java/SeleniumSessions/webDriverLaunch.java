package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverLaunch {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//3 times browser will launch but the google link will be opened in first browser as the ref variable is driver
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new ChromeDriver();
//	    driver.get("https://www.google.com");

		
// 3 browsers will get launched and only 3rd browser will open the link
//        WebDriver driver = new ChromeDriver();
//		
//		driver = new ChromeDriver();
//		driver = new ChromeDriver();
//
//		
//		
//		driver.get("https://www.google.com");
//		
		 WebDriver driver = new ChromeDriver();
			driver = null;
			//driver = new ChromeDriver();
			//driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.quit();//only the 3rd browser will get closed
			
			
	}

}

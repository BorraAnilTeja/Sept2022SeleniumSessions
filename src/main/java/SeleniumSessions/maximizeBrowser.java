package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeBrowser {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

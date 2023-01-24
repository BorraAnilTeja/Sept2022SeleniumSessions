package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcept {

	public static void main(String[] args) throws MalformedURLException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//driver.navigate().to("https://www.google.com");
		
		driver.navigate().to(new URL("https://www.google.com"));
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
	}

}

package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		
		driver.get("https://www.facebook.com");
		String titlefb = driver.getTitle();
		System.out.println(titlefb);
		
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String pgsrc = driver.getPageSource();
		//System.out.println(pgsrc);
		
		if(pgsrc.contains("Create New Account")) {
			System.out.println("this info is present");
		}else {
			System.out.println("not present");
		}
		
		driver.get("https://in.linkedin.com/");
		String titleLIn = driver.getTitle();
		System.out.println(titleLIn);
		
		if(title.equals("LinkedIn India: Log In or Sign Up")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		driver.quit();

	}

	
	
}

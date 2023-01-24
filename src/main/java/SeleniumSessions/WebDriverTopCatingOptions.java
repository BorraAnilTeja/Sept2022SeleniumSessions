package SeleniumSessions;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTopCatingOptions {
	
	static WebDriver driver;

	public static void main(String[] args) {

		

        //1.chromedriver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//2.FF browser
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anilt\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
//        FirefoxDriver driver = new FirefoxDriver();
		
		//3.edge browser
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\anilt\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
		
		//B.Top Casting :
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
			else if(browser.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\anilt\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		        FirefoxDriver driver = new FirefoxDriver();
			}
			else if(browser.equals("Edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\anilt\\Downloads\\edgedriver_win64\\msedgedriver.exe");
       			EdgeDriver driver = new EdgeDriver();
			}
			else {
				System.out.println("browser not found-Please pass the right browser");
			}
		


		//launch url
		driver.get("https://www.google.com");
		
		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//validations
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
	}

}

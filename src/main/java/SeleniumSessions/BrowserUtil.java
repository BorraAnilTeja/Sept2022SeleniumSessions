package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	WebDriver driver;
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name is :"+browserName );
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\anilt\\Downloads\\geckodriver-v0.32.0-win-aarch64\\\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\anilt\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			//System.out.println("Please pass the right browser name:"+browserName);
			break;
		}
		return driver;
	}
	public void launchURL(String url) {
		
		if(url==null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}
		if(url.length()==0) {
			System.out.println("url length is blank");
			throw new FrameworkException("URLISBLANKOREMPTY");
		}
		if(url.indexOf("http")!=0&&url.indexOf("https")!=0) {
			System.out.println("http(s) is missing in url");
			throw new FrameworkException("http(s) is missing");
		}
		
		driver.get(url);
	}
	public void launchUrl(URL url) {
		String newurl = String.valueOf(url);
		if(newurl==null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}
		if(newurl.length()==0) {
				System.out.println("url is blank");
				throw new FrameworkException("URLISBLANK or URLISEMPTY");
		}
		if(newurl.indexOf("http")!=0 && newurl.indexOf("https")!=0) {
			System.out.println("http(s) is missing in url");
			throw new FrameworkException("http(s)ISMISSING");
		}
				
			
		driver.navigate().to(url);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}

}

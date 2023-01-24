package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); //session id =(6e54db982dc8b82bdf8dcd467d49e152)
		String title = driver.getTitle();
		System.out.println(title);
        
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.quit();//session id =(6e54db982dc8b82bdf8dcd467d49e152)
		
		//System.out.println(driver.getTitle());//Session ID is NULL
		
		driver.close();//session id =(6e54db982dc8b82bdf8dcd467d49e152)
		
		System.out.println(driver.getTitle());//Session ID is invalid

	}

}

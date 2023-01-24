package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		doLogin("admin","admin","https://the-internet.herokuapp.com/basic_auth");
		
		
		
		
	}
	public static boolean doLogin(String username,String password,String url) {
		driver.get("https://" + username + ":" + password + "@" + url);
		
		String mesg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		
		if(mesg.contains("Congratulations! You must have the proper credentials.")) {
			return true;
		}
		return false;
	}

}

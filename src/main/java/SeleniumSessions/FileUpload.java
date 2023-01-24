package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//input-file 
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\anilt\\OneDrive\\Desktop\\AshaResume.pdf");
	}

}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricTable {
static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-bangladesh-2022-23-1340842/bangladesh-vs-india-3rd-odi-1340847/full-scorecard");
		
		System.out.println(getPlayerDismissal("Ishan Kishan"));
		System.out.println(getPlayerScore("Ishan Kishan"));
	

		
		
	}
	public static String getPlayerDismissal(String batsman) {
		return driver
		.findElement(By.xpath("//a[@title='"+batsman+"']/parent::td/following-sibling::td/span")).getText();
	}
	public static String getPlayerScore(String batsman) {
		return driver
		.findElement(By.xpath("(//a[@title='"+batsman+"']/parent::td/following-sibling::td)[2]")).getText();
	}
	
}




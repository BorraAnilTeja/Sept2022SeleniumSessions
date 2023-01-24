package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		//selectDate("24");
		
		//selectCalendarDate("26");
		
		selectFutureDate("April 2023", "29");
	}
	static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void selectFutureDate(String expMonthYear, String day) {

		if (Integer.parseInt(day) <= 0) {
			System.out.println("wrong day/date passed...Please pass the right day/date..." + day);
			return;
		}
		if (Integer.parseInt(day) > 31) {
			System.out.println("wrong day/date passed...Please pass the right day/date..." + day);
			return;
		}

		if (expMonthYear.contains("February")) {
			// leap year:
			if (isLeapYear(Integer.parseInt(expMonthYear.trim().split(" ")[1]))) {
				if (Integer.parseInt(day) >=30) {
					System.out.println(
							"wrong day/date passed...Please pass the right day/date for FEB month in Leap year..."
									+ day);
					return;
				}
			}
			//no leap year:
			else {
				if (Integer.parseInt(day) >=29) {
					System.out.println(
							"wrong day/date passed...Please pass the right day/date for FEB month in year..."+ day);
					return;
				}
			}
		}

		

		// 12 months
		// 1 feb
		// 6 (31) + 5(30)

		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);// dec 2023

		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			// click on next icon:
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);
		}

		selectDate(day);

	}

	public static void selectCalendarDate(String day) {
		List<WebElement>   daysList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(daysList.size());
		
		for(WebElement e : daysList) {
			String text = e.getText();
			if(text.equals(day)) {
				e.click();
			}
			
		}
	}
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()="+day+"]")).click();
		
	}

}

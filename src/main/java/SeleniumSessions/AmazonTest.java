package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtils brutl = new BrowserUtils();
		WebDriver driver = brutl.launchBrowser("chrome");
		
		brutl.launchUrl("https://www.amazon.com");
		String acttitle = brutl.getPageTitle();
		System.out.println(acttitle);
		
		
		//validation point
		if(acttitle.contains("Amazon")) {
			System.out.println("correct title");
		}else {
			System.out.println("Incorrect Title");
		}
		
	}

}

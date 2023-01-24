package myTests;



import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenCartElementTest extends BaseTest {
	
	@DataProvider
	public Object[][] openCartElementDisplayed() {
		return new Object[][] {
			{"Login"},
			{"Register"},
			{"Forgotten Password"},
			{"My Account"},
			{"Address Book"},
			{"Wish List"},
			{"Order History"},
			{"Downloads"},
			{"Recurring payments"},
			{"Reward Points"},
			{"Returns"},
			{"Transactions"},
			{"Newsletter"},
			{"voluntary check"}
			
			
			
		};
	}
	
	
	@Test(dataProvider="openCartElementDisplayed")
	 public void OpenCartElementsTest(String eleText) {
	
		boolean flag = driver.findElement(By.linkText(""+eleText+"")).isDisplayed();
		
        Assert.assertEquals(flag,true);
	
	
	
	
	}

}

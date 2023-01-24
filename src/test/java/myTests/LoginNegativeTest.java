package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest{
	
	
	@DataProvider
	public Object[][] loginNegativeData() {
		return new Object[][] {
			{"jsbksadskjb@gmail.com","ksikw@123"},
			{"anilteja72@@gmail.com","  "},
			{"anilteja72@@gmail.com","ejfowfj@234"},
			{"  ","234@hjfn"},
			{"  ","    "}
			
		};
		
	}
	
	
	@Test(dataProvider="loginNegativeData")
	public void loginNegativeTest(String email, String password) {
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	String errormsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
    Assert.assertTrue(errormsg.contains("No match for E-Mail Address and/or Password"));
	}

}

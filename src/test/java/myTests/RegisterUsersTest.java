package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterUsersTest extends BaseTest{
	
	@DataProvider
	public Object[][] userRegisterData() {
		return new Object[][] {
			{"anil","teja","anil@gmail.com","9090909090","anil@123"},
			{"anilteja","teja","anilteja@gmail.com","90909080990","anil@143"},
			{"aniltejaborra","teja","aniltejaborra@gmail.com","90908080990","anil@193"},


			
		};
	}
	
	
	
	@Test(dataProvider="userRegisterData")
	public void RegisterUsersTest(String UserFirstName,String UserLastName,String email,String telephone,String password) {
		
		driver.findElement(By.id("input-firstname")).sendKeys(UserFirstName);
		driver.findElement(By.id("input-lastname")).sendKeys(UserLastName);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		String agree = driver.findElement(By.xpath("//div[@class='pull-right']")).getText();
		
		Assert.assertTrue(agree.contains("I have read and agree to the" ));



	}

}

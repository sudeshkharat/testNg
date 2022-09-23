package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LogInPage_Object;
import Resources.BaseClass;
import Resources.Constants;

public class VarifyingLoginPage extends BaseClass {

	
	@Test(dataProvider="testData")
	public void loginvarification(String username,String password) throws IOException, InterruptedException {
		//Browser launch
		  //url launch
		  //username and password
		  //click on log in button
		
		  LogInPage_Object Lp=new  LogInPage_Object(driver);//driver entr = creat consturctor will make change in loginpage
		  
		  Lp.entreUsername().sendKeys(username);
		  Lp.entrePassword().sendKeys(password);
		  Lp.clickOnLogIn().click();
		  
		  Thread.sleep(3000);
		  //new
		  
		  String actuaText=driver.findElement(By.xpath("(//div[@class='loginError'])[2]")).getText();
		  String expectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		  
		  Assert.assertEquals(actuaText, expectedText);
		  
		  
		  
		  
	}
	@DataProvider
	 public Object[][] testData() {
	
		Object[][] data=new Object[2][2];
		  data[0][0]=Constants.username1;
		  data[0][1]=Constants.password1;
		  data[1][0]=Constants.username2;
		  data[1][1]=Constants.password2;
	  return data;
	}
	
	
}
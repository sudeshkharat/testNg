package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPage_Object;
import PageObjectModel.signuppage_object;
import Resources.BaseClass;
import Resources.Constants;

public class VarifySignup extends BaseClass {
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		LogInPage_Object lp=new  LogInPage_Object(driver);
	lp.tryfree().click();
	
	
	signuppage_object sp=new signuppage_object(driver);
	Thread.sleep(5000);
	sp.enterfirstname().sendKeys(Constants.firstname);//old ("name")
	
	
	Select s=new Select(sp.selectjobtitle());
	s.selectByIndex(5);
	

	Select s1=new Select(sp.componycountry());
	
	s1.selectByVisibleText("Japan");
	
	Select s2=new Select(sp.componyemployee());
	
	s2.selectByIndex(2);
	
	
	sp.email().sendKeys(Constants.email);
	
	sp.lastname().sendKeys(Constants.lastname);

	sp.phone().sendKeys(Constants.phone);
	
	sp.componyname().sendKeys(Constants.componyname);
	
	sp.checkbox().click();
	
	}

}

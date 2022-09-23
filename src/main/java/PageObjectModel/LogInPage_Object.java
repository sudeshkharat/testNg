package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage_Object {

	public WebDriver driver;//no scope
	//we have used encapsln
	private By username=By.xpath("//input[@name='username']");
	
	private By password=By.xpath("//input[@name='pw']");
	
	private By logIn=By.xpath("//input[@name='Login']");
			
	private By tryfree=By.xpath("//a[@id='signup_link']");
	
			
	public LogInPage_Object(WebDriver driver2) {
		
		this.driver=driver2;
	}


	public WebElement entreUsername() {
		
		return driver.findElement(username);
	}
	
	
	public WebElement entrePassword() {
		return driver.findElement(password);
	}
	
	

	public WebElement clickOnLogIn() {
		return driver.findElement(logIn);
	}
	
	

	public WebElement tryfree() {
		return driver.findElement(tryfree);
	}
	
	
	
	
}

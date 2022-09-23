package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signuppage_object {

	public WebDriver driver;
	
	By firstname=By.xpath("//input[@name='UserFirstName']");
	
	By lastname=By.xpath("//input[@name='UserLastName']");
	
	By jobtitle=By.xpath("//select[@name='UserTitle']");
	
	By componyname=By.xpath("//input[@name='CompanyName']");
	
	By phone=By.xpath("//input[@name='UserPhone']");
	
	By CompanyEmployees=By.xpath("//select[@name='CompanyEmployees']");
	
	By email=By.xpath("//input[@name='UserEmail']");
	
	By CompanyCountry=By.xpath("//select[@name='CompanyCountry']");
	
	By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	
	
	public signuppage_object(WebDriver driver2) {
		this.driver=driver2;
	}


	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
	
	
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement selectjobtitle() {
		return driver.findElement(jobtitle);
	}
	
	public WebElement componycountry() {
		return driver.findElement(CompanyCountry);
	}
	
	
	public WebElement componyname() {
		return driver.findElement(componyname);
	}
	
	public WebElement componyemployee() {
		return driver.findElement(CompanyEmployees);
	}
	
	public WebElement phone() {
		return driver.findElement(phone);
	}
	
	
	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}
	
}



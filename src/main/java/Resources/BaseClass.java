package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver driverInitialization() throws IOException {
		
		
		
		
		// to read the file - data properties

		FileInputStream fis = new FileInputStream(
	    System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

		
		
		// to access the data properties

		prop = new Properties();// new ; proprties global declare

		prop.load(fis);

		String browserName = prop.getProperty("browser");
		

		if (browserName.equalsIgnoreCase("chrome")) {

		
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("fire fox")) {
			// fire fox
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			// edge
		}

		else {

			System.out.println("please enter valid browser name");
		}
		return driver;
	}

	@BeforeMethod
	public void browserlaunch() throws IOException {

	       driverInitialization();
	       
		  //driver.get("https://login.salesforce.com/?locale=in");//is have scope
			
	 	  driver.get(prop.getProperty("url")); //new 
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}



 

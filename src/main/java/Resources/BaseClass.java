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
		
		
		
		
		//to read the file - data properties
		// old way for one user FileInputStream fis=new FileInputStream("C:\\Users\\Sudesh\\eclipse-workspace\\E2ETestNgframework\\src\\main\\java\\Resources\\data.properties");
	
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		//new line added=           System.getProperty("user.dir")+
		
		
	//to access the data properties
		
		//old Properties prop=new Properties();
		
		 prop=new Properties();//new ; proprties global declare kel mg kadhal
		
		prop.load(fis);
	
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//new madhe sysm.prope kadhal ani dependancy add keli
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudesh\\OneDrive\\Desktop\\chrome driver\\chromedriver.exe");
			
			
			//old version
			//WebDriverMAnager.chromDriver.version("79.0.9").setup() //This will run with specifci browser version
		   //  WebDriverManager.chromedriver().setup();//This will run in current browser
			
			
			
			//new code
			WebDriverManager.chromedriver().setup();  // new version vr run hoil
	        driver = new ChromeDriver();
		}
	
		else if(browserName.equalsIgnoreCase("fire fox")) {
			//fire fox
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			//edge
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



/*public class BaseClass {
 
 
 public WebDriver driver;
 public WebDriver driverInitialization() throws IOException {

  //To Read the file- data.properties
  FileInputStream fis=new FileInputStream("C:\\Users\\bhagy\\Desktop\\Technogeecks\\E2ETestNGFramework19thApril\\src\\main\\java\\Resources\\data.properties");
  
  //To aceess the data.proprties
  Properties prop=new Properties();
  prop.load(fis);
  
  String browserName=prop.getProperty("browser");
                         //
  if(browserName.equalsIgnoreCase("chrome")) {
   
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
     driver = new ChromeDriver(); 
   
  }
  else if(browserName.equalsIgnoreCase("firefox")) {
   
   //Firefox code
  }
  else if(browserName.equalsIgnoreCase("edge")) {
   
   //Edge code
  }
  else {
   
      System.out.println("please enter valid browser name");
  }
  
  
  
  Object[][] data=new Object[2][2];
	  data[0][0]=Constants.username1;
	  data[0][1]=Constants.password1;
	  data[1][0]=Constants.username2;
	  data[1][1]=Constants.password2;
  
  return driver;
 * */

package VishalBaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class VishalBase {
	
	

     protected WebDriver driver;
     public void launchBrowser()
     {
    	 Reporter.log("launchinjg the brouser", true);

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
		 driver=new ChromeDriver(); 
		 driver.get("https://kite.zerodha.com//"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.manage().window().maximize();
	  Reporter.log("BroWserLauch success",true);
	  
     }
     public void closeBroser()
     {
    	 driver.close();
    	 Reporter.log("Browser Closed Sucsses",true);
     }
     }
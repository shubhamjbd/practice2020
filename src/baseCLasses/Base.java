package baseCLasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	
	//base class includes browser ,driver setup
	
	protected WebDriver driver ;
	
public void LaunchBrowser() 
{
	 Reporter.log("launchinjg the brouser", true);

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
	 driver = new ChromeDriver(); 
	 driver.get("https://kite.zerodha.com//"); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 driver.manage().window().maximize();
	 
	  Reporter.log("launched the browser successfully", true);
}
     
public void closeBrowser() 
{
	driver.close();
	Reporter.log("  browser closing successfull", true);
}

}

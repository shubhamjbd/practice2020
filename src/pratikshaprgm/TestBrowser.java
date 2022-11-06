package pratikshaprgm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class TestBrowser {
	
	static WebDriver Driver;

	public static void main(String[] args) {
 
		  Reporter.log("launchinjg the brouser", true);

			 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
				
			 Driver=new ChromeDriver(); 
			 Driver.get("https://kite.zerodha.com//"); 
			 Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			 Driver.manage().window().maximize();
		  Reporter.log("BroWserLauch success",true);
		
		
	}

}

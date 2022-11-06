package waitORsynchronisation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitUse {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();  
			
			driver.get("https://kite.zerodha.com//");  //getting main page
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			//implicitlyWait :
			//            type of Dynamic wait,applicable for whole web page
			//            1000ms,if in 10ms web page is loaded 900 ms will be released
			
	}

}

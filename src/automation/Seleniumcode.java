package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumcode {

	public static void main(String[] args) throws InterruptedException {
		 
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://vctcpune.com/");
	//driver.close();

	//driver.quit();
    //	driver.get("https://www.youtube.com/");

	driver.manage().window().maximize();
    //Thread.sleep(10000);
	
	//driver.manage().window().minimize();
	//Thread.sleep(10000);
	
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("https://vctcpune.com/");
	driver.get("https://www.youtube.com/");
	
	String title=driver.getTitle();
	System.out.println("title is "+title);
	
	
	//input[@placeholder='Email address or phone number']
	 //input [@type='password']
	// //button [@name='login']
	
	//elements of vctc pune//
	//input[@value='Radio1']
	

	}

}

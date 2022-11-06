package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_2 {

	
	@Test
	public void method1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
	 
		WebDriver driver=new ChromeDriver();  
		           
        driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@Test
	public void method2()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
	}
	
	@Test
     public void method3() throws InterruptedException
     {

         System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
 		
 		WebDriver driver=new ChromeDriver();  
 		
 		driver.get("https://demoqa.com/select-menu");  //getting main page
 		driver.manage().window().maximize();
 		Thread.sleep(2000);
     }
     }


package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsSendskey {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		
//		 
         driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123"); //for email id
     	Thread.sleep(2000);
//		
////		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");        //====>another way for email id
////		Thread.sleep(2000);
////		
    		driver.findElement(By.name("pass")).sendKeys("pasword12345");  
     		Thread.sleep(2000);
////		driver.findElement(By.xpath("//input[@id='email']")).clear();    //===========>slash is important in locater syntax
////		Thread.sleep(2000);
////		
////		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		 
		// WebElement email_id= driver.findElement(By.xpath("//input[@id='email']"));
		 
		// email_id.clear();
		 Thread.sleep(2000);
		 
		// email_id.sendKeys("new email id");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
//		 
		 

		
		
		
	}

}

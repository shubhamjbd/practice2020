package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_action {

	public static void main(String[] args) throws InterruptedException {
 

        System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.flipkart.com/");  //getting main page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
//	
//		js.executeScript("window.scrollBy(0,120)");
//     	js.executeScript("window.scrollBy(0,-70)");
		
//		
		js.executeScript("window.scrollBy(0,120)");	
		Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,-70)");
        Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,10000000)");
		Thread.sleep(2000);
		
        js.executeScript("window.scrollBy(0,-10000000000000)");

//        
//        js.executeScript("window.scrollBy(0,500)");
//        
//		Thread.sleep(4000);
//
//        js.executeScript("window.scrollBy(0,-100)");
//        
//		Thread.sleep(2000);
//		
//	      js.executeScript("window.scrollBy(0,900)");

	}
	

}

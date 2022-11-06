package multipleELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugggestions {

	public static void main(String[] args) throws InterruptedException {
 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();  
				
				driver.get("https://www.google.co.in/");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("honda");
				
			//	alloptions path
				//ul[1]//li[@role='presentation']
				
	}

}

package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Hidden_Division {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.flipkart.com/");
		
		//taking screenshot
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("source");
		String str=RandomString.make(2);
		File dest=new File("C:\\selenium screenshot\\hidden division"+str+".png");
		FileHandler.copy(source, dest);
		
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	 	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		File source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("source1");
		String str1=RandomString.make(2);
		File dest1=new File("C:\\selenium screenshot\\hidden division"+str1+".png");
		FileHandler.copy(source1, dest1);
		
		
		
 
	}

}

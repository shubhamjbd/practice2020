package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screnshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
	     driver.get("https://www.google.com/");  //browser will open but site will open
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 System.out.println("source"); 
	  
	  File dest=new File("C:\\selenium screenshot\\image.png");   //you forgotten image.png
	  
 
 
	  FileHandler.copy(source, dest);
 
 
	}

}

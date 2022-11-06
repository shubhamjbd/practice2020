package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_With_RandomString {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	for(int i=1;i<=4;i++)
	{
		   
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String str = RandomString.make(3); //===>adding random string this will avoid overwriting of file
   	  
   	    File dest=new File("C:\\selenium screenshot\\image"+str+".png");   //you forgotten image.png
   	    
   	    FileHandler.copy(source, dest);
		
	}
		
		
	}

}

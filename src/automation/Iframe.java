package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Iframe {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            
            driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.switchTo().frame("iframeResult");
            
            //taking screenshot before cliking on botton
            
            File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            
            String str = RandomString.make(3); //===>adding random string this will avoid overwriting of file
       	  
       	    File dest=new File("C:\\selenium screenshot\\image"+str+".png");   //you forgotten image.png
       	    
       	    FileHandler.copy(source, dest);
       	  
            
            WebElement textdisplay=  driver.findElement(By.xpath( "//p[@id='demo']"));
            boolean result =textdisplay.isDisplayed();
            
            Thread.sleep(2000);
           
            
    
      System.out.println("text is desplayed before clicking on button? "+result);
      Thread.sleep(2000);
      
      if(result)
      {
    	  System.out.println("test case is failed because text appeard before click");
      }
      else
      {
    	  driver.findElement(By.xpath("//button[@type='button']")).click();
    	  Thread.sleep(2000);
           boolean result2 =textdisplay.isDisplayed();
           System.out.println("is text diosplayed after clicking? "+result2);
          System.out.println("text is displayed only after clicking on button \nTest case is passed");
          
          //====>taking screenshotAFTER TEXT IS APEARED 
          
            File source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          
          String str1 = RandomString.make(3); //===>adding random string this will avoid overwriting of file
     	  
     	    File dest1=new File("C:\\selenium screenshot\\image"+str1+".png");   //you forgotten image.png
     	    
     	    FileHandler.copy(source1, dest1);
           Thread.sleep(2000);
           
          //====>NOTE ON SAME PROGRAMME IF U HAVE TO TAKE MULTIPKLE TIME SCREENSHOT THEN YOU HAVE TO CHANGE VARIABLES EG AS I DID
          // SOURCE=====>SOURCE1
          //str=========>str1
          //dest========>dest1,,,,,carefully change all variable places
    	  
           
    	  
      }

            
            		
	}

}

package framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://kite.zerodha.com//");  //getting main page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//user id :userid by id
		//password=
		//loginClick:
		//pIN:by.id()
		//continue button by xpath:
		WebElement UserIdField = driver.findElement(By.id("userid"));
		
        WebElement PasswordField = driver.findElement(By.id("password"));
 
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        UserIdField.sendKeys("DAA677");
        PasswordField.sendKeys("Velocity@123");
        loginButton.click();

        Thread.sleep(1000);               //here new page is opened so thread is important
        
        
    
        WebElement PinBox = driver.findElement(By.id("pin"));
        
        WebElement ContinueButtonClick=driver.findElement(By.xpath("//button[@type='submit']"));
        
        //now actions
                                    
            
        PinBox.sendKeys("866918");
        ContinueButtonClick.click();
        Thread.sleep(4000);
      
        
        
        WebElement userIdFromWeb=driver.findElement(By.xpath("//span[@class='user-id']"));
        String ActualUserId=userIdFromWeb.getText();
        String ExpectedUserId=("DAA677");
        
        if(ActualUserId.equals(ExpectedUserId))
        {
        	System.out.println("expected user id equals to actual user id therefore test case is passed");
        }
        else 
        {
        	System.out.println("expected user id not matching with actual therefoe test case is failed");
        }
 
        
        
        
	}

}

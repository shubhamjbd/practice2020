package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_use {

	public static void main(String[] args) throws InterruptedException {
		
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();

	

driver.get("https://www.discoveryplus.in/"); 
Thread.sleep(4000);
driver.manage().window().maximize();
Thread.sleep(4000);
WebElement signInButton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")); 
signInButton.click();   
Thread.sleep(4000);

////driver.findElement(By.xpath("//button[text()='Get OTP']"));

WebElement getOTPBUTTON=driver.findElement(By.xpath("//button[text()='Get OTP']"));
Thread.sleep(2000);
System.out.println(getOTPBUTTON.isEnabled());
boolean result= getOTPBUTTON.isEnabled();

System.out.println("getOTP button status i s"+result);


if(result)
{
	System.out.println("get OTP button is enabled");
	 getOTPBUTTON.click();
}
else
{
	driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
	Thread.sleep(100);
	 getOTPBUTTON.click();
	System.out.println("clicked on get OTP BUTTON");
}



	}

}

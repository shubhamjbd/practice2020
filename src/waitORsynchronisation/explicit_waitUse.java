package waitORsynchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicit_waitUse {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();

	

driver.get("https://www.discoveryplus.in/"); 
 
driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
WebElement signInButton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")); 
signInButton.click();   

driver .manage ().timeouts().implicitlyWait(Duration.ofMillis(9000));

//  WebdriverWait                                                                                      //driver.findElement(By.xpath("//button[text()='Get OTP']"));

WebElement getOTPBUTTON=driver.findElement(By.xpath("//button[text()='Get OTP']"));
 

	}

}

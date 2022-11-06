package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.google.com/search?q=facebook&oq=facebook&aqs=chrome..69i57.4441j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	  driver.findElement(By.xpath("//h3[text()='Facebook - Log In or Sign Up']")).click();
	  Thread.sleep(4000);
	  
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  Thread.sleep(4000);
	  
	  driver.findElement(By.name("firstname")).sendKeys("abcdef");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xyz");
	  Thread.sleep(1000);
	  
	//  mob no.args path=(//input[@type='text'])[4]
	  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
	  Thread.sleep(1000);
	 
	// passrd path by id=id="password_step_input" 
	  driver.findElement(By.id("password_step_input")).sendKeys("password123");
	  Thread.sleep(1000);
	  
//==============>now working on list box or dropdown button
	  //1//step1:identify the list box to be handled and store it in reference variable
	  WebElement DAYdropbox=driver.findElement(By.id("day"));
	  
	  
	  //step2 create an object of select class which will accept Web element as argument
	  Select s =new Select(DAYdropbox);
	  
		
    //step3:by using one of the select class method we can select  values from list box like
	  s.selectByVisibleText("1");
	  Thread.sleep(2000);
	  
	  s.selectByValue("31");
	  Thread.sleep(2000);
	  
	  //selecting month dropbox or list box
	  WebElement MONTHdropbox=driver.findElement(By.id("month"));
	  
	  Select smonth=new Select( MONTHdropbox);
	  
	  smonth.selectByVisibleText("Jan");
	  Thread.sleep(2000);                                            
	  smonth.selectByIndex(10);
	  Thread.sleep(2000);  
	  
		//selecting year
	   WebElement YEARdropbox=driver.findElement(By.id("year"));
	   Select syear =new Select(YEARdropbox);
	   
	   syear.selectByValue("2022");
	   Thread.sleep(2000);
	   
	   syear.selectByVisibleText("1905");
	   Thread.sleep(2000);  
	    
	   syear.selectByVisibleText("2000");
	   Thread.sleep(2000);  
	   
	   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();//selecting gender
	   
	   //trying to sign up
	   driver.findElement(By.name("websubmit")).click();
	   
	   

	}

}




/*{
    "id": 3629,
    "name": "Suryakanta Pilla",
    "email": "pilla_suryakanta@purdy.co",
    "gender": "female",
    "status": "inactive"
},*/
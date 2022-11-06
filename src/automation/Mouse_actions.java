package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		WebElement checkBOxOPtion= driver.findElement(By.id("checkBoxOption1"));
		//creating  object of actions class which will accept driver object as an argument
		
		Actions act =new Actions(driver);
		
		// using actions class object we perform  method
		
		//1st way:
		
		// act.click(checkBOxOPtion).perform();

		 //second way
		 
		 act.moveToElement(checkBOxOPtion).click().build().perform();
		 
		
		 
		 
//jumping to next site but without opening next tab=====================================================================================
		 
		 driver.get("https://demoqa.com/books");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 

		 
		 WebElement getting_text =driver.findElement(By.xpath("//a[text()='Understanding ECMAScript 6']"));
		 System.out.println("the text is"+getting_text.getText());
		 
	
	
	}

}

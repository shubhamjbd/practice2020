package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_double_click {

	public static void main(String[] args) throws InterruptedException {
		
		

        System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://demoqa.com/select-menu");  //getting main page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//creating action class object
		
		WebElement clicking_on_element=driver.findElement(By.xpath("(//div[@class='header-text'])[1]"));
				
		
         	Actions act =new Actions(driver);
//       
//		act. click(clicking_on_element).perform();
//		Thread.sleep(10000);
//		
//		act. click(clicking_on_element).perform();
//		Thread.sleep(5000);
//
//		
//		act. doubleClick(clicking_on_element).perform();
//		
		
		
	//2nd way
		
		  act.moveToElement(clicking_on_element).doubleClick().build().perform();
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//

	}

}

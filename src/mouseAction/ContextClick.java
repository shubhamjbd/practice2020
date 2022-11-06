package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	
	 static WebDriver driver;
	private static Object Action;
	private static Object Actions;

	public static void main(String[] args) throws InterruptedException {
 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
		  driver=new ChromeDriver();  
			
			driver.get("https://github.com/GitHawkApp/ContextMenu");  
			driver.manage().window().maximize();
	         Thread.sleep(2000);
	         
	         WebElement buttonTorightClick = driver.findElement(By.xpath( "//span[@class='css-truncate-target']"));
	         
	          Actions act =new Actions(driver);
	          act.contextClick(buttonTorightClick).perform();
	          
	          for(int i=0; i<=4; i++)
	          {
	          	act.sendKeys(Keys.ARROW_DOWN).perform();
	          	 
	          }	
	        
	          act.click().perform();
	
	}
}

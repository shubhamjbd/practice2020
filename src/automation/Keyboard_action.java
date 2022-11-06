package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://facebook.com");
driver.manage().window().maximize();
Thread.sleep(2000);


driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();
Thread.sleep(4000);

WebElement dayButtonClick=driver.findElement(By.xpath("//select[@title= 'Day']"));


Actions act= new  Actions (driver);           //  ======>note here driver in the bracket
  
act.click(dayButtonClick).perform();

for(int i=0; i<=4; i++)
{
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	
}

for(int i=0;i<=7;i++)
{
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(200);
	
}
act.sendKeys(Keys.ENTER).perform();



WebElement ClickOnFirstNAme=driver.findElement(By.xpath("//input[@aria-label='First name']")); 

act.click(ClickOnFirstNAme).keyDown(Keys.SHIFT).sendKeys("velocity").build().perform();

act.keyDown(ClickOnFirstNAme,Keys.SHIFT).sendKeys("v").keyUp(Keys.SHIFT).sendKeys("elocity").build().perform();
	}

}

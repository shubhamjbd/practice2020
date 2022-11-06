package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mse_Actions_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
  
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		WebElement sourcs=driver.findElement(By.xpath("(//img[@src='img_w3slogo.gif'])[1]"));  //problem to find element
//		WebElement target=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[2]"));
//		
		Actions act =new Actions(driver);
		
		//act.clickAndHold(sourcs).moveToElement(target).release().build().perform();
		
		
	}

}

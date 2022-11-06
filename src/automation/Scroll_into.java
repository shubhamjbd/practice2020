package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll_into {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement clickingOnColourButton =driver.findElement(By.xpath("//h2[text()='Colors']"));
        
        
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",clickingOnColourButton);
        Thread.sleep(6000);
        
        clickingOnColourButton.click();
 
	}

}

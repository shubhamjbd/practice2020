package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//1.
		WebElement multiboxselect=driver.findElement(By.name("cars"));
		
		//2.
		Select s=new Select(multiboxselect);
		
		//3.
		boolean result=s.isMultiple();
		System.out.println("multiple check is "+result);
		
		s.selectByValue("volvo");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		//deselect
		
	s.deselectByIndex(1);

	}

}

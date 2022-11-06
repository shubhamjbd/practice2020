package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Is_SelectedUse {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		

      ChromeOptions opt=new  ChromeOptions();
      opt.addArguments("headless");
      
		WebDriver driver=new ChromeDriver(opt);//upcasting into   
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Option1Checkbox=driver.findElement(By.name("checkBoxOption1"));
		
		boolean result=Option1Checkbox.isSelected();
		
		if(result) 
		{
			System.out.println("checkbox is already selected");
		}
		else 
		{
			System.out.println("Checkbox is not selected,,\n please select the checkbox");
			Option1Checkbox.click();
			Thread.sleep(2000);
			boolean result2=Option1Checkbox.isSelected();
			System.out.println("Updated status for check selectionis "+result2);
			
			
		}
		
		

	}

}

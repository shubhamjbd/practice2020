package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxhandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//step1:identify the list box to be handled and store it in reference variable
		WebElement Dropdownbox=driver.findElement(By.name("dropdown-class-example"));
		
		//step2 create an object of select class which will accept Web element as argument
		Select s=new Select(Dropdownbox);
		
		//step3:by using one of the select class method we can select  values from list box like
		
		//   1.selectByVisible Text: selectByVisible text(String arg())
		//   2.selectByIndex:selectByindex(int arg())
		//   3.selectByValue: selectByValue(String arg())
		
		s.selectByVisibleText("Option1");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("option3");
		
		System.out.println("isMultiple state is  "+s.isMultiple());
		
		
		
		
		
		
	}

}

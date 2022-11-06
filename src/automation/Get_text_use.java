package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text_use {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
	   // driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	    
	    WebElement webelem= driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	    
	    String actual_text=webelem.getText();
	    System.out.println("actual text is "+actual_text);
	    String ecpected_text="WelcoMe To Practice Page";
	    
	    if(actual_text.equals(ecpected_text))
	    {
	    	System.out.println("text is matching,therefore test casre is passed");
	    	
	    }
		
	    else
	    {
	    	System.out.println("text is not matching therefore test case is failed");
	    	
	    }



	}

}

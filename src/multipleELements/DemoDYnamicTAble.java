 package multipleELements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDYnamicTAble {

	 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver(); 
					
					driver.get("https://vctcpune.com/selenium/practice.html");
			        driver.manage().window().maximize();
			        Thread.sleep(2000);
			        List<WebElement> coloumnCount=driver.findElements(By.xpath("//table[@id='product']//tr[1]//th")); 
			        
	   int  TotalNumberOfColumn  =  coloumnCount.size();   //here size is method of list interface
	   System.out.println("total number of columns are "+TotalNumberOfColumn);
	   
	   //so fetching the number of rows
	  
	   
	   List<WebElement> rowCount=driver.findElements(By.xpath("//table[@id='product']//tr"));
	   int TotalNumberOfRows=rowCount.size();
	   System.out.println("total nuber of rows are "+TotalNumberOfRows);
	    
	   //outer loop for rows 
	   
	   
	   String text;  
	   int j;
	  
	   for( j=1;j<=TotalNumberOfColumn;j++)
	   {
		   
		   
	        text=driver.findElement(By.xpath("//table[@id='product']//tr[1]//th["+j+"]")).getText();
	        System.out.print(text+ " " );
		   
		   
			  
		  }
	   
	  
	    
	     
	   
		
	   
	}

}



//int j;
//String text=" ";
//for( j=1;j<=TotalNumberOfColumn;j++)
//{
//text=driver.findElement(By.xpath("//table[@id='product']//tr[1]//th["+j+"]")).getText();
// System.out.print(text+ " " );






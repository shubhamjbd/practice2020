package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
          
		
		FileInputStream MyFile= new FileInputStream("C:\\Users\\sir\\Desktop\\apachepoi\\ExcelTest2.xlsx");
		Sheet Mysheet=WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		String MyUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		
	    String MyPassword = Mysheet.getRow(0).getCell(1).getStringCellValue();
	    
	     String MyPin = Mysheet.getRow(0).getCell(2).getStringCellValue();
	     
	      System.out.println(MyPin);  //so if we write like '866918 in excel cell it will take as string although seem integer
	      System.out.println(MyUserID); 
	      System.out.println(MyPassword); 
	     
	    
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();  
			
			driver.get("https://kite.zerodha.com//");  //getting main page
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement UserIdField = driver.findElement(By.id("userid"));
			
	        WebElement PasswordField = driver.findElement(By.id("password"));
	 
	        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	        UserIdField.sendKeys(MyUserID);
	        PasswordField.sendKeys(MyPassword);
	        loginButton.click();

	        Thread.sleep(1000);               //here new page is opened so thread is important
	        
	        WebElement PinBox = driver.findElement(By.id("pin"));
	        
	        WebElement ContinueButtonClick=driver.findElement(By.xpath("//button[@type='submit']"));
	        
	        //now actions
	                                    
	            
	        PinBox.sendKeys(MyPin);
	        ContinueButtonClick.click();
	        Thread.sleep(4000);
	      
	        
	        
	        WebElement userIdFromWeb=driver.findElement(By.xpath("//span[@class='user-id']"));
	        String ActualUserId=userIdFromWeb.getText();
	        String ExpectedUserId=(MyUserID);
	        
	        if(ActualUserId.equals(ExpectedUserId))
	        {
	        	System.out.println("expected user id equals to actual user id therefore test case is passed");
	        }
	        else 
	        {
	        	System.out.println("expected user id not matching with actual therefoe test case is failed");
	        }
	     System.out.println("======================================================================================================");
	     
	     driver.findElement(By.xpath( "//span[@class='user-id']")).click();
	     Thread.sleep(2000);

	     driver.findElement(By.linkText("Logout")).click();
	     Thread.sleep(2000);
	     driver.close();
	     
	    // java.net.SocketException: Connection reset===>:program is running successfully but at end exception is coming 
	                                                            //and new thread class is get opened
	     
	}

}

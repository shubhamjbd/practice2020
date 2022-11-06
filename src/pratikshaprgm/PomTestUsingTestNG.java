package pratikshaprgm;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PomTestUsingTestNG {
    WebDriver Driver;
    KiteLoginPage Login;
	KiteCoutinuePage PIN;
	KiteHomePage home;
	Sheet  mySheet ;
	 
	SoftAssert soft=new SoftAssert();
	
	
  @BeforeClass                                                                              //@BeforeGroups
 public void LaunchBrowser() throws EncryptedDocumentException, IOException
 {
	  Reporter.log("launchinjg the brouser", true);

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
		 Driver=new ChromeDriver(); 
		 Driver.get("https://kite.zerodha.com//"); 
		 Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 Driver.manage().window().maximize();
	  Reporter.log("BroWserLauch success",true);
	  
	  FileInputStream MyFile=new FileInputStream("C:\\\\Users\\\\sir\\Desktop\\apachepoi\\Sheet3.xlsx");
		
		 mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet5");

	 
	 	  
	   
	 // C:\\ExcelFiles\\Book4.xlxs
	  Login = new KiteLoginPage(Driver);
	  PIN=new KiteCoutinuePage(Driver);
	  home=new KiteHomePage(Driver);
 }
 
 @BeforeMethod
 public void LoginToKiteApp()
 {
	 String userId = mySheet.getRow(0).getCell(0).getStringCellValue();
	 String pwd = mySheet.getRow(0).getCell(1).getStringCellValue();	
     String pin = mySheet.getRow(0).getCell(2).getStringCellValue();
			  
    Login.EnterUserID(userId);
    Login.Enterpassword(pwd);
    Login.ClickOnLoginButton();
    
    Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    
   PIN.enterpin(pin);
   
   PIN.ClickOnContinueButton();

   Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
   
   
}
 
 @Test
 public void validateUserId()
 {
	  String actualUserid = home.getActualUserID();
	  String expected = mySheet.getRow(0).getCell(0).getStringCellValue();
	  
	  soft.assertEquals(actualUserid, expected, "actual not match expected ");
	 // Assert.assertEquals(actualUserid, expected, "actual not match expected ");
	 // Assert.assertEquals(actualUserid, expected, "actual not match expected ");
	  
 }

 @AfterMethod
 public void logout() throws InterruptedException
 {
	  home.logout();
	  
 }
	   
 @AfterMethod
 public void closeBrowser()
 {
	  Driver.close();
 }
 

  }
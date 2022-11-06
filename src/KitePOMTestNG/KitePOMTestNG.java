package KitePOMTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KitePOMTestNG {
	WebDriver driver;
    Sheet Mysheet;
    POM1_KiteLogInPage login;
    POM2_KitePinPage   pin;
    POM3KiteHomepage home;
	
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {
	  Reporter.log("launchinjg the brouser", true);

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
		 driver=new ChromeDriver(); 
		 driver.get("https://kite.zerodha.com//"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.manage().window().maximize();
		 
		  Reporter.log("launched the brouser successfull", true);
		  
			 FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\sir\\Desktop\\apachepoi\\Sheet3.xlsx");//try declaration as global
			
			 Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet5");
			 
			 
			 //creating object of every POM class to call the method of POM class
			 
			    login =  new  POM1_KiteLogInPage(driver);
			    pin   =  new  POM2_KitePinPage(driver);
			    home  =  new  POM3KiteHomepage(driver);
			 
//   Why driver as argument:
			 
			 
			 
			 
		 
  }
  @BeforeMethod
  public void loginToKiteApp()
  {
	  // fetching required credentials or data from excel sheet
	  String USERID_fromExcelSheet= Mysheet.getRow(0).getCell(0).getStringCellValue();
	  String PWD_fromExcelSheet=    Mysheet.getRow(0).getCell(1).getStringCellValue();
	  String PIN_fromExcelSheet=   Mysheet.getRow(0).getCell(2).getStringCellValue();
	  
	 // System.out.println("print excel"+USERID_fromExcelSheet);
	  Reporter.log("entering userID Password",true);
	  
	  login.SendUserId(USERID_fromExcelSheet);
	  login.SendPassword(PWD_fromExcelSheet);
	  login.ClickOnLoginButton();                //calling methods from pom 1 class with argumeent of data which fetched from Excel Sheet
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  //now action from ssecond pom class
	  
	  Reporter.log("Entering Pin",true);
	  
	  pin.SendPin(PIN_fromExcelSheet);
	  pin.ClickOnContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  
}
  @Test
  
  public void ValidateUserId()
  {
	  Reporter.log("validating useer id successfully",true);
	  
	  String ExpectedUserID=Mysheet.getRow(0).getCell(0).getStringCellValue();
	  
	  String ActualUserID=home.GetActualUserID();
	  Assert.assertEquals(ActualUserID,ExpectedUserID,"actual and expected user id are not matching");
	   
	  Reporter.log("USerId validated successfully, test case is passed",true);

  }
  @AfterMethod
  public void LogoutFromKiteApp() throws InterruptedException
  {
	  Reporter.log("Logging out....",true);
	  home.ClickOnLogout();                    //why asking throws InterruptedException,agodar calling method chya time nahi vicharl
	  driver.close();
  }  
  
 
  
   
}

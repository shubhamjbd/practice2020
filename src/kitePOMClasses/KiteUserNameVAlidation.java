package kitePOMClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import utilityPackage.Utility_Class;

import baseCLasses.Base;
//import baseCLasses.Base;
import utilityPackage.Utility_Class;

public class KiteUserNameVAlidation extends Base {
  
	KiteloginPage login;
	 KitePinPage  pin;
	 KiteHomePage home;
@BeforeClass
  public void browserLAunch ()
  {
	 LaunchBrowser();  
	                                   //as soon as we import base package  its static method from that package get called.
	    login= new KiteloginPage(driver);
	    pin=new KitePinPage(driver);
	    home=new KiteHomePage(driver);
  }

  @BeforeMethod
  public void LoginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.SendUserId( Utility_Class.readDataFromExcel(0, 0));
	  login.SendPassword(Utility_Class.readDataFromExcel(0, 1));
	  login.ClickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.SendPin(Utility_Class.readDataFromExcel(0, 2));
	  pin.ClickOnContinueButton();
  }
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	  int TCID=100;
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String actualUserId=home.GetActualUserIDfromWebPage();
	  String expectedUserId=Utility_Class.readDataFromExcel(0, 3);
	  Assert.assertEquals(expectedUserId,actualUserId,"Actual and Expected not matching");
	  Utility_Class.takeScreenshot(driver, TCID);
	  Reporter.log("validated user name",true);
  }
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  home.ClickOnLogout();
	  Reporter.log("logging out",true);
  }
  @AfterClass
  public void closingBrowser()
  {
	  closeBrowser();
  }
  
  
}


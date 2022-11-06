package vishalKIteTestClasses;

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

import VishalBaseClasses.VishalBase;
import vishalUtilityPackage.VishalUtility_class;
import vishalKitePOMClasses.VishalKiteHomePage;
import vishalKitePOMClasses.VishalKiteLoginPage;
import vishalKitePOMClasses.VishalkiteContinuePage;

public class vishalKiteNameValidation extends VishalBase {
	VishalKiteLoginPage login;
	VishalkiteContinuePage PIN;
	VishalKiteHomePage home;
  @BeforeClass
  public void browserLaunch() {
	  launchBrowser();
	   
	login = new VishalKiteLoginPage(driver);
	 PIN=new VishalkiteContinuePage(driver);
	   home=new VishalKiteHomePage(driver);
  }
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.enterUserID(VishalUtility_class.readDataFromExcel(0, 0));
	  login.enterPassword(VishalUtility_class.readDataFromExcel(0, 1));
	  login.ClickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	  PIN.enterpin(VishalUtility_class.readDataFromExcel(0, 2));
	  PIN.ClickOnContinueButton();
  }
  
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	  int TCID=100;
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	  String actualUserID = home.getActualUserID();
	  String expectedUserID = VishalUtility_class.readDataFromExcel(0,0);
	  Assert.assertEquals(expectedUserID, actualUserID,"actual and expected not matching");
	  VishalUtility_class.takeScreenshot(driver, TCID);
	  Reporter.log("validate UserName",true); 
	  
  }
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  home.Logout();
	  Reporter.log("Logging out",true);
  }
  @AfterClass
  public void Browserclosing()
  {
	  closeBroser();
  }
}
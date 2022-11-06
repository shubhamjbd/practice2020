package testNG_XML_lStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedXMLStudy {
	
	 @Test (timeOut=2000)
	  public void TC1() throws InterruptedException
	  {
		 Thread.sleep(3000);
	  	Reporter.log("Running TC1",true);
	  }
	  
	  @Test
	  public void TC2()
	  {
	  	Reporter.log("Running TC2",true);
	  }
	  
	  @Test
	  public void TC3()
	    {
		  Assert.fail();
	  	Reporter.log("Running TC3",true);
	  }
	  
	  @Test(groups="sanity")
	  public void TC4()
	  { 
		  Assert.fail();
	  	Reporter.log("Running TC4",true);
	  }
	  @Test
	  public void TC5()
	  {
	  	Reporter.log("Running TC5",true);
	  }

}

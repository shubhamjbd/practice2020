package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class Testing1 {
  @Test
  
  public void p ()
  {
	  Reporter.log("TC is running true");
	  
  }
  @Test
  public void q()
  {
	  Assert.fail();
	  Reporter.log("TC q is runing ",true);
  }
  
  @Test (dependsOnMethods= {"q"})
  public void r()
  {
	  Reporter.log("TC r is ruuning",true);
  }
  
 
}

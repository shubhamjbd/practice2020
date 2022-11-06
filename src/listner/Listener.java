package listner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	
	public void onTestStart(ITestResult result)
	{
		Reporter .log("your tc is started ", true);
		ITestListener.super.onTestStart(result);
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("sorry your Tc is Failed",true);
	    ITestListener.super.onTestFailure(result);
	}
	
	public void onTestSuccess(ITestResult result) 
    {
    	Reporter.log("Tc is Passed",true);
    	ITestListener.super.onTestSuccess(result);
    }
    
	public void onTestSkipped(ITestResult result) 
    {
    	Reporter.log("TC is skipped",true);
    	ITestListener.super.onTestSkipped(result);
     }
 
	
	
}

	



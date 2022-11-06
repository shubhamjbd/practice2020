package KitePOMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3KiteHomepage {
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOutButton;

	//2 creating constructor
	
	public  POM3KiteHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
    }
	
	//3 method which works on data members
	

	public String GetActualUserID()
	{
		String ActualUserID=userID.getText();
		return ActualUserID;
	}
	
	
//	
//	public void ValidateUserID()
//	{
//		String ActualUserID=userID.getText();
//		String ExpectatedUserID="DAA677";
//	
//		if(ActualUserID.equals(ExpectatedUserID))
//		{
//			System.out.println("expected user id is matching with actual user is therrefore test case is passed");
//			
//		}
//		else {
//			System.out.println("expected user id not matching with actual therefore test case is failed");
//		}		
//		
//	}
	
	public void ClickOnLogout() throws InterruptedException
	{
		userID.click();
		Thread.sleep(2000);
		LogOutButton.click();
		
	}
}


 
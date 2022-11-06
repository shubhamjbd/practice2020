package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOutButton;

	//2 creating constructor
	
	public  KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
    }
	
	//3 method which works on data members
	

	public String GetActualUserIDfromWebPage()
	{
		String ActualUserID=userID.getText();
		return ActualUserID;
	}
	
	public void ClickOnLogout() throws InterruptedException
	{
		userID.click();
		Thread.sleep(2000);
		LogOutButton.click();
		
	}

}

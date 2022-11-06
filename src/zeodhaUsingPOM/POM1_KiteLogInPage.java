package zeodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_KiteLogInPage {

	
	//variable declaration
	
	@FindBy(id="userid")private WebElement UserId;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LogInButtonClick;
	
	//creating constructor i.e. method name is same as class name ==>public
	
	public POM1_KiteLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   //meaning:
	}
	
	//3.methods which works on data members
	
	public void SendUserId()
	{
		UserId.sendKeys("DAA677");
	}
	
	public void SendPassword()
	{
		password.sendKeys("Velocity@123");
	}
	
	public void ClickOnLoginButton()
	{
		LogInButtonClick.click();
	}
	
	
	
	
}

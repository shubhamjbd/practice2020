package pratikshaprgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLoginPage {
	//1.variable declaration---> WebElement 
	
		@FindBy(id="userid") private WebElement userID;  //path was wronmg extra inveted coma
		@FindBy(id="password") private WebElement password;
		@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
		
		
		// use constructor  --->public

		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void EnterUserID(String uid)
		{
			userID.sendKeys(uid);
		}
		
		public void Enterpassword(String pwd)
		{
			password.sendKeys(pwd);
		}
		
		public void ClickOnLoginButton()
		{
			LoginButton.click();
		}
	}
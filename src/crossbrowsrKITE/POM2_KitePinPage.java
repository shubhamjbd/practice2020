package crossbrowsrKITE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class POM2_KitePinPage {
	
	
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement ClickOnContinueButton;
	
	//creating constructor
	
	public POM2_KitePinPage(WebDriver driver)  //parameterised method to initialise the webelement as varriable
	{
		PageFactory.initElements(driver,this);
		
	}
	
   //3 creating methods which on data members
	
	public void SendPin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void ClickOnContinueButton()
	{
		ClickOnContinueButton.click();
	}
	
	
	
	
}

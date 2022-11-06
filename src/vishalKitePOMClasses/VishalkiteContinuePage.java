package vishalKitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VishalkiteContinuePage {
	
	
	//1. variable declaration 
	
	
	    @FindBy(id="pin") private WebElement Continuepin;
	    @FindBy(xpath="//button[@type='submit']") private WebElement ContineuButton;

   //2.
        public VishalkiteContinuePage(WebDriver driver)
        {
        	PageFactory.initElements(driver,this);
        }
        
        //3.
        
        public void enterpin(String pin)
        {
        	
			Continuepin.sendKeys(pin);
        }
        public void ClickOnContinueButton()
        {
        	ContineuButton.click();
        }
   
}
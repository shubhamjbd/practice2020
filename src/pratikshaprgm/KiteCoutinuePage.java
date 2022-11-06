package pratikshaprgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteCoutinuePage {

	//1. variable declaration 
	
	
	    @FindBy(id="pin") private WebElement ContinuePIN; //same  not same name name?of two variable verify impact
	    @FindBy(xpath="//button[@type='submit']") private WebElement ContineuButton;
	    
//@FindBy(xpath="//button[@type='submit']")
   //2.
        public KiteCoutinuePage(WebDriver driver)
        {
        	PageFactory.initElements(driver,this);
        }
        
        //3.
        
        public void enterpin(String pin)
        {
        	
        	ContinuePIN.sendKeys(pin);
        }
        public void ClickOnContinueButton()
        {
        	ContineuButton.click();
}
}

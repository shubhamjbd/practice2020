package vishalKitePOMClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VishalKiteHomePage {
	//1.
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOutButton;
	
	
	
	//2.
	
   public VishalKiteHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   //3.
   public String getActualUserID()
   {
	   String actualUserID = userid.getText();
	return actualUserID;
   }
   
   public void Logout() throws InterruptedException
   {
	   userid.click();
	   Thread.sleep(100);
   }
   
}
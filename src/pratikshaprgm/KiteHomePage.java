package pratikshaprgm;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class KiteHomePage {
		//1.
			@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
			@FindBy(xpath="//a[@target='_self']") private WebElement LogOutButton;
			
			//2.
			public KiteHomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//3.
			public String getActualUserID()
			{
				String actualUserID = userid.getText();
				return actualUserID;
				
				//we will verify using TestNG so not using if-else statement
				
				
			}
			public void logout() throws InterruptedException
			{
				userid.click();
				Thread.sleep(100);
				LogOutButton.click();
				
			}
	}



package zeodhaUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Kite_Test {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();  
			
			driver.get("https://kite.zerodha.com//");  //getting main page
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			POM1_KiteLogInPage LogIn=new POM1_KiteLogInPage(driver);
			LogIn.SendUserId();
			LogIn.SendPassword();
			LogIn.ClickOnLoginButton();
			Thread.sleep(2000);
			
			
			POM2_KitePinPage PinPage= new POM2_KitePinPage(driver);
			PinPage.SendPin();
			PinPage.ClickOnContinueButton();
			Thread.sleep(2000);
			
			
			POM3KiteHomepage homePage=new POM3KiteHomepage(driver);
			homePage.ValidateUserID();
			homePage.ClickOnLogout();
			
			driver.close();
 	}

}

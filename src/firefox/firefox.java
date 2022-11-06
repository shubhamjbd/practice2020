package firefox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.gecko.driver","C:\\Users\\sir\\Desktop\\geckodriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();  
		
		driver.get("https://skpatro.github.io/demo/links/");  //getting main page
		driver.manage().window().maximize();
		Thread.sleep(2000);
 
	}

}

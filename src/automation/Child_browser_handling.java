package automation;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Child_browser_handling {

	public static void main(String[] args) throws InterruptedException, IOException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://skpatro.github.io/demo/links/");  //getting main page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//==>getting main page id
//		String MainPageWindowId=driver.getWindowHandle();
//		System.out.println("window id of main page is "+MainPageWindowId);
//		
		//opening child browser pop up
		
		driver.findElement(By.name("NewWindow")).click();
		
		//now we got multiple windows that is one main page window and one child browser window
		
		//getting child_browesers window ID
		
		Set<String> AllwindowsID=driver.getWindowHandles();    //====>getting IDs of child windows
		System.out.println("All windows IDs are "+AllwindowsID); //output in the form string array
		 
		//but there are number of IDs so to fetch individual IDS we uses ITERATION concept
		Iterator<String> IT=AllwindowsID.iterator();  //=====>pointing to -1 index memory
		String MainPgeID=IT.next();
		String ChilPageID=IT.next();
		
		
		//==>now switching selenium focus  to child page
		
		Thread.sleep(2000);
		
		driver.switchTo().window(ChilPageID); //==>focus switched to child page
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys(";ife without excpectation");
		Thread.sleep(02000);
		
		//Switching to main page  
		
		driver.switchTo().window(MainPgeID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();		
		
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='alerts']")).click();
		
		//practice alert pop handling from here
		
		//taking screenshot
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str=RandomString.make(3);     //===>need to importing 
		
		File dest=new File("C:\\selenium screenshot\\childbrowser screenshot\\"+str+"image.png");//=====>need // double slash not single
		                                                       //if u do not give name as something.png then it will take last string as image name
		                                                       // and instead of copying image in desire folder it will take only previous folder
		
		
		FileHandler.copy(source, dest);//====>need to throw exception
	}

}

package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop_up{
	
public static void main(String[] args) throws InterruptedException{
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();             



driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
Thread.sleep(4000);

WebElement clickMeButton=driver.findElement(By.xpath("(//button[text()='Click me'])[1]") );

clickMeButton.click();
Thread.sleep(02000);

//creating class of alert and switching to alert popup using alert interface

Alert alt=driver.switchTo().alert();     //switching to alert popup

alt.getText();      //getting text from alert popup
System.out.println("the text on pop up is ==>"+alt.getText());

 String alertText =alt.getText();
System.out.println("text on the alert pop up is by second way "+alertText);
 Thread.sleep(2000);
 alt.dismiss();
 
 WebElement clickOnClickButton =driver.findElement(By.id("timerAlertButton"));  //opening second popup
 clickOnClickButton.click();
 
 Thread.sleep(6000);
 System.out.println("the text on 2nd  pop up is ==>"+alt.getText());
 alt.accept();
// Boolean result=clickOnClickButton.click();
 
 
 //System.out.println("print result of dissmiss is "|+ alt.dismiss);
//WebElement getdismissButton=((Alert) driver).dismiss();
//Boolean result =alt.click();
//
// if( alt.dismiss())
//{
//  System.out.println("alert pop is dissmissed test case is passed");
//}
//else{
//	System.out.println("alert window not dismised /n test case is failed");
//}
////}








}


}



 
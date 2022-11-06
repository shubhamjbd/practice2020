package vishalUtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class VishalUtility_class 
{
	static Sheet Mysheet;
	public static String readDataFromExcel(int rowIndex, int coloumIndex ) throws EncryptedDocumentException, IOException
	{
		FileInputStream MyFile=new FileInputStream("C:\\\\Users\\\\sir\\Desktop\\apachepoi\\Sheet3.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet5");
		String value = mysheet.getRow(rowIndex).getCell(coloumIndex).getStringCellValue();
		return value;

	}
	
	public static void takeScreenshot(WebDriver driver,int TCID ) throws IOException
	{
		 
	
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("H:\\Selenium_Study\\screenshot\\TC"+TCID+"Screenshot.png");
		FileHandler.copy(scr, destination);
		Reporter.log("screenshot taken for TC"+TCID,true);
		
	}
	
}
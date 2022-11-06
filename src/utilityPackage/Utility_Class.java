package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_Class {

	static Sheet Mysheet;
	//public static String readDataFromExcel;
	public static String readDataFromExcel(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		 FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\sir\\Desktop\\apachepoi\\Sheet3.xlsx");
		  Mysheet =WorkbookFactory.create(Myfile).getSheet("Sheet5");
		                                                                    // HSSFWorkBook wb=new HSSFWorkBook ();
		String value= Mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;
	}
	
	
	public static void takeScreenshot(WebDriver driver,int TCID ) throws IOException
	{
		
		  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println("source"); 
		  
	 
		File dest=new File("C:\\selenium screenshot\\TC"+TCID+"image.png");   //you forgotten image.png
	    FileHandler.copy(source, dest);
	    
	    Reporter.log("screenshot taken for TC"+TCID,true);
	 
	}
}

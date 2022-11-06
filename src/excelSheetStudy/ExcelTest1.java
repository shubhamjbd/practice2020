package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
 
		
		//file path is given and stored file in reference  variable
		
		FileInputStream MyFile= new FileInputStream("C:\\Users\\sir\\Desktop\\apachepoi\\Book1.xlsx");
		
		String value=WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
	
		
		System.out.println("data from excelsheet is "+value);                         //u forgotten to save the changes
	
		
	//so every time we have to create object of class name fileinputstream having argument path of excel file
		
		
		FileInputStream MyFile1= new FileInputStream("C:\\Users\\sir\\Desktop\\apachepoi\\Book1.xlsx");
		
		String value1=WorkbookFactory.create(MyFile1).getSheet("Sheet2").getRow(11).getCell(2).getStringCellValue();
		System.out.println("data from excelsheet is "+value1);  
		
		 
		

	
	}

}

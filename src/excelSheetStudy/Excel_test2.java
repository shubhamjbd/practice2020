package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
                                                           
		//reading single row ,STATIC CODING
		
		FileInputStream MyFile= new FileInputStream("C:\\Users\\sir\\Desktop\\apachepoi\\sheet3.xlsx");
		Sheet Mysheet=WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		for(int i=0;i<=3;i++)
		{
		 String Value=Mysheet.getRow(0).getCell(i).getStringCellValue();
		 System.out.print(Value+"| ");
		}
		
	   System.out.println();
		
		
		
		
		for(int i=0;i<=3;i++)
		{
		 String Value=Mysheet.getRow(1).getCell(i).getStringCellValue();
		 System.out.print(Value+"| ");
		}
		
				
				
				
		 
 
			
			
	}

}




 
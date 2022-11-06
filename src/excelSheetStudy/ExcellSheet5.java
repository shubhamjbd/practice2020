package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 

public class ExcellSheet5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     

		FileInputStream Myfile=new FileInputStream("C:\\Users\\sir\\Desktop\\apachepoi\\ExcelTest2.xlsx");
		
		Sheet Mysheet=WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		//obtaining the data type of cell
		
		//FIRST ROW with columns
		
		 CellType   type1 = Mysheet.getRow(0).getCell(0).getCellType();
		 CellType   type2 = Mysheet.getRow(0).getCell(1).getCellType();
		 CellType   type3 = Mysheet.getRow(0).getCell(2).getCellType();
		 CellType   type4 = Mysheet.getRow(0).getCell(3).getCellType();
		// CellType   type5 = Mysheet.getRow(0).getCell(4).getCellType();
		
		//SECOND ROW with columns
		
	    // CellType   type6 = Mysheet.getRow(1).getCell(0).getCellType();
		 //CellType	type7 = Mysheet.getRow(1).getCell(1).getCellType();
		 //CellType	type8 = Mysheet.getRow(1).getCell(2).getCellType();
		 
	//first row and columns
		 
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		//System.out.println(type5);
	System.out.println("=========================");	
	//second row with columns
		
		//System.out.println(type6);//1,0
		//System.out.println(type7);//1,1
		//System.out.println(type8);//1,2
	
	//obtaining those value because now we have the data type of each string 
	
	String value1= Mysheet.getRow(0).getCell(0).getStringCellValue();
	double value2= Mysheet.getRow(0).getCell(1).getNumericCellValue();
  boolean value3= Mysheet.getRow(0).getCell(2).getBooleanCellValue();
   String value4= Mysheet.getRow(0).getCell(3).getStringCellValue();
		
	
 System.out.println(value1); 
 System.out.println(value2); 
 System.out.println(value3); 
 System.out.println(value4); 
 
	 
	}

	 
	}



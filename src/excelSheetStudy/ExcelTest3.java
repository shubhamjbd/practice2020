package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest3 {

	private static final String Set = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
   //reading whole Excel:static coding
		
		FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\sir\\\\Desktop\\\\apachepoi\\\\Sheet3.xlsx");
		
		Sheet Mysheet=WorkbookFactory.create(Myfile).getSheet("Sheet3");
	
		//static loop,where we have known already number of row and column size
		//but keep in mind we have to start from zero zero zero zero zero zero 
		
	for(int i=0;i<=1;i++) {
		
		for(int j=0;j<=3;j++) //here actual columns are 4 but for indexing start from 0
		{
	             String valuesOfRowsAndColumns=Mysheet.getRow(i).getCell(j).getStringCellValue();
	             System.out.print(valuesOfRowsAndColumns+"|| ");
		}
		System.out.println();
		
//		ArrayList <String> arr=new ArrayList<>();
//		arr.add(Mysheet);
	}	
	}

}

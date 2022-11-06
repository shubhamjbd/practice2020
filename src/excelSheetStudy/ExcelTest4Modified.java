package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest4Modified {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
 

		FileInputStream Myfile=new FileInputStream("C:\\\\Users\\\\sir\\\\Desktop\\\\apachepoi\\\\sheet3.xlsx");
		
		Sheet Mysheet=WorkbookFactory.create(Myfile).getSheet("Sheet4");
		
		//method for getting  rows from excel
		
		int totalNoOfRows=Mysheet.getLastRowNum();
		//System.out.println("total number of rows in which certain content is pesent,counting from 0(0,1)==>"+lastRowNum);
		
		//Method for getting no. of cell up to  which certain content is present
		
		int TotalNoOfColumn=Mysheet.getRow(0).getLastCellNum()-1;  //you can minus 1 at here
		//System.out.println("total no of column up to certain content is present,counting from 1==> "+lastCellNo);
		 
		// loop for getting excel value
		
		//saving  total no of column and total no. of rows in separate reference variable
	//	int totalNoOfRows=lastRowNum;  //o to 1
	//	int TotalNoOfColumn=lastCellNo;//1 to 5,,,you can minus 1 at here
		
		//now we can print table element by the help of only column address
		//whereas we can only reach at position of row by the help of Row number
	    //there fore writing the code from column loop
		
		for(int i=0;i<=totalNoOfRows;i++)
		{	
			for (int j=0;j<=TotalNoOfColumn;j++)
		          {
		            String valuesOfRowsAndColumns=Mysheet.getRow(i).getCell(j).getStringCellValue();
                    System.out.print(valuesOfRowsAndColumns+"|| ");
		          }
			
			    System.out.println();
		}
		
		
		
	}

}

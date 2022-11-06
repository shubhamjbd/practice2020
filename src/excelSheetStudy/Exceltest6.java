package excelSheetStudy;

import java.io.FileInputStream;
 
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceltest6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 

		FileInputStream Myfile=new FileInputStream("C:\\Users\\sir\\Desktop\\apachepoi\\sheet3.xlsx");
		
		Sheet Mysheet=WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		//to know the total row count of our table
		int TotalRowCount=Mysheet.getLastRowNum();
		int TotalColumnCount =Mysheet.getRow(0).getLastCellNum()-1;
		
	for(int i=0;i<=TotalRowCount;i++) 
	{	
		
		for(int j=0;j<=TotalColumnCount;j++)
		{
			Cell info = Mysheet.getRow(i).getCell(j);
			CellType type = info.getCellType();
			
			Row reaching_To_Row=Mysheet.getRow(i);   //we have to import row interface
			reaching_To_Row.getRowStyle();
			//System.out.println("print row styl e "+reaching_To_Row); kay ahe he search kar
			//no need to use for different for row once done for column no need 
			
			if(type==CellType.STRING) 
			{
				String value=info.getStringCellValue();
				System.out.print(value+ "|| ");
			}
			else if(type==CellType.NUMERIC)
			{
				double value=info.getNumericCellValue();
				System.out.print(value+ " ||");
			}
			else if(type==CellType.BOOLEAN) 
			{
				boolean value=info.getBooleanCellValue();
				System.out.print(value+ "|| ");
			}
			
		}
     	System.out.println();	
    }

	}

}

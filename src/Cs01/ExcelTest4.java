package Cs01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");		

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		// method for getting rows form excel
		int lastRowNum = Mysheet.getLastRowNum();
		System.out.println("Last row num is "+lastRowNum);
		int TotalNumberofRows = lastRowNum;//2
		
		//method for getting cells
		short lastCellNum = Mysheet.getRow(0).getLastCellNum();
		System.out.println("Last cell num is "+lastCellNum);
		int TotalNumofColumns = lastCellNum-1;//5
		
		
		for(int i=0;i<=TotalNumberofRows;i++)//outer--> row
		{
			for(int j=0;j<=TotalNumofColumns;j++)
			{
		String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
			}
			System.out.println();
			}
		
		
		
	}	
		
	}

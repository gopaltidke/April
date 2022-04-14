package Cs01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelTest6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");		

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		int totalRowCount = Mysheet.getLastRowNum();
		int totalColumnCount = Mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalRowCount;i++)// outer for row
		{
			for(int j=0;j<=totalColumnCount;j++)// inner for column
			{
				
				Cell info = Mysheet.getRow(i).getCell(j);
				CellType type = info.getCellType();// STRING,NUMERIC,BOOLEAN
				
			if(type==CellType.STRING)
				{
					String value = info.getStringCellValue();
					System.out.print(value+" ");
				}
				else if (type==CellType.NUMERIC)
				{
					double value = info.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if (type==CellType.BOOLEAN) 
				{
				boolean value = info.getBooleanCellValue();
				System.out.print(value+" ");
				}
			}
			
			System.out.println();
			
		}

	}

}
package Cs01;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//      file path is given and stored file in ref variable 
		
		
//		String value = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
//	
//		System.out.println("Data form excel is "+value);
//		
//		
//		double value1 = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(2).getNumericCellValue();
//	
//		System.out.println("Data form excel is "+value1);
//		
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");		
		
		Workbook test = WorkbookFactory.create(MyFile);
		Sheet Mysheet = test.getSheet("Sheet1");
	
		
		System.out.print(Mysheet.getRow(0).getCell(0).getStringCellValue());
		System.out.print(" "+Mysheet.getRow(0).getCell(1).getStringCellValue());
		System.out.print(" "+Mysheet.getRow(1).getCell(0).getStringCellValue());
		System.out.print(" "+Mysheet.getRow(1).getCell(1).getStringCellValue());
		
	}

}
package Cs01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");

		String value = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
			System.out.println("Data form excel is "+value);
			
			
//			double value1 = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(2).getNumericCellValue();
//		
//			System.out.println("Data form excel is "+value1);
		}

}
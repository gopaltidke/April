package Cs01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest2 {
//reading single row--> static coding
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");		

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		for(int i=0;i<=3;i++) 
			
		{
		String Value = Mysheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(Value);
		}
	}

}
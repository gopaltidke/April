package Cs01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");		

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		CellType type1 = Mysheet.getRow(0).getCell(0).getCellType();
		CellType type2 = Mysheet.getRow(0).getCell(1).getCellType();
		CellType type3 = Mysheet.getRow(0).getCell(2).getCellType();
		CellType type4 = Mysheet.getRow(0).getCell(3).getCellType();
		CellType type5 = Mysheet.getRow(0).getCell(4).getCellType();
		CellType type6 = Mysheet.getRow(0).getCell(5).getCellType();
		
//		System.out.println(type1);
//		System.out.println(type2);
//		System.out.println(type3);
//		System.out.println(type4);
		
		String value1 = Mysheet.getRow(0).getCell(0).getStringCellValue();
		double value2 = Mysheet.getRow(0).getCell(1).getNumericCellValue();
		boolean value3 = Mysheet.getRow(0).getCell(2).getBooleanCellValue();
		String value4 = Mysheet.getRow(0).getCell(3).getStringCellValue();
		String value5 = Mysheet.getRow(0).getCell(4).getStringCellValue();
		String value6 = Mysheet.getRow(0).getCell(5).getStringCellValue();

		System.out.println(type1+" "+value1);
		System.out.println(type2+" "+value2);
		System.out.println(type3+" "+value3);
		System.out.println(type4+" "+value4);
		System.out.println(type5+" "+value5);
		System.out.println(type6+" "+value6);
		
		
	}

}
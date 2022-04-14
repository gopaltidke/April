package Cs01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest3 {
// reading whole excel-->static coding
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");		

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		for(int i=0;i<=1;i++) //outer for loop--> row 0-1	
		{
			for(int j=0;j<=3;j++)//inner for loop--> cell/column 0-3
			{
				String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
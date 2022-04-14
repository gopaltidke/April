package pomandddf;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Cs04KiteTestWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		String myUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String myPassword = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String myPin = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
		//System.setProperty("webdriver.ie.driver", "D:\\gopal\\internet explorer\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		//InternetExplorerOptions opt =new InternetExplorerOptions();
       
		//WebDriver driver= new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\velocity\\today\\chromedriver_win32\\chromedriver.exe");
  
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("incognito");
		WebDriver driver= new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Cs01KiteLoginPage login= new Cs01KiteLoginPage(driver);
		login.enterUserID(Mysheet.getRow(0).getCell(0).getStringCellValue());
		login.enterPAssword(myPassword);
		login.clickOnLoginButtton();
		
		Thread.sleep(1000);
		Cs02KitePinPage pin= new Cs02KitePinPage(driver);
		pin.enterPin(myPin);
		pin.clickonContinueButton();
		
		Thread.sleep(1000);
		Cs03KiteHomePage home= new Cs03KiteHomePage(driver);
		home.validateUserID(myUserID);
		home.logout();
		
		driver.quit();
		
		
		
		

	}

}

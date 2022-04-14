package Cs01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
		
		FileInputStream MyFile= new FileInputStream("D:\\gopal\\Book1.xlsx");		

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		String myUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String myPassword = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String myPin = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\gopal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement userIDField = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userIDField.sendKeys(myUserID);
		password.sendKeys(myPassword);
		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(myPin);
		continueButton.click();
		
		Thread.sleep(1000);
		
		WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserID = userID.getText();
		String expectedUserID = myUserID;
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID  matching TC passed");
		}
		else {
			System.out.println("User ID not matching TC failed");
		}
		
		userID.click();
	//	WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		//logOutButton.click();
		//driver.close();

	}


	}
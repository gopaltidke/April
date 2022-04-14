package facebook_book;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Fbbhau {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	 System.setProperty("webdriver.ie.driver", "D:\\velocity\\New folder\\gopal\\internet explorer\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
     InternetExplorerDriver driver = new InternetExplorerDriver();
	
	 
//     driver.get("https://vctcpune.com/");
//	 driver.manage().window().maximize();
//	 Thread.sleep(2000);
//	 driver.close();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
		WebElement clicknewac = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		clicknewac.click();
		
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Gopal");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Tidke");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("7620075718");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("7620075718");
		
		//
		 List<WebElement> day = driver.findElements(By.xpath("//div//span//select[1]//option"));
//		
		Object day1 = day.size();
		System.out.println(day1);
//		 
//	
		
		//System.out.println(dayu);
//		
//		WebElement month = driver.findElement(By.id("month"));
//		
//		System.out.println(month.getSize());
	
}}

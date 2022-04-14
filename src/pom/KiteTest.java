package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\gopal\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "D:\\gopal\\edge0264\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver= new EdgeDriver();
	
//	System.setProperty("webdriver.ie.driver", "D:\\gopal\\internet explorer\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
//	WebDriver driver= new InternetExplorerDriver();
	
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Cs01KiteLoginPage login= new Cs01KiteLoginPage(driver);
		login.sendUserID();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		Cs02KitePinPage pin= new Cs02KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		Cs03KiteHomePage home= new Cs03KiteHomePage(driver);
	//	home.validateUserID();
	//	home.clickOnLogout();
		Thread.sleep(1000);
	    
		//driver.close();
	//driver.quit();
	}

}
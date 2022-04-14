package assertequal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT1 {
 @Parameters("browserName")
	@Test
  public void CrossBrowser(String browserName) throws InterruptedException 
 {
	 WebDriver driver=null;
	 
	 if(browserName.equals("chrome"))
	 {
		System.setProperty("webdriver.chrome.driver","D:\\velocity\\New folder\\gopal\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();
	 }
	 
	 else if (browserName.equals("firefox"))
	 {
			System.setProperty("webdriver.gecko.driver", "D:\\velocity\\New folder\\gopal\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 driver= new FirefoxDriver();
	}
	 
	 else if (browserName.equals("Iexposer")) {
		 System.setProperty("webdriver.ie.driver", "D:\\velocity\\New folder\\gopal\\internet explorer\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
	      driver= new InternetExplorerDriver();
	}
	 
	 else if (browserName.equals("edge"))
	 {
	System.setProperty("webdriver.edge.driver","D:\\velocity\\New folder\\gopal\\fire\\msedgedriver.exe");
	   driver = new EdgeDriver();
	}
	 
  
	 driver.get("https://vctcpune.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.close();
 }
}
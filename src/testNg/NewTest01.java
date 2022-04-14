package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest01 {
  @Test
  public void f() {
	  System.out.println("test ng running");
	  Reporter.log("welcome to test ng" , true);
  }
  @Test
  public void linko() {
	  System.setProperty("webdriver.chrome.driver","C:\\gopal\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
  }
  @Test
  public void linko2() {
	  System.setProperty("webdriver.chrome.driver","C:\\gopal\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
  }
  @Test
  public void linko3() {
	  System.setProperty("webdriver.chrome.driver","C:\\gopal\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps/@18.8154265,76.7751434,7z");
		driver.manage().window().maximize();
  }
}

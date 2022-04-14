package testng01;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void ValidateUserID()
  {
	  Reporter.log("Running test",true);
  }
  
 
  
  @BeforeMethod
  public void loginToKite()
  {
	  Reporter.log("Logging in.....",true);  
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Launching browser",true);
  }
  
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing browser",true);
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logging out....",true);
  }
  
  }
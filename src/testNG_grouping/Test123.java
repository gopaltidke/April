package testNG_grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test123 {
	 @Test
	  public void TC6() 
	  {
		  Reporter.log("Running TC6", true);
	  }
	  
	  @Test
	  public void TC7() 
	  {
		  Reporter.log("Running TC7", true);
	  }
	  
	  @Test
	  public void TC8() 
	  {
		  Reporter.log("Running TC8", true);
	  }
	  
	  @Test
	  public void TC9() 
	  {
		  Reporter.log("Running TC9", true);
	  }
	  
	  @Test
	  public void TC10() 
	  {
		  Reporter.log("Running TC10", true);
	  }
}
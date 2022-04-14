package testng01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
	  @Test(priority = 1)
	  public void a()
	  {
		  Reporter.log("Running A method", true);
	  }
	 
	  @Test(priority = -2)
	  public void c()
	  {
		  Reporter.log("Running C method", true);
	  }
	  @Test(priority = 1)
	  public void b()
	  {
		  Reporter.log("Running B method", true);
	  }
	 
}
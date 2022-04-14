package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends_on_method {
	
  @Test(dependsOnMethods = "tc2")
  public void tc1() {
	  Reporter.log("tc is passed",true);
  
  }
  @Test
  public void tc2() {
	  Reporter.log("tc is passed",true);
  
  }
  @Test(dependsOnMethods = "tc1")
  public void tc3() {
	  Reporter.log("tc is passed",true);
 
  }
}

package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
  @Test (priority = 0)
  public void tc1() {
	  Reporter.log("tc puri 1 ",true);
	  System.out.println("tc1 is pass ye syso ");
  }
  @Test (priority = 3)
  public void tc2() {
	  Reporter.log("tc 2 is pass",true);
  }
  @Test  (priority = 1)
  public void tc3() {
	  Reporter.log("tc 3 pass",true);
  }
  @Test (priority = 2)
  public void tc4() {
	  Reporter.log("tc 4 pass",true);
  }
  
  
  
}

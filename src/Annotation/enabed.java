package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabed {
  @Test(enabled = true)
  public void tc1() {
	Reporter.log("tc1",true);  
  }
  @Test(enabled = false)
  public void tc2() {
	  Reporter.log("tc2",true);
  }
  @Test(enabled = true)
  public void tc3() {
	  Reporter.log("tc3",true);  
  }
  @Test(enabled = false)
  public void tc4() {
	  Reporter.log("tc",true);
  }
  
  
  
  
  
  
  
}

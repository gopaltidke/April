package Annotation.Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
  @Test (timeOut = 1000)
  public void tc1() throws InterruptedException {
	  Thread.sleep(1000);
	  Reporter.log("tc 1 pass");
  }
  @Test (timeOut = 1000)
  public void tc2() {
	  
	  Reporter.log("tc 2 is pass");
  }
}

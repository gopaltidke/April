package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class annocation_count{
 
	@Test(invocationCount = 2)
	public void tc1() {
		Reporter.log("tc1 is passed",true);
	}
	@Test(invocationCount = 5)
	public void tc2() {
		Reporter.log("tc2 is passed",true);
	}
	}
	
	
	


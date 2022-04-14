package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaion01 {
	@BeforeClass
	public void webpageopen() {
		Reporter.log("1",true);
	}
	@BeforeMethod
	public void log_in_page() {
		Reporter.log("2",true);
	}
	@Test
	public void useridpass(){
		Reporter.log("3 ",true);	
	}

	@Test
	public void useridpass1(){
		Reporter.log("31 ",true);	
	}
	@AfterMethod
	public void login_page() {
		Reporter.log("4",true);
	}
	@AfterClass
	public void log_out_page() {
		Reporter.log("5",true);
	}
	
  
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

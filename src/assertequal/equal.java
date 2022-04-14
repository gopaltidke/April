package assertequal;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class equal {
	SoftAssert s = new SoftAssert();
	
	
  @Test
  public void f() {
	  String a="gopal";
	  String a1="gopal";
	 // assertEquals(false, false);
	  s.assertEquals(a, a1,"tc is not matching");
	  s.assertAll();
  }
 
	  @Test
	  public void f1() {
		  String b="gopal";
		  String b1="gop";
		 // assertEquals(false, false);
		  s.assertEquals(b, b1,"tc is not matching");
		  s.assertAll();
	  }
	 
		  @Test
		  public void f2() {
			  String c="gopal";
			  String c1="gopal";
			 // assertEquals(false, false);
			  s.assertEquals(c, c1,"tc is not matching");
			  s.assertAll();
		  }
}

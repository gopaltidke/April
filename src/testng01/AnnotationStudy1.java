package testng01;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class AnnotationStudy1 {
  @Test
  public void a()
  {
	  Reporter.log("Running A method", true);
  }
 
  @Test
  public void c()
  {
	  Reporter.log("Running C method", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("Running B method", true);
  }
 
}
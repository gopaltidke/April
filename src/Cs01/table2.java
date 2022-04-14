package Cs01;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class table2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
	"C:\\gopal\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(1000);
////table[@id='product']//tr[1]//th
			
			List<WebElement> cocunt = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
			
			for(int i=0; i<cocunt.size();i++)
			{
				WebElement option = cocunt.get(i);
				String text = option.getText();
				System.out.print(" "+text);
			}
			
			//relative
//			List<WebElement> columnCount = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
//
//			System.out.println("Total number of columns are " + columnCount.size());
//			int TotalNumberOfcolumns = columnCount.size();
//			                                                            //relative
//			List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='product']//tr"));
//
//			System.out.println("Toatl number of rows are " + rowCount.size());
//			int TotalNumberOfRows = rowCount.size();
//
//			// outer for loop--> for rows
//			for (int i = 1; i <= TotalNumberOfRows; i++) {
//				String text;
//				// inner for loop--> for cloumns
//				for (int j = 1; j <= TotalNumberOfcolumns; j++) {
//					if (i == 1) {
//						text = driver.findElement(By.xpath("//table[@id='product']//tr[" + i + "]//th[" + j + "]"))
//								.getText();
//						System.out.print(text + " ");
//					}
//
//					else {
//						text = driver.findElement(By.xpath("//table[@id='product']//tr[" + i + "]//td[" + j + "]"))
//								.getText();
//						System.out.print(text + " ");
//
//					}
//
//				}
//				System.out.println();
//
//			}

		}


}


package testng_pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class KiteHomePage
{
//1.
@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
//2.
public KiteHomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
//3.
public String getActualUserID()
{
String actualUserID = userID.getText();
return actualUserID;
// we will verify using TestNG asserts so not using if-else statement
// if(actualUserID.equals(expectedUserID))
// {
// System.out.println("User ID is matching TC is passed");
// }
// else {
// System.out.println("User ID is not matching TC is failed");
// }
}
public void logout() throws InterruptedException
{
userID.click();
Thread.sleep(100);
logoutButton.click();
}
}

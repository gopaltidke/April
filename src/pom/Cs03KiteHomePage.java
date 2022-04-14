package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cs03KiteHomePage
{
	//1.
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	
	//2.
	
	public Cs03KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//3.
	public void validateUserID()
	{
		String actualUserID = userID.getText();
		String expectedUserID="HD5857";
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID matching TC is passed");
		}
		
		else 
		{
		
			System.out.println("User ID not matching TC is failed");
		}
		
		
	}
	
	public void clickOnLogout() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		logoutButton.click();
	}
	
}
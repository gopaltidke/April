package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cs01KiteLoginPage
{
	//1. variable declaration-->WebElement
	
	@FindBy(id = "userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	


	//2. use constructor-->public
	
	public Cs01KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. methods which works on data members
	
	public void sendUserID()
	{
		UserID.sendKeys("HD5857");
	}
	
	public void sendPassword()
	{
		Password.sendKeys("Ajinkya@123");
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}

}
package testng_pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
  
	//1.variable declaration-->WebElement
	
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath = "//div//button[@type='submit']") private WebElement LoginButton;
	
	//2.use constructor
	
	public Kiteloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3 methods
	
	public void enterUserID(String uid)
	{
		UserID.sendKeys(uid);
	}
	public void enterPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}

	public void clickOnLoginButtton() {
		LoginButton.click();

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

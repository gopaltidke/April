package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cs02KitePinPage 
{
	//1.
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	//2.
	public Cs02KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//3.
	
	public void sendPin()
	{
		pin.sendKeys("969696");
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
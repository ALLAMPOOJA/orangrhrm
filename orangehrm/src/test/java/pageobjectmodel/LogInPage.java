package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	@FindBy(name="username")
	private WebElement username1;
	@FindBy(name="password")
	private WebElement password1;
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;
	public LogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setusername(String username)
	{
		username1.sendKeys(username);
		
	}
	public void setpassword(String password)
	{
		password1.sendKeys(password);
	}
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	
	
	

}

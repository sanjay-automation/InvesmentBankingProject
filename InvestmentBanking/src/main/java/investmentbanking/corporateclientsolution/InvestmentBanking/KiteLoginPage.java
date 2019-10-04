package investmentbanking.corporateclientsolution.InvestmentBanking;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//Declaration
	@FindBy(xpath="//input[@placeholder='User ID']")
	private WebElement user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@placeholder='PIN']")
	private WebElement pin;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement login;
	
	
	//Initialization
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setKiteLoginPageUser(String userid)
	{
		user.sendKeys(userid);
	}
	public void setKiteLoginPagePassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickKiteLoginPageSubmit()
	{
		//submit.click();
		submit.sendKeys(Keys.RETURN);
	}
	public void setKiteLoginPagePin(String pin2)
	{
		pin.sendKeys(pin2);
	}
	public void clickKiteLoginPageContinue()
	{
		login.click();
	}
	

}

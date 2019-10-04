package investmentbanking.corporateclientsolution.InvestmentBanking;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilityClasses.BaseClass;
import utilityClasses.Utility;

public class KiteTest extends BaseClass{
	KiteLoginPage kite;
	WebDriver driver;
	
	@BeforeMethod
	public void OpenApplication() {
		driver=openBrowser();
		kite=new KiteLoginPage(driver);
	}
	@Test
	public void LoginApplication() throws EncryptedDocumentException, IOException, InterruptedException {
		//fetch user id
		String user=Utility.fetchExcelData(1,0);
		kite.setKiteLoginPageUser(user);
		
		//fetch password
		String password=Utility.fetchExcelData(1,1);
		kite.setKiteLoginPagePassword(password);
		
		//submit data
		Utility.takeScreenshot();
		kite.clickKiteLoginPageSubmit();
		
		Thread.sleep(3000);
		//enter pin
		
		String pin=Utility.fetchExcelData(1,2);
		kite.setKiteLoginPagePin(pin);
		
		//continue login
		kite.clickKiteLoginPageContinue();
	}
	@AfterMethod
		public void closeApplication() {
		//driver.close();
		kite=null;
	}

}

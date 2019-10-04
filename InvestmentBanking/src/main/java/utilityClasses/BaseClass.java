package utilityClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static void main(String[] args) {
		openBrowser();
		
	}
static WebDriver driver;
	public static WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\eclipse-workspace\\InvestmentBanking\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}

}

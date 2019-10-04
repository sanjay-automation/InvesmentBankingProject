package investmentbanking.corporateclientsolution.InvestmentBanking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\eclipse-workspace\\InvestmentBanking\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com");

	}

}

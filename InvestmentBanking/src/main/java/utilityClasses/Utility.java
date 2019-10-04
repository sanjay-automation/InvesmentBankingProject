package utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.utility.RandomString;

public class Utility extends BaseClass{
	static WebDriver driver = openBrowser();
	
	public static String fetchExcelData(int row,int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream file=new FileInputStream("C:\\Users\\Sanjay\\eclipse-workspace\\InvestmentBanking\\ExcelData\\KiteLoginData.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static int fetchExcelNo(int row,int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream file=new FileInputStream("C:\\Users\\Sanjay\\eclipse-workspace\\InvestmentBanking\\ExcelData\\KiteLoginData.xlsx");
		int no=(int)WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getNumericCellValue();
		return no;
	}
	public static void takeScreenshot() throws IOException
	{
		String str=RandomString.make(2);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sanjay\\eclipse-workspace\\InvestmentBanking\\Screenshot\\login"+str+".jpg");
		FileUtils.copyFile(source, dest);
	}
	
	

}

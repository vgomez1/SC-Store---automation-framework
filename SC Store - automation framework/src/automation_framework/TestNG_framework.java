package automation_framework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import app_modules.SignIn_Action;
import utilities.Constants;
import utilities.ExcelUtils;
import utilities.Log;

public class TestNG_framework {

	private static WebDriver driver = null;
	private static String testCaseName = "SC Store - Sign in - TestCase 001"; 
	
	@BeforeMethod
	public void beforeMethod() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		
		Log.startTestCase(testCaseName);
		
		ExcelUtils.setExcelFile(Constants.testDataFile_path + Constants.testDataFile_name, "Sheet1");
		Log.info("Excel sheet opened...");
		
		String driverPath = "C:\\workspaceV\\Libraries\\chromedriver_win32\\chromedriver.exe";
		//IE		System.setProperty("webdriver.ie.driver", "D:\\workspace\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", driverPath);
		//FF		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vgomez1\\Documents\\geckodriver-v0.14.0-win64\\geckodriver.exe");		
		driver = new ChromeDriver();
		Log.info("New Driver instantiated...");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Implicit wait for 10 seconds...");
		
		driver.manage().window().maximize();
		Log.info("Maximizing window...");
		
		driver.get(Constants.URL);
		Log.info("Web application launched...");
	}
	
	@Test
	public void main() throws Exception{
		SignIn_Action.Execute(driver);
		Log.info("Sign in succesfully...");

		ExcelUtils.setCellData("Pass", 1, 3);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		Log.endTestCase(testCaseName);
		System.out.println("DONE...");
	}
}

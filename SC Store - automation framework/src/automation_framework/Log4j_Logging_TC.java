package automation_framework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import app_modules.SignIn_Action;
import utilities.Constants;
import utilities.ExcelUtils;
import utilities.Log;

public class Log4j_Logging_TC {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception{
	
		// Provide Log4j configuration settings
		DOMConfigurator.configure("log4j.xml");
		String testCaseName = "SC Store - Sign in - TestCase 001";
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
		
		SignIn_Action.Execute(driver);
		Log.info("Sign in succesfully...");

		ExcelUtils.setCellData("Pass", 1, 3);
		Log.endTestCase(testCaseName);
		System.out.println("DONE...");
		
		
		
		
	}

}

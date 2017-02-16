package automation_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import app_modules.SignIn_Action;
import utilities.Constants;

public class Parameters_TC {

		private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception
	{
		
		String driverPath = "C:\\workspaceV\\Libraries\\chromedriver_win32\\chromedriver.exe";
//IE		System.setProperty("webdriver.ie.driver", "D:\\workspace\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", driverPath);
//FF		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vgomez1\\Documents\\geckodriver-v0.14.0-win64\\geckodriver.exe");		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.URL);
		
		//Test case:  module Registration
//		RegisterNewUser_Action.Execute(driver);
		
		//Test case: module SignIn
		SignIn_Action.Execute(driver);
		
		System.out.println("DONE...");
	}
}

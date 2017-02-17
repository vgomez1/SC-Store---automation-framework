package automation_framework;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import app_modules.SignIn_Action;

import utilities.Constants;
import utilities.ExcelUtils;
import utilities.Log;
import utilities.Utils;

public class UserDefinedFunctions_TC {
	private static WebDriver driver = null;
	private static String sTestCaseName;
	private static int iTestCaseRow;
	
	@BeforeMethod
	public void beforeMethod() throws Exception{
		
		DOMConfigurator.configure("log4j.xml");
		
		sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(this.toString());
		
		Log.startTestCase(sTestCaseName);
			
		ExcelUtils.setExcelFile(Constants.testDataFile_path + Constants.testDataFile_name, "Sheet1");
		Log.info("Excel sheet opened...");
		
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constants.col_Browser);
		
		driver = Utils.openBrowser(iTestCaseRow);
		
	}
	
	@Test
	public void main() throws Exception{
		SignIn_Action.Execute(driver);
		Log.info("Sign in succesfully...");

		ExcelUtils.setCellData("Pass", 1, 3);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		Log.endTestCase(this.sTestCaseName);
		System.out.println("DONE...");
	}
}

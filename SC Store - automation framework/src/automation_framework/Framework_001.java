package automation_framework;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import app_modules.RegisterNewUser_Action;
import app_modules.SignIn_Action;
import pageObjects.BaseClass;
import utilities.Constants;
import utilities.ExcelUtils;
import utilities.Log;
import utilities.Utils;

public class Framework_001 {
	
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

	
	@BeforeMethod
	public void beforeMethod() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.startTestCase(sTestCaseName);
		
		ExcelUtils.setExcelFile(Constants.testDataFile_path + Constants.testDataFile_name, "Login");
		
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constants.col_TestCaseName);
		
		driver = Utils.openBrowser(iTestCaseRow);
		
		new BaseClass(driver);
		
		
	}

	@Test
	public void test() throws Exception{
		try{
			SignIn_Action.Execute(iTestCaseRow);
			RegisterNewUser_Action.Execute(iTestCaseRow);
			ExcelUtils.setCellData("Passed", iTestCaseRow, Constants.col_Status);
			
		}
		catch (Exception e){
			ExcelUtils.setCellData("Failed", iTestCaseRow, Constants.col_Status);
			throw e;
		}
		
	}
	
	@AfterTest
	public void afterTest(){
		
		
		Log.endTestCase(sTestCaseName);
//		driver.quit();
	}
	
}

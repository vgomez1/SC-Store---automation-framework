package app_modules;

import org.testng.Reporter;

import pageObjects.Home_Page;
import utilities.Constants;
import utilities.ExcelUtils;
import utilities.Log;

public class SignIn_Action {
	
		//private WebDriver driver = null;
	
	public static void Execute(int iTestCaseRow) throws Exception{
			
		String sUsername = ExcelUtils.getCellData(iTestCaseRow, Constants.col_UserName);
		String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constants.col_Password);
				
		//click LOGIN/REGISTER
		Home_Page.Header.lnk_loginRegister().click();
		Log.info("Click on LOGIN/REGISTER...");
		
		//Enter username and pwd
		Home_Page.Header.txtbx_email().sendKeys(sUsername);
		Log.info("UserName entered...");
		Home_Page.Header.txtbx_password().sendKeys(sPassword);
		Log.info("Password entered...");
		
		//click on Login
		Home_Page.Header.btn_login().click();
		Log.info("Click on login button...");
		
		Reporter.log("SignIn Action executed succesfully");
	
	}

}

package app_modules;


import org.testng.Reporter;

import pageObjects.Create_Account;
import pageObjects.Home_Page;
import utilities.Constants;
import utilities.ExcelUtils;
import utilities.Log;
import utilities.Utils;

public class RegisterNewUser_Action {

	public static void Execute(int iTestCaseRow) throws Exception{
		
		Home_Page.Header.lnk_loginRegister().click();
		Log.info("Click on link LOGIN / REGISTER...");
		Home_Page.Header.lnk_registerNow().click();
		Log.info("Click on link Register Now...");
		
		//wait for 5 seconds
		Utils.waitFor(5);
		
		//fetching info from Excel file using the testcase name within the file
		String firstName= ExcelUtils.getCellData(iTestCaseRow,Constants.col_firstName);
		String lastName = ExcelUtils.getCellData(iTestCaseRow, Constants.col_lastName);
		String postCode = ExcelUtils.getCellData(iTestCaseRow, Constants.col_postCode);
		String sIDCore = ExcelUtils.getCellData(iTestCaseRow, Constants.col_IDCore) ;
		//generating a new email
		sIDCore = Utils.generateEmail(sIDCore);
		String password = ExcelUtils.getCellData(iTestCaseRow, Constants.col_registrationPwd);
		
		Log.info("Filling down the registration form...");
		Create_Account.txtbx_FirstName().sendKeys(firstName);
		Log.info("First Name entered...");
		Create_Account.txtbx_LastName().sendKeys(lastName);
		Log.info("Last Name entered...");
		Create_Account.txtbx_PostCode().sendKeys(postCode);
		Log.info("Postal Name entered...");
		Create_Account.txtbx_Email().sendKeys(sIDCore);
		Log.info("Email entered...");
		Create_Account.txtbx_Password().sendKeys(password);
		Log.info("Password entered...");
		Create_Account.txtbx_PwdConfirmation().sendKeys(password);
		Log.info("Confimartion password entered...");
		Create_Account.btn_Submit().click();
		Log.info("Click on Submit...");
		
		
		Reporter.log("RegisterNewUser Action executed succesfully");
	}
}

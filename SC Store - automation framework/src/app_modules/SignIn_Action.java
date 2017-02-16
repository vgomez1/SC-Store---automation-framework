package app_modules;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;
import utilities.ExcelUtils;
import utilities.Log;

public class SignIn_Action {
	
		private WebDriver driver = null;
	
	public static void Execute(WebDriver driver) throws Exception{
		
		String username = ExcelUtils.getCellData(1,1);
		Log.info("Username: " + username);
		String password = ExcelUtils.getCellData(1,2);
		Log.info("Password: " + password);
		
		
		Home_Page.lnk_loginRegister(driver).click();
		Log.info("Click on LOGIN/REGISTER...");
		
		Home_Page.txtbx_email(driver).sendKeys(username);
		Log.info("Username entered...");
		
		Home_Page.txtbx_password(driver).sendKeys(password);
		Log.info("Password entered...");
		Home_Page.btn_login(driver).click();
	}

}

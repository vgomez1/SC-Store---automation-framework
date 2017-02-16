package app_modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.Create_Account;
import pageObjects.Home_Page;
import utilities.Calc_Utilities;

public class RegisterNewUser_Action {

	public static void Execute(WebDriver driver, String firstName, String lastName, 
			String postCode, String IDCore, String password){
		Home_Page.lnk_loginRegister(driver).click();
		Home_Page.lnk_registerNow(driver).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Create_Account.txtbx_FirstName(driver).sendKeys(firstName);
		Create_Account.txtbx_LastName(driver).sendKeys(lastName);
		Create_Account.txtbx_PostCode(driver).sendKeys(postCode);
		Create_Account.txtbx_Email(driver).sendKeys(Calc_Utilities.generateEmail(IDCore));
		Create_Account.txtbx_Password(driver).sendKeys(password);
		Create_Account.txtbx_PwdConfirmation(driver).sendKeys(password);
		Create_Account.btn_Submit(driver).click();
	}
}

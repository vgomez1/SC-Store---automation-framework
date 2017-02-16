package app_modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.Create_Account;
import pageObjects.Home_Page;
import utilities.Calc_Utilities;

public class RegisterNewUser_Action {

	public static void Execute(WebDriver driver){
		Home_Page.lnk_loginRegister(driver).click();
		Home_Page.lnk_registerNow(driver).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Create_Account.txtbx_FirstName(driver).sendKeys("Selenium");
		Create_Account.txtbx_LastName(driver).sendKeys("Tests");
		Create_Account.txtbx_PostCode(driver).sendKeys("64460");
		Create_Account.txtbx_Email(driver).sendKeys(Calc_Utilities.generateEmail("Selenium"));
		Create_Account.txtbx_Password(driver).sendKeys("Steelcase1");
		Create_Account.txtbx_PwdConfirmation(driver).sendKeys("Steelcase1");
		Create_Account.btn_Submit(driver).click();
	}
}

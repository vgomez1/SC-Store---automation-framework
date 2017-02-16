package automation_framework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Home_Page;
import utilities.Calc_Utilities;
import pageObjects.Create_Account;

public class POM_TestCase {

		private static WebDriver driver = null;
	
	public static void main(String[] args){
		
		//Open browser
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qastore.steelcase.com");
		
		//Usage of pageObject library
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
		
		System.out.println("Verify message appears on top");
		
		Create_Account.lbl_MailConfirmation(driver).isDisplayed();
		
		String msg = Create_Account.lbl_MailConfirmation(driver).getText();
		if(msg.contains("Account confirmation is required")){
			System.out.println("Mail Confirmation required");
		}
		else{
			System.out.println("Different message");
		}
		
		System.out.println("Done...");
//		driver.quit();
	}
}

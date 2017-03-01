package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class Create_Account extends BaseClass{

		private static WebElement element = null;
	
		public Create_Account(){
			super(driver);
		}
	public static WebElement txtbx_FirstName() throws Exception{
		try{
			element = driver.findElement(By.name("firstname"));
			Log.info("First Name text box found");
		}
		catch (Exception e){
			Log.error("First Name text box not found");
			throw e;
		}
	return element;
	}
	public static WebElement txtbx_LastName() throws Exception{
		try{
			element = driver.findElement(By.name("lastname"));
			Log.info("Last Name text box found");
		}
		catch (Exception e){
			Log.error("Last Name text box not found");
			throw e;
		}
		return element;
	}
	public static WebElement txtbx_Email() throws Exception{
		try{ 
			element = driver.findElement(By.name("email"));
			Log.info("Email text box found");
		}
		catch (Exception e){
			Log.error("Email text box not found");
			throw e;
		}
	return element;
	}
	
	public static WebElement txtbx_PostCode() throws Exception{
		try{ 
			element = driver.findElement(By.name("postcode"));
			Log.info("Postal code text box found");
		}
		catch (Exception e){
			Log.error("Postal code text box not found");
			throw e;
		}
	return element;
	}
	public static WebElement txtbx_Password() throws Exception{
		try{
			element = driver.findElement(By.name("password"));
			Log.info("Password text box found");
		}
		catch (Exception e){
			Log.error("Password text box not found");
			throw e;
		}
	return element;
	}
	public static WebElement txtbx_PwdConfirmation() throws Exception{
		try{
			element = driver.findElement(By.name("confirmation"));
			Log.info("Password Confirmation text box found");
		}
		catch (Exception e){
			Log.error("Password Confirmation text box not found");
			throw e;
		}
	return element;
	}
	public static WebElement btn_Submit() throws Exception{
//		element = driver.findElement(By.partialLinkText("Submit"));
		try{
			element = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span"));
			Log.info("Submit button found");
		}
		catch (Exception e){
			Log.error("Submit button not found");
			throw e;
		}
	return element;
	}
	public static WebElement lbl_MailConfirmation() throws Exception{
		try{
			element = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[3]"));
			Log.info("Mail Confirmation message found");
		}
		catch (Exception e){
			Log.error("Mail Confirmation message not found");
			throw e;
		}
	return element;
	}
}

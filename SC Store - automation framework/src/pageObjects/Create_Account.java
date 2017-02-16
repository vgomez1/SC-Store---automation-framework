package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class Create_Account {

private static WebElement element = null;
	
	public static WebElement txtbx_FirstName(WebDriver driver){
		element = driver.findElement(By.name("firstname"));
		Log.info("First Name text box found");
		return element;
	}
	public static WebElement txtbx_LastName(WebDriver driver){
		element = driver.findElement(By.name("lastname"));
		Log.info("Last Name text box found");
		return element;
	}
	public static WebElement txtbx_Email(WebDriver driver) {
		element = driver.findElement(By.name("email"));
		Log.info("Email text box found");
		return element;
	}
	public static WebElement txtbx_PostCode(WebDriver driver) {
		element = driver.findElement(By.name("postcode"));
		Log.info("Postal code text box found");
		return element;
	}
	public static WebElement txtbx_Password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		Log.info("Password text box found");
		return element;
	}
	public static WebElement txtbx_PwdConfirmation(WebDriver driver) {
		element = driver.findElement(By.name("confirmation"));
		Log.info("Password Confirmation text box found");
		return element;
	}
	public static WebElement btn_Submit(WebDriver driver) {
//		element = driver.findElement(By.partialLinkText("Submit"));
		element = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span"));
		Log.info("Submit button found");
		return element;
	}
	public static WebElement lbl_MailConfirmation(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[3]"));
		Log.info("Mail Confirmation message found");
		return element;
	}
}

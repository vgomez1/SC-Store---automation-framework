package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create_Account {

private static WebElement element = null;
	
	public static WebElement txtbx_FirstName(WebDriver driver){
		element = driver.findElement(By.name("firstname"));
		return element;
	}
	public static WebElement txtbx_LastName(WebDriver driver){
		element = driver.findElement(By.name("lastname"));
		return element;
	}
	public static WebElement txtbx_Email(WebDriver driver) {
		element = driver.findElement(By.name("email"));
		return element;
	}
	public static WebElement txtbx_PostCode(WebDriver driver) {
		element = driver.findElement(By.name("postcode"));
		return element;
	}
	public static WebElement txtbx_Password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement txtbx_PwdConfirmation(WebDriver driver) {
		element = driver.findElement(By.name("confirmation"));
		return element;
	}
	public static WebElement btn_Submit(WebDriver driver) {
//		element = driver.findElement(By.partialLinkText("Submit"));
		element = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span"));
		return element;
	}
	public static WebElement lbl_MailConfirmation(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[3]"));
		return element;
	}
}

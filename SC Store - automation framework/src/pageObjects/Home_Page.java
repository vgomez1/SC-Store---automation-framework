package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class Home_Page {

	private static WebElement element = null;
	
	public static WebElement lnk_loginRegister(WebDriver driver){
		element = driver.findElement(By.partialLinkText("REGISTER"));
		Log.info("LOGIN / REGISTER link found");
		return element;
	}
		
	public static WebElement lnk_registerNow(WebDriver driver){
		element = driver.findElement(By.partialLinkText("Register Now"));
		Log.info("Register Now... link found");
		return element;
	}
	
	public static WebElement txtbx_email(WebDriver driver){
		element = driver.findElement(By.id("email"));
		Log.info("Email text box found");
		return element;
	}
	
	public static WebElement txtbx_password(WebDriver driver){
		element = driver.findElement(By.id("pass"));
		Log.info("Password text box found");
		return element;
	}
	
	public static WebElement btn_login(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"top-login-form\"]/div[2]/div[1]/button/span/span"));
		Log.info("Submit button found");
		return element;
	}
	
}

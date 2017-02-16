package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	private static WebElement element = null;
	
	public static WebElement lnk_loginRegister(WebDriver driver){
		element = driver.findElement(By.partialLinkText("REGISTER"));
		return element;
	}
		
	public static WebElement lnk_registerNow(WebDriver driver){
		element = driver.findElement(By.partialLinkText("Register Now"));
		return element;
	}
	
	
}

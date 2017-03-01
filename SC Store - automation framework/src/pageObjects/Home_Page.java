package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class Home_Page extends BaseClass{

		private static WebElement element = null;
	
	public Home_Page(WebDriver driver){
		super(driver);
	}
	public static class Header{
		
		
		public static WebElement lnk_Cart() throws Exception{
			try { 
				element = driver.findElement(By.partialLinkText("CART"));
				Log.info("CART link found");
			
			}
			catch (Exception e){
				Log.error("CART link not found");
				throw e;
			}
			return element;
		}
		
		public static WebElement lnk_Checkout() throws Exception
		{
			try{
				element = driver.findElement(By.partialLinkText("CHECKOUT"));
				Log.info("CHECKOUT link found");
			
			}
			catch (Exception e){
				Log.error("CHECKOUT link not found");
			}
			return element;
			
		}
		
		public static WebElement lnk_loginRegister () throws Exception{
			try{
				element = driver.findElement(By.partialLinkText("REGISTER"));
				Log.info("LOGIN / REGISTER link found");
				
			}
			catch (Exception e){
				Log.error("LOGIN / REGISTER link not found");
				throw e;
			}
			return element;	
		}
			
		public static WebElement lnk_registerNow() throws Exception{
			try{
				element = driver.findElement(By.partialLinkText("Register Now"));
				Log.info("Register Now... link found");
			}catch (Exception e){
				Log.error("Register Now... link not found");
				throw e;
			}
			
			return element;
		}
		public static WebElement txtbx_email() throws Exception{
			try{
				element = driver.findElement(By.id("email"));
				Log.info("Email text box found");
			}
			catch (Exception e){
				Log.info("Email text box not found");
				throw e;
			}
			return element;
		}
		
		public static WebElement txtbx_password() throws Exception{
			try{
				element = driver.findElement(By.id("pass"));
				Log.info("Password text box found");
			
			}
			catch (Exception e){
				Log.info("Password text box not found");
				throw e;
			}
			return element;
		}
		
		public static WebElement btn_login() throws Exception{
			try{	
				element = driver.findElement(By.xpath("//*[@id=\"top-login-form\"]/div[2]/div[1]/button/span/span"));
				Log.info("Submit button found");	
			}
			catch (Exception e){
				Log.info("Submit button not found");
				throw e;
			}
				return element;
			}
		public static WebElement lnk_seating() throws Exception{
			try{	
				element = driver.findElement(By.partialLinkText("Seating"));
				Log.info("Seating link found");
			}
			catch (Exception e){
				Log.info("Seating link not found");
				throw e;
			}
			return element;
		}
		
		
		public static WebElement lnk_allSeating() throws Exception{
			try{	
				element = driver.findElement(By.partialLinkText("All Seating"));
				Log.info("All Seating link found");
			}
			catch (Exception e){
				Log.info("All Seating link not found");
				throw e;
			}
			return element;
		}
	}
	
	public static class Footer{

// Order Detail section		
		public static WebElement lnk_CustomerService() throws Exception{
			try{	
				element = driver.findElement(By.partialLinkText("Customer Service"));
				Log.info("Customer Service link found");
			}
			catch (Exception e){
				Log.info("All Seating link not found");
				throw e;
			}
			return element;
		}
	
		
		public static WebElement lnk_OrderInformation() throws Exception{
			try{ 	
				element = driver.findElement(By.partialLinkText("Order Information"));
				Log.info("Order Information link found");
			}
			catch (Exception e){
				Log.info("All Seating link not found");
				throw e;
			}
			return element;
		}
		
		//add more links as required
	}	
	
}

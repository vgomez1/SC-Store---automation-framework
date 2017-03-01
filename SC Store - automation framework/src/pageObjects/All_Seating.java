package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class All_Seating {
	private static WebElement element = null;
	public static class Product_1{
		
		public static WebElement lnk_productName(WebDriver driver){
			element = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div[2]/div[4]/div/div[2]/div/div[4]/div[2]/div[3]/ul/li[1]/h2/a"));
			Log.info("Product Name found...");
			return element;
		}
		
		public static WebElement lbl_productPrice(WebDriver driver){
			element = driver.findElement(By.xpath("//*[@id=\"product-price-544\"]/span[2]/text()"));
			Log.info("Product Price found...");
			return element;
		}
			
	}
	
	public static class Product_2{
		public static WebElement lnk_productName(WebDriver driver){
			element = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div[2]/div[4]/div/div[2]/div/div[4]/div[2]/div[3]/ul/li[2]/h2/a"));
			Log.info("Product Name found...");
			return element;
		}
		
		public static WebElement lbl_productPrice(WebDriver driver){
			element = driver.findElement(By.xpath("//*[@id=\"product-price-309\"]/span[2]/text()"));
			Log.info("Product Price found...");
			return element;
		}
	}
}

package utilities;

import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils {
	
	public static WebDriver driver = null;

	public static String generateEmail(String IDcore){
		//generates random email using format IDCoreYYMMDDmmhh@steelcase.com 
		String email = IDcore + LocalDateTime.now().getYear()
				+ LocalDateTime.now().getMonthValue()
	    		+ LocalDateTime.now().getDayOfMonth()
	    		+ LocalDateTime.now().getMinute()
	    		+ LocalDateTime.now().getSecond()
	    		+ "@steelcase.com";
		return email;
	}
	
	public static WebDriver openBrowser(int iTestCaseRow) throws Exception{
		
		String sBrowserName;
		
		try {
			sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constants.col_Browser);
		
		if (sBrowserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.gecko.driver", Constants.chromedriverPath);
				driver = new FirefoxDriver();
			}
		else if (sBrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.firefoxdriverPath);
			driver = new FirefoxDriver();
			logInfoMessages_OpenBrowser();
			
		}
		else if(sBrowserName.equalsIgnoreCase("Internet Explorer")){
			System.setProperty("webdriver.ie.driver", Constants.iePath);
			driver = new InternetExplorerDriver();
			logInfoMessages_OpenBrowser();
		}
		else {
			Log.warn("Browser not specified, initiating Chrome as default...");
			System.setProperty("webdriver.chrome.driver", Constants.chromedriverPath);
			driver = new ChromeDriver();
			logInfoMessages_OpenBrowser();
		}
	
	}catch (Exception e){
		throw e;
	}
		return driver;
	}
	
	private static void logInfoMessages_OpenBrowser(){
		Log.info("New Driver instantiated...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Implicit wait for 10 seconds...");
		driver.manage().window().maximize();
		Log.info("Maximizing window...");
		driver.get(Constants.URL);
		Log.info("Web application launched...");
	}
	
	public static String getTestCaseName(String sTestCase) throws Exception{
		String value = sTestCase;
		
		try{
			int position = value.indexOf("@");
			value = value.substring(0, position);
			position = value.lastIndexOf(".");
			value = value.substring(position + 1);
			return value;
		}
		catch (Exception e){
			Log.error("Class Utils | Method getTestCaseName | Exeption desc : " + e.getMessage());
			throw e;
		}
		
	}
	
	public static void mouseHoverAction(WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Log.info("Element " + element.getText().toString() + " found...");
	}
	
	public static void mouseHoverAction(WebElement mainElement, String subElementName){
		//If the main element has sub elements
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		//moving to subElement
		WebElement subElement = driver.findElement(By.partialLinkText(subElementName));
		action.moveToElement(subElement);
		Log.info("Sub Element " + subElementName + " found...");
	}
	
	public static void waitForElement(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitFor(int seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void takeScreenShot(WebDriver driver, String sTestCaseName) throws Exception{
		
		try{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(Constants.screenshotPath + sTestCaseName + ".jpg"));
		}
		catch (Exception e){
			Log.error("Class Utils | Method takeScreenshot | Exception occurred while capturing Screenshot : " + e.getMessage());
			throw e;
		}
		
	}
	
}

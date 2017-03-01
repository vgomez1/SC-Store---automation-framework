package utilities;

public class Constants {
	//URL 
	public static final String URL = "https://qastore.steelcase.com";
	
	//login credentials
	public static final String username = "sa_testid";
	public static final String password = "Steelcase1";
	
	
	//registration credentials: String firstName, String lastName, String postCode, String IDCore, String password){
/*	public static final String firstName = "Selenium";
	public static final String lastName = "Automation";
	public static final String postCode = "64460";
	public static final String IDCore = "sa_testid";
	public static final String registrationPwd = "Steelcase1";
*/	
	public static final int col_firstName = 6;
	public static final int col_lastName = 7;
	public static final int col_postCode = 8;
	public static final int col_IDCore = 9;
	public static final int col_registrationPwd = 10;
	
	public static final String testDataFile_path = "C:\\Users\\vgomez1\\git\\SC-Store---automation-framework\\SC Store - automation framework\\src\\testData\\";
	//C:\Users\vgomez1\git\SC-Store---automation-framework\SC Store - automation framework\src\testData
	public static final String testDataFile_name = "testData.xlsx";
	
//	test data sheet columns from the sample file 
	public static final int col_Status = 1;
	public static final int col_TestCaseName = 2;
	public static final int col_UserName = 3;
	public static final int col_Password = 4;
	public static final int col_Browser = 5;
	
//  Browsers path	
	public static final String chromedriverPath = "C:\\workspaceV\\Libraries\\chromedriver_win32\\chromedriver.exe";
	public static final String firefoxdriverPath = "C:\\workspaceV\\Libraries\\geckodriver-v0.14.0-win64\\geckodriver.exe";
	public static final String iePath = "C:\\workspaceV\\Libraries\\IEDriverServer_x64_3.0.0\\IEDriver.exe";

	//screenshot path
	public static final String screenshotPath = "**\\Screenshots\\";

}

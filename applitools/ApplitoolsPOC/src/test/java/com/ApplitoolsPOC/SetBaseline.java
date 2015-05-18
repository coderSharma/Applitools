package com.ApplitoolsPOC;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import com.testData.SpreadSheetData;

@RunWith(Parameterized.class)
public class SetBaseline {
	protected static WebDriver driver;
	protected static String workingDir = System.getProperty("user.dir").replace("\\","/");
	protected String windowname;
	String myURL;
	protected static Eyes eyes = new Eyes();


	@Parameters(name = "Data Row #: {index} ( For URL {0})")
	public static Collection<Object[]> spreadsheetData() throws IOException {

		return new SpreadSheetData(new FileInputStream(workingDir+"/src/test/resource/com/testData/Baseline_URLs.xls")).getData();
	}

	public SetBaseline(String urlList)	 {
		this.myURL =urlList ;

	}
	@BeforeClass
	public static void Setup() {
		System.setProperty("webdriver.chrome.driver","src/test/resource/com/testData/chromedriver.exe");
		driver = new ChromeDriver();
		// This is our Unique API key,to be used sure you use it in all your tests.
		// Please Contact Gaurav Sharma or Gagandeep Sharma if you need a new one setup for your project
		eyes.setApiKey("gRwnleykyvL0c65oBjKU102Z9EsqbhLXHp7gF102a2qK6RM110");
		// Setting environments
		eyes.setHostOS("Windows 8");
		// Start visual testing with browser viewport set to 1024x768 on a Chrome browser
		driver = eyes.open(driver, "Applitools", "Demo Project Run",new RectangleSize(1024, 768));
	}

	@Test
	public void holdenAUApplitools() throws InterruptedException
	{
		
		driver.get(myURL);
		Thread.sleep(1500);
		eyes.setSaveFailedTests(true);
		eyes.setForceFullPageScreenshot(true);
		eyes.checkWindow(windowname);
		System.out.println("Checking: "+windowname+"-"+myURL);
	}

	@AfterClass
	public static void tearDown()
	{
		eyes.close(false);
		eyes.abortIfNotClosed();
		// ffDriver.quit();
		driver.quit();
	}

}


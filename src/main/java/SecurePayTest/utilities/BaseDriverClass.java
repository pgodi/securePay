package SecurePayTest.utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseDriverClass 
{
	// Base class to launch browser, maximise and navigate to base url.
	public static WebDriver driver;

	@BeforeMethod
	public void startBrowser() {
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("./src/main/java/SecurePayTest/config/configuration.properties");
			prop.load(input);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./lib/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./lib/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));    	
	}

	// Method to return the driver instance.
	public  WebDriver getDriver( )	{
		return driver;
	}

	// Method to close the browser.
	public void closeBroswer() {
		getDriver().quit();
	}
}
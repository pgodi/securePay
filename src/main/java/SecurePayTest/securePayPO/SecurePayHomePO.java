package SecurePayTest.securePayPO;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import SecurePayTest.utilities.BaseDriverClass;

public class SecurePayHomePO extends BaseDriverClass{

	WebDriver driver = this.getDriver();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	public static final String TITLE = "SecurePay online payment and eCommerce solutions for businesses";

	// Declare all the web elements of SECUREPAY Home page.
	@FindBy(xpath = "//ul[@class='menu']/li/a[text()='Contact Us']")
	private WebElement contactUs;

	// Constructor to initialize web elements
	public SecurePayHomePO() {
		PageFactory.initElements(driver, this);
	}

	// Method to assert if you are on Securepay website.
	public SecurePayHomePO assertHomePage() {
		assertEquals(driver.getTitle(), TITLE, "You are not on SecurePay website");
		return this;
	}

	// Method to click on Contact Us link scrolling to bottom of the page.
	public SecurePayHomePO clickConatctUs() {
		wait.until(ExpectedConditions.visibilityOf(contactUs));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", contactUs);
		contactUs.click();
		return this;
	}
}
package SecurePayTest.securePayPO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SecurePayTest.utilities.BaseDriverClass;

public class GooglePO extends BaseDriverClass {
	
	WebDriverWait wait = new WebDriverWait(driver, 30);

	// Declare all the web elements of GOOGLE SEARCH page.
	@FindBy(css = "div.a4bIc input[name='q']")
	private WebElement googleSearchInput;
	
	@FindBy(xpath = "//cite[text()='https://www.securepay.com.au/']")
	private WebElement securePayLink;
	
	// Constructor to initialize web elements
	public GooglePO(){
		PageFactory.initElements(driver, this);
	}
	
	/***
	 * @description Method to search google for a given keyword.
	 * @param keyword
	 * @return
	 */
	public GooglePO searchForKeyword(String keyword) {
		googleSearchInput.clear();
		googleSearchInput.sendKeys(keyword + Keys.ENTER);
		wait.until(ExpectedConditions.titleIs(keyword+" - Google Search"));
		return this;	
	}
	
	/**
	 * Method to click "Secure Pay" link
	 * @return
	 */
	public GooglePO clickSecurePayLink() {
		wait.until(ExpectedConditions.visibilityOf(securePayLink)).click();
		return this;
	}
}

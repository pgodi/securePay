package SecurePayTest.securePayPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

import SecurePayTest.utilities.BaseDriverClass;

public class ContactUsPO extends BaseDriverClass{

	WebDriverWait wait = new WebDriverWait(driver, 30);

	Fairy fairy = Fairy.create();
	Person person = fairy.person();

	// Declare all the web elements of CONTACT US page.
	@FindBy(css = "input[name='first-name']")
	private WebElement firstName;

	@FindBy(css = "input[name='last-name']")
	private WebElement lastName;

	@FindBy(css = "input[name='email-address']")
	private WebElement email;

	@FindBy(css = "input[name='phone-number']")
	private WebElement phone;

	@FindBy(css = "input[name='website-url']")
	private WebElement websiteUrl;

	@FindBy(css = "input[name='business-name']")
	private WebElement company;

	@FindBy(css = "select[name='reason-for-enquiry']")
	private WebElement reason;

	// Constructor to initialize web elements
	public ContactUsPO(){
		PageFactory.initElements(driver, this);
	}

	// All the actions/methods in CONTACT US page.
	public ContactUsPO enterFirstName() {
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.clear();
		firstName.sendKeys(person.getFirstName());
		return this;
	}

	public ContactUsPO enterLastName() {
		lastName.clear();
		lastName.sendKeys(person.getLastName());
		return this;
	}

	public ContactUsPO enterEmail() {
		email.clear();
		email.sendKeys(person.getEmail());
		return this;
	}

	public ContactUsPO enterPhone() {
		phone.clear();
		phone.sendKeys(person.getTelephoneNumber());
		return this;
	}

	public ContactUsPO enterWebsite() {
		websiteUrl.clear();
		websiteUrl.sendKeys("www."+person.getFirstName()+person.getLastName()+".com");
		return this;
	}

	public ContactUsPO enterCompany() {
		company.clear();
		company.sendKeys(person.getFirstName()+ "Ltd Company");
		return this;
	}

	/***
	 * @Description Method to select the given value in "Reason for Enquiry"
	 * @param value - Value to select from dropdown.
	 */
	public ContactUsPO selectReason(String value) {
		Select reasonForEnquiry = new Select(reason);
		reasonForEnquiry.selectByValue(value);
		return this;
	}
}
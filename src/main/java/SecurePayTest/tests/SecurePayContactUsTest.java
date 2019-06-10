package SecurePayTest.tests;

import SecurePayTest.securePayPO.ContactUsPO;
import SecurePayTest.securePayPO.GooglePO;
import SecurePayTest.securePayPO.SecurePayHomePO;
import SecurePayTest.utilities.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecurePayContactUsTest extends BaseDriverClass{

	@BeforeClass
	public void setUp() {
		this.getDriver();
	}

	// Test case - Search and navigate to SecurePay website. Go to Contact Us page and enter the details.
	@Test
	public void contactUsTest() throws Exception {

		new GooglePO()
		.searchForKeyword("securepay")
		.clickSecurePayLink();

		new SecurePayHomePO()
		.assertHomePage()
		.clickConatctUs();

		new ContactUsPO()
		.enterFirstName()
		.enterLastName()
		.enterEmail()
		.enterPhone()
		.enterWebsite()
		.enterCompany()
		.selectReason("Support");
		
		// Added 5 seconds of sleep to see the data entered.
		Thread.sleep(5000);
	}

	@AfterClass
	public void tearDown() {
		this.closeBroswer();
	}
}

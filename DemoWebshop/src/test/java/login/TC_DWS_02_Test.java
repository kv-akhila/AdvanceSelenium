package login;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepository.LoginPage;

public class TC_DWS_02_Test extends BaseClass {
	
	@Test
	public void Validate_whether_user_login_with_valid_credentials() throws IOException
	{
		LoginPage Login = new LoginPage(driver);
		String ExpectedTitle = "Demo Web Shop";
		UtilityClass utility = new UtilityClass();
		Login.getLoginLink().click();
		Reporter.log("Clicked on Login button", true);

		Login.getEmailTextField().sendKeys(utility.propertyFileReader("username"));
		assertEquals(utility.propertyFileReader("username"), Login.getEmailTextField().getAttribute("value"),
				"Email Adderss is not proper");
		Reporter.log("Succesfully entered email adderss", true);

		Login.getPasswordTextField().sendKeys(utility.propertyFileReader("password"));
		assertEquals(utility.propertyFileReader("password"), Login.getPasswordTextField().getAttribute("value"),
				"password is not proper");
		Reporter.log("Succesfully entered password", true);

		Login.getLoginButton().click();
		Reporter.log("Succesfully Logged in to the application", true);
		assertEquals(ExpectedTitle, driver.getTitle(), "Test case passed");
	}

	
}

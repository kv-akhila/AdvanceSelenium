package login;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.LoginPage;

public class TestCaseID_Test extends BaseClass {

	@Test
	public void testCaseDescription() {
		LoginPage loginElements = new LoginPage(driver);
		loginElements.getLoginLink().click();
		loginElements.getEmailTextField().sendKeys("pls@gmail.com");
		loginElements.getPasswordTextField().sendKeys("plspls");
		loginElements.getLoginButton().click();

	}
}

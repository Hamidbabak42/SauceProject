package testScriptsScenario2;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucePages.LoginPage;
import saucePagesScenario2.VerifyErrMesg;

public class RunTestCase extends BaseTest {
	
	
	@Test
	public void RunT(){
		
		LoginPage Login= new LoginPage(driver);
		Login.enterUserName("locked_out_user");
		Login.enterPassword("secret_sauce");
		Login.clickLoginBtn();
		VerifyErrMesg ErrorMS= new VerifyErrMesg(driver);
		String expectedMessage="Epic sadface: Sorry, this user has been locked out.";
		String ActualMessage=ErrorMS.errorMessage();
		Assert.assertEquals(ActualMessage, expectedMessage);
		
		
	}

}

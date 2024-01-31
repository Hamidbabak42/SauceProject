package sauce.scenarios.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import sauce.scenarios.pages.LoginPageScen2;

public class VrifyErorrMessageScen2 extends BaseTest {
	
	@Test
	public void VriFyErorrMsg() {
		
		
		LoginPageScen2 login2= new LoginPageScen2(driver);
		login2.enterUserName("locked_out_user");
		login2.enterPassword("secret_sauce");
		login2.clickLoginBtn();
		String expectedErrMsg2="Epic sadface: Sorry, this user has been locked out.";
		String actualErrMsg2=login2.geterorrMsg();
		Assert.assertEquals(expectedErrMsg2, actualErrMsg2);

		
	}

}

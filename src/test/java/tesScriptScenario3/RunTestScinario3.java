package tesScriptScenario3;

import org.testng.Assert;
import org.testng.annotations.Test;



import SaucePagecenario3.AddProducts;
import SaucePagecenario3.CartIcon;
import SaucePagecenario3.CheckoutPage3;
import SaucePagecenario3.ErorMsg;

import saucePages.LoginPage;
import saucePages.PersonalInfo;

public class RunTestScinario3 extends BaseTest {
	
	
	@Test
	public void runTst() {
		LoginPage login3= new LoginPage(driver);
		login3.enterUserName("problem_user");
		login3.enterPassword("secret_sauce");
		login3.clickLoginBtn();
		AddProducts add= new AddProducts(driver);
		add.addtemToCard();
		CartIcon getInCart= new CartIcon(driver);
		getInCart.clickCartIcon();
		CheckoutPage3 clickCh= new CheckoutPage3(driver);
		clickCh.clickCheck();
		PersonalInfo addInfo= new PersonalInfo(driver);
		addInfo.enterFirstName("hamid");
		addInfo.enterLastName("babak");
		addInfo.eneterZipCoode("78420");
		addInfo.clickContonue();
		ErorMsg msg= new ErorMsg(driver);
		String expectedErrorMsg="Error: Last Name is required";
		String actualeErrorMsg=msg.getErrMsg();
		Assert.assertEquals(actualeErrorMsg,expectedErrorMsg);


		
		
		

	}
	

}

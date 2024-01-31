package sauce.scenarios.testscripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import sauce.scenarios.pages.LoginPageScen4;
import sauce.scenarios.pages.Products4;
import sauce.scenarios.pages.vrifiItem;

public class RunTest4 extends BaseTest {
	
	@Test
	public void vrifyItem( ) {
		
		LoginPageScen4 login4= new LoginPageScen4(driver);
		
		login4.enterUserName("standard_user");
		login4.enterPassword("secret_sauce");
		login4.Btn();
		
		Products4 product4= new Products4(driver);
		product4.clickOnSortBtn();
		product4.clickAddtocard();
		product4.clicicon4();
		
		vrifiItem item4= new vrifiItem(driver);
		String expectedTitle="Sauce Labs Onesie";
		String actualTitle=item4.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

}

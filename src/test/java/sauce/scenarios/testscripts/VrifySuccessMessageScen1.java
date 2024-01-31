package sauce.scenarios.testscripts;



import org.testng.Assert;
import org.testng.annotations.Test;

import sauce.scenarios.pages.CompleteSn1;
import sauce.scenarios.pages.CostomarInformationSn1;
import sauce.scenarios.pages.LoginPageScen1;
import sauce.scenarios.pages.OverviewSn1;
import sauce.scenarios.pages.ProductsSn1;
import sauce.scenarios.pages.YourCardSn1;

public class VrifySuccessMessageScen1 extends BaseTest {

	LoginPageScen1 login1;
	@Test
	public void vrify() {
		
	

	
	login1=new LoginPageScen1(driver);
	login1.enterUserName("standard_user");
	login1.enterPassword("secret_sauce");
	login1.clickLoginBtn();
	
	ProductsSn1 product1= new ProductsSn1(driver);
	
	product1.addTocartFirstItm();
	product1.AddtoCardScndItm();
	product1.clickShoppingCard();
	
	YourCardSn1 card1= new YourCardSn1(driver);
	card1.clickcheckoutBtn();
	
	CostomarInformationSn1 costomer= new CostomarInformationSn1(driver);
	costomer.enterName("hamid");
	costomer.enterLastName("babak");
	costomer.enterPostalCod("78240");
	costomer.clickcontinueBtn();
	
	OverviewSn1 Overview1= new OverviewSn1(driver);
	Overview1.clickFinishBtn();
	
	CompleteSn1 Msg= new CompleteSn1(driver);
	String expectedMessage="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
	String actualMessage=Msg.getSuccessMsg();
	Assert.assertEquals(actualMessage, expectedMessage);
	

	
	
	
	}
	
	
}

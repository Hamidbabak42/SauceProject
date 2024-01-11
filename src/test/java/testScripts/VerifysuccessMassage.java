package testScripts;

import org.junit.Assert;
import org.testng.annotations.Test;

import saucePages.BuyBackPack;
import saucePages.BuyProducts;
import saucePages.BuyTshirt;
import saucePages.Chickout;
import saucePages.Finish;
import saucePages.LoginPage;
import saucePages.PersonalInfo;

public class VerifysuccessMassage extends BaseTest{
	LoginPage login;
	@Test
	
	public void verMsg() {
		 BuyProducts buy;
		 login = new LoginPage(driver);
		login.enterUserName("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginBtn();
		
		 buy= new BuyProducts(driver);
		buy.clickItem();
		
		BuyBackPack clickBackPack= new BuyBackPack (driver);
		clickBackPack.addToCart();
		clickBackPack.backTomainpage();
		buy.clickTsh();
		BuyTshirt clickTsh= new BuyTshirt(driver);
		clickTsh.addTocardTsh();
		clickTsh.backTomainpage2();
		
		buy.shoping();
		
		Chickout clickChikout= new Chickout(driver);
		clickChikout.clickCheckoutBtn();
		PersonalInfo information= new PersonalInfo(driver);
		information.enterFirstName("Hamid");
		information.enterLastName("babak");
		information.eneterZipCoode("78240");
		information.clickContonue();
		Finish finishproduct= new Finish(driver);
		finishproduct.clickFinishBtn();
		String expectedMessage="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualMessage=finishproduct.getMassage();
		Assert.assertEquals(actualMessage, expectedMessage);
		
		
		
		
	}
	
	
	

}

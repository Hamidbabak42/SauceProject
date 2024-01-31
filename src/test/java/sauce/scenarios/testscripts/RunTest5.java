package sauce.scenarios.testscripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import sauce.scenarios.pages.CostomarInformation5;
import sauce.scenarios.pages.LoginPageScen5;
import sauce.scenarios.pages.Overview5;
import sauce.scenarios.pages.Products5;
import sauce.scenarios.pages.YourCart5;
import sauce.scenarios.pages.verifySuccessMsg5;

public class RunTest5 extends BaseTest {
	
	@Test (priority=1)
	public void verifyText() {
		
		LoginPageScen5 login5=new LoginPageScen5(driver);
		login5.enterUserName("standard_user");
		login5.enerPassword("secret_sauce");
		login5.clickLoginBtn();
		
		Products5 product= new Products5(driver);
		product.addToCartFirstItem();
		product.addToCartThird();
		product.removeFirstItm();
		product.ClickCartIcon();
		
		YourCart5 yourCart= new YourCart5(driver);
		
		String expectedText="Your Cart";
		String actualText=yourCart.getTitile();
		Assert.assertEquals(actualText, expectedText);
	}
	@Test(priority=2)
	public void verifyItem() {
	    YourCart5 yourCart = new YourCart5(driver);
	    yourCart.clicContinueshopingBtn();
	    
	    Products5 product = new Products5(driver);
	    product.ClicksortBtn();
	    product.clickJacket();
	    product.ClickCartIcon();
	    
	    int expectedItems = 2;
	    int actualItems = yourCart.getCartItems();
	    System.out.println(actualItems);
	    Assert.assertEquals(actualItems, expectedItems, "Number of items in the cart should be 2");
	}
	@Test (priority=3)
	public void verifySuccessMsg() {
		 YourCart5 yourCart = new YourCart5(driver);
		 yourCart.clickChecOutBtn();
		 CostomarInformation5 information= new CostomarInformation5 (driver);
		 information.enterName("nasir");
		 information.enterLastName("kabul");
		 information.enterPostalCod("7840");
		 information.clickcontinueBtn();
		 Overview5 overview = new Overview5(driver);
		 overview.clickFinishBtn();
		 
		 verifySuccessMsg5 Vrify= new verifySuccessMsg5(driver);
		 String expectedMsg="Thank you for your order!";
		 String actualMsg=Vrify.getSuccessMsg();
		 Assert.assertEquals(actualMsg,expectedMsg);
		 
	}
	}
	

	
	




package sauce.scenarios.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import sauce.scenarios.pages.CostomarInformationSn3;
import sauce.scenarios.pages.LoginPageScen3;
import sauce.scenarios.pages.ProductsScen3;
import sauce.scenarios.pages.VrifyErorrMsg3;
import sauce.scenarios.pages.YourCart3;

public class RunTest extends BaseTest {

	@Test
	public void virfiErorrMsg3() {
		
		LoginPageScen3 Login3=new LoginPageScen3(driver);
		
		Login3.enterUserName("problem_user");
		Login3.enterPassword("secret_sauce");
		Login3.Btn();
		
		ProductsScen3 addTocard3= new ProductsScen3(driver);
		addTocard3.clickFirstItem();
		addTocard3.clickCartt3();
		
		YourCart3 cart=new YourCart3(driver);
		cart.clickFinishBtn();
		
		CostomarInformationSn3 costomar3= new CostomarInformationSn3(driver);
		costomar3.enterName("Ahamd");
		costomar3.enterLastName("lala");
		costomar3.enterPostalCod("78240");
		costomar3.clickContinu();
		
		VrifyErorrMsg3 msg3= new VrifyErorrMsg3(driver);
		String expectedMessage="Error: Last Name is required";
		String actualMessage=msg3.getErorrMsg3();
		Assert.assertEquals(expectedMessage, actualMessage);
		
		
		
		
		
	}
	
	
	
}

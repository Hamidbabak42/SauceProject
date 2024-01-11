package saucePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chickout {
	
	@FindBy(id="checkout")
	private WebElement checkoutProduct;
	
	
 
	public Chickout (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
		
		
	}
	public void clickCheckoutBtn() {
		
		checkoutProduct.click();
	}

}

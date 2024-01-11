package SaucePagecenario3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartIcon {

	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	private WebElement Cart;
	
	
	public CartIcon(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickCartIcon() {
		Cart.click();
	}
	
	
}

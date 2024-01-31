package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsSn1 {
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCard1;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement addToCardScuondItm;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	private WebElement shoppingCart;
	
	public ProductsSn1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addTocartFirstItm() {
		addToCard1.click();
	}
	public void AddtoCardScndItm() {
		addToCardScuondItm.click();
	}
	public void clickShoppingCard() {
		shoppingCart.click();
	}

}

package saucePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProducts {
	
	
	@FindBy(xpath="(//div[@class='inventory_item_name '])[1]")
	private WebElement selectItem;
	
	@FindBy(xpath="(//div[@class='inventory_item_name '])[3]")
	private WebElement buyTeshert;
	
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement shoppingCart;
	
	
	public BuyProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void clickItem() {
		selectItem.click();
	
	}

	public void clickTsh() {
		buyTeshert.click();
	}
	
	
	public void shoping() {
		shoppingCart.click();
	}

}

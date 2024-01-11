package saucePages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyBackPack {

	
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement buyBagPack;
	
	@FindBy(xpath="//button[@class='btn btn_secondary back btn_large inventory_details_back_button']")
	private WebElement clickBack;
	
	public BuyBackPack(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void addToCart() {
		buyBagPack.click();
	}
public void backTomainpage() {
	clickBack.click();
}
}

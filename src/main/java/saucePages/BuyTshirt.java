package saucePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyTshirt {
	
	
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addTocard2;
	
	@FindBy(xpath="//button[@class='btn btn_secondary back btn_large inventory_details_back_button']")
	private WebElement clickBack2;
	
	public BuyTshirt(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addTocardTsh() {
		addTocard2.click();
	}
	
	public void backTomainpage2() {
		clickBack2.click();

}}

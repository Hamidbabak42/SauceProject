package SaucePagecenario3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProducts {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement selectItem;
	
	
	public AddProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addtemToCard() {
		selectItem.click();
	}
	

}

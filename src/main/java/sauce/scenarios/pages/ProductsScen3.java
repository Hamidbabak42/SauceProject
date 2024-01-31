package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsScen3 {

	
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	private WebElement addtoCart3;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	private WebElement Cart3;
	
	public ProductsScen3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickFirstItem() {
		addtoCart3.click();
	}
	public void clickCartt3() {
		
		Cart3.click();
		
	}
}


package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Products4 {
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/div/span/select")
	private WebElement SortBtn;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	private WebElement addTocartFirstItem;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	private WebElement cartIcon;
	public Products4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSortBtn() {
		Select selectLowToHighPrice= new Select(SortBtn);
		selectLowToHighPrice.selectByIndex(2);
	}
	public void clickAddtocard() {
		addTocartFirstItem.click();
		
	}
	public void clicicon4() {
		cartIcon.click();
	}
}

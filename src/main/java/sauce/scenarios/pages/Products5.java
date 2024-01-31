package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Products5 {
	

	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	private WebElement backPack;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	private WebElement teshert;
	
	@FindBy(xpath="//*[@id=\"remove-sauce-labs-backpack\"]")
	private WebElement removeFirstItem;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	private WebElement CartIcon;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/div/span/select")
	private WebElement SortBtn;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	private WebElement jacket;
	
	
	public Products5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	public void addToCartFirstItem() {
		backPack.click();
		
	}
	
	public void addToCartThird() {
		teshert.click();
	}
	public void removeFirstItm() {
		removeFirstItem.click();
	}
	public void ClickCartIcon() {
		CartIcon.click();
	}
	public void ClicksortBtn() {
		Select selectHighToLowPrices= new Select(SortBtn);
		selectHighToLowPrices.selectByIndex(3);
		}
	public void clickJacket() {
		jacket.click();
	}
		
	}

	
	
	
	
	
	
	
	
	
	

package SaucePagecenario3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage3 {
	
	@FindBy(id="checkout")
	private WebElement Checkout1;
	
	public CheckoutPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickCheck() {
		Checkout1.click();
	}

}

package sauce.scenarios.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCart5 {
	
	
	
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
	private WebElement title;
	
	@FindBy(id="continue-shopping")
	private WebElement continuShoping;
	
	@FindBy(xpath="//div[@class='cart_item']")
	private List <WebElement> cartItems;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	private WebElement checkoutBtn;
	

	public YourCart5(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String getTitile() {
		String title5=title.getText();
		return title5;
		
	}
	public void clicContinueshopingBtn() {
		continuShoping.click();
		
}
	public int getCartItems() {
		return cartItems.size();
		}
	public void clickChecOutBtn() {
		checkoutBtn.click();
	}
	}



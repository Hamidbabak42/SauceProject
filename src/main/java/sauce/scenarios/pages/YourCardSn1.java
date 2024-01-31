package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCardSn1 {
	
	@FindBy(id="checkout")
	private WebElement checoutBtn;
	
	public YourCardSn1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickcheckoutBtn() {
		checoutBtn.click();
	}

}



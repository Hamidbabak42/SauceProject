package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewSn1 {
	
	
	@FindBy(id="finish")
	private WebElement finishBtn;
	
	
	public OverviewSn1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickFinishBtn() {
		finishBtn.click();
	}

}

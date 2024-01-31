package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCart3 {
	
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	private WebElement finishBtn;

	public YourCart3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickFinishBtn() {
		finishBtn.click();
	}
}

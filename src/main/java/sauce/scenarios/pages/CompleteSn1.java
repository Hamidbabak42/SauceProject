package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteSn1 {
	
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/div")
	private WebElement vrifyMsg;
	
	public CompleteSn1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getSuccessMsg() {
		String message=vrifyMsg.getText();
		return message;
	}

}

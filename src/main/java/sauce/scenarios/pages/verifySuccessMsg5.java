package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifySuccessMsg5 {
	
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	private WebElement verifyMsg;
	
	public verifySuccessMsg5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public String getSuccessMsg() {
	String message=verifyMsg.getText();
	return message;
}
}

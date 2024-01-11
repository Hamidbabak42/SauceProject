package SaucePagecenario3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErorMsg {
	
	@FindBy(xpath="//div[@class='error-message-container error']")
	private WebElement messageErr;
	
	public ErorMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getErrMsg() {
		String message= messageErr.getText();
		return message;
	}

}

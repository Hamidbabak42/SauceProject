package SaucePagecenario3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="user-name")
	private WebElement userNameTextBox;
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public void enterUserName(String UserName) {
		userNameTextBox.sendKeys(UserName);
		
	}
	public void enterPassword(String Password) {
		passwordTextBox.sendKeys(Password);
	}

}

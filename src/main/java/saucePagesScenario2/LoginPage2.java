package saucePagesScenario2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	@FindBy(id="username")
	private WebElement UserNameTxtBox;
	
	@FindBy(id="password")
	private WebElement PasswordBox;
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	public LoginPage2(WebElement driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public void enterUsername(String UserName) {
		UserNameTxtBox.sendKeys(UserName);
	}
	public void enterPasswordBox(String Password) {
		PasswordBox.sendKeys(Password);
	}
	public void ClickButton() {
		loginBtn.click();
	}
	

}

package saucePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="user-name")
	private WebElement userNameTextBox; 
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		
		
	}
	public void enterUserName(String UserName) {
		userNameTextBox.sendKeys(UserName);
	}
	public void enterPassword(String Passowrd) {
		passwordTextBox.sendKeys(Passowrd);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}

}

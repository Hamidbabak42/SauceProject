package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageScen5 {
	
	
	@FindBy(id="user-name")
	private WebElement userNameTextBox;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement passwodTextBox;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	private WebElement loginBtn;
	
	 
	public LoginPageScen5(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}
	public void enterUserName(String userName) {
		
		userNameTextBox.sendKeys(userName);
	}
	public void enerPassword(String password) {
		passwodTextBox.sendKeys(password);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	

}

package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageScen4 {

	

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userNameTextBox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwodTextBox;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement clikcLoginBtn;
	
	
	public LoginPageScen4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public void enterUserName(String userName) {
		
		userNameTextBox.sendKeys(userName);
		
	}
	public void enterPassword(String password) {
		passwodTextBox.sendKeys(password);
	}
	public void Btn() {
		clikcLoginBtn.click();
	}
	
	
}

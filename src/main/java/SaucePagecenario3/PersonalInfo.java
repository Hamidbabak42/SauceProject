package SaucePagecenario3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {
	
	@FindBy(id="first-name")
	private WebElement information;
	
	@FindBy(id="first-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement zipcodee;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	
	public PersonalInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addInfo(String FirstName) {
		information.sendKeys(FirstName);
	}
	public void addlastName(String LastName) {
		lastname.sendKeys(LastName);
	}
	public void addZipeCod(String ZipCode) {
		zipcodee.sendKeys(ZipCode);
	}
	public void clickContBtn() {
		continueBtn.click();
	}

}

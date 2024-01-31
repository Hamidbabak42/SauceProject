package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostomarInformationSn1 {
	
	@FindBy(id="first-name")
	private WebElement firstNameTextBox;
	
	@FindBy(id="last-name")
	private WebElement lastnameTextBox;
	
	@FindBy(id="postal-code")
	private WebElement PostalCodTextBox;
	
	@FindBy(id="continue")
	private WebElement clickConinue;
	
	
	public CostomarInformationSn1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterName(String name) {
		firstNameTextBox.sendKeys(name);
	}
	public void enterLastName(String LastName) {
		lastnameTextBox.sendKeys(LastName);
	}
	public void enterPostalCod(String PostalCode) {
		PostalCodTextBox.sendKeys(PostalCode);
	}
	public void clickcontinueBtn() {
		clickConinue.click();
	}

}

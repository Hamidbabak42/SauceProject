package saucePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {
	
	@FindBy(id="first-name")
	private WebElement fSna;
	
	@FindBy(id="last-name")
	private WebElement laNa;
	
	@FindBy(id="postal-code")
	private WebElement zpcoode;
	
	@FindBy(id="continue")
	private WebElement continuee;
	@FindBy(id="finish")
	private WebElement Finish;
	
	public PersonalInfo(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	
		
	}
	public void enterFirstName(String firstName) {
		
		fSna.sendKeys(firstName);
	
	}
	public void enterLastName(String lastName) {
		laNa.sendKeys(lastName);
	}
	public void eneterZipCoode(String ZipCoode) {
		
		zpcoode.sendKeys(ZipCoode);
	}
	public void clickContonue() {
		continuee.click();
	}
	public void clickFinishBtn() {
		Finish.click();
	}
	

}

package saucePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finish {
	
	
	@FindBy(id="finish")
	private WebElement finishBtn;
	
	@FindBy(xpath="//div[@class='complete-text']")
	private WebElement message;
	
	public Finish(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickFinishBtn() {
		
		finishBtn.click();
		
	}
	public String getMassage() {
		String messsage= message.getText();
		return messsage;
		
	}

}

package saucePagesScenario2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyErrMesg {
	
	
	@FindBy(xpath="//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
	private WebElement erorrMsg;
	
	public VerifyErrMesg(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}
	public String errorMessage() {
		String message=erorrMsg.getText();
		return message;
		
		
	}

}

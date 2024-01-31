package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VrifyErorrMsg3 {
	
	@FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")
	private WebElement erorrMsg3;
	
	public VrifyErorrMsg3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getErorrMsg3() {
		String message=erorrMsg3.getText();
		return message;
	}

}

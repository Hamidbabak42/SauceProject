package sauce.scenarios.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vrifiItem {

	
	@FindBy(xpath="//*[@id=\"item_2_title_link\"]/div")
	private WebElement Item;
	public vrifiItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		String title=Item.getText();
		return title;
		
	}
	
	
}

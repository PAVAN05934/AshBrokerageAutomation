package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTypePage {
	
	public WebDriver driver;

	public ProductTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='radio checked:radio-primary radio-sm']")
	private WebElement term_btn;
	
	public void termBtn() {
		term_btn.click();
	}
	

}

package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Health_Condition_page {
	
public WebDriver driver;
	
	public Health_Condition_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtn;
	
	public void clickOnNextBtn() {
		nextBtn.click();
	}

}

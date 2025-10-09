package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KnockOutPage {
	
	public WebDriver driver;

	public KnockOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@name='carrierKnockout']")
	private WebElement carrierKnockout;
	
	@FindBy(xpath="//button[@id='quoter_action_button_eapp']")
    private WebElement continueBtn;
	
	public void carrierKnockout() {
		carrierKnockout.click();
	}
	
	public void continueBtn() {
		continueBtn.click();
	}

}

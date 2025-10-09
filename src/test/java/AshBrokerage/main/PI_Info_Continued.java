package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PI_Info_Continued {
	
	public WebDriver driver;

	public PI_Info_Continued(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[2]")
	private WebElement DisabledYesRadioBtn;
	
	@FindBy(xpath = "//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
	private WebElement DisabilityDetails;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[4]")
	private WebElement PrincipalYesRadioBtn;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[6]")
	private WebElement LifeInsuranceYesRadioBtn;
	
	@FindBy(xpath = "(//span[@class='mud-typography mud-typography-button'])[2]")
	private WebElement NextBtn;
	
	public void disabledYesRadioBtn() {
		DisabledYesRadioBtn.click();
	}
	
	public void disabilityDetails(String details) {
		DisabilityDetails.sendKeys(details);
	}
	
	public void principalYesRadioBtn() {
		PrincipalYesRadioBtn.click();
	}
	
	public void lifeInsuranceYesRadioBtn() {
		LifeInsuranceYesRadioBtn.click();
	}
	
	public void nextBtn() {
		NextBtn.click();
	}
	
	
	
	

}

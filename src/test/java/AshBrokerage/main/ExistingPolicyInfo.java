package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingPolicyInfo {
	private WebDriver driver;
	public ExistingPolicyInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='mud-radio-input']")
	private WebElement pendingInsuranceRadioBtn;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[3]")
	private WebElement declinedInsuranceRadioBtn;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[5]")
	private WebElement InforceInsuranceRadioBtn;
	
	
	public void pendingInsuranceRadioBtn() {
		pendingInsuranceRadioBtn.click();
	}
	
	public void declinedInsuranceRadioBtn() {
		declinedInsuranceRadioBtn.click();
	}
	
	public void InforceInsuranceRadioBtn() {
		InforceInsuranceRadioBtn.click();
	}
	
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtn;
	
	public void clickOnNextBtn() {
		nextBtn.click();
	}
	

}

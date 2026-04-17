package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProposedInsuredInfo_Second {
	
	public WebDriver driver;

	public ProposedInsuredInfo_Second(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	//Principal Journey Elements
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[2]")
	private WebElement DisabledYesRadioBtn;
	
	@FindBy(xpath = "//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
	private WebElement DisabilityDetails;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[4]")
	private WebElement PrincipalNoRadioBtn;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[6]")
	private WebElement LifeInsuranceNoRadioBtn;
	
	
	//Ameritas journey Elements
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[3]")
	private WebElement USArmedForcesYesRadioBtn;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[5]")
	private WebElement PendingAnotherCompanyYesRadioBtn;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[7]")
	private WebElement Health_insurance_declinedYesRadioBtn;
	
	
	@FindBy(xpath = "(//span[@class='mud-typography mud-typography-button'])[2]")
	private WebElement NextBtn;
	
	public void disabledYesRadioBtn() {
		DisabledYesRadioBtn.click();
	}
	
	
	public void disabilityDetails(String details) {
		DisabilityDetails.sendKeys(details);
	}
	
	public void principalYesRadioBtn() {
		PrincipalNoRadioBtn.click();
	}
	
	public void lifeInsuranceYesRadioBtn() {
		LifeInsuranceNoRadioBtn.click();
	}
	
	
	//Ameritas Journey Methods
	public void usArmedForcesYesRadioBtn() {
		USArmedForcesYesRadioBtn.click();
	}
	
	public void pendingAnotherCompanyYesRadioBtn() {
		PendingAnotherCompanyYesRadioBtn.click();
	}
	
	public void health_insudeclinedYesRadioBtn() {
		Health_insurance_declinedYesRadioBtn.click();
	}
	
	
	public void nextBtn() {
		NextBtn.click();
	}
	
	//Pacific Life Promise Term Journey
	@FindBy(xpath = "//input[@class='mud-radio-input']")
	private WebElement comboforLifeDesability;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[3]")
	private WebElement examRequiredYesRadioBtn;
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[5]")
	private WebElement lifeInsuranceYesRadioBtn;
	
	public void yes_ComboForLifeDesability() {
		comboforLifeDesability.click();
	}
	
	public void yes_examRequiredYesRadioBtn() {
		examRequiredYesRadioBtn.click();
	}
	
	public void yes_lifeInsuranceYesRadioBtn() {
		lifeInsuranceYesRadioBtn.click();
	}
	
	
	

}

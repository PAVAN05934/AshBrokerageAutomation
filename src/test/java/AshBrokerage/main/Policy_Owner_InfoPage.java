package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policy_Owner_InfoPage {
	
	private WebDriver driver;

	public Policy_Owner_InfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement PolicyOwnerDropdown;
	
	@FindBy(xpath = "//p[text()='Individual']")
	private WebElement IndividualOption;
	
	@FindBy(xpath = "(//input[id='mudinputnmkux6ua'])[2]")
	private WebElement RelationDropdown;
	
	@FindBy(xpath = "//p[text()='Child']")
	private WebElement ChildOption;
	
	@FindBy(xpath = "//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
	private WebElement OwnerFirstName;
	
	@FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
	private WebElement OwnerLastName;
	
	@FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
	private WebElement OwnerDOB;
	
    @FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
    private WebElement OwnerEmail;
    
    @FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
    private WebElement OwnerPhoneNumber;
    
    @FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
    private WebElement OwnerSSN;
    
    @FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
    private WebElement OwnerAddress;
    
    @FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
    private WebElement OwnerAddress2;
    
    @FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
    private WebElement OwnerCity;
    
    @FindBy(xpath = "//div[@class='mud-overlay']")
    private WebElement StateDropdown;
    
    @FindBy(xpath = "//p[text()='Alaska']")
    private WebElement AlaskaOption;
    
    @FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[10]")
    private WebElement OwnerZipcode;
    
    @FindBy(xpath = "//input[@class='mud-radio-input']")
    private WebElement OwnerPrimarylanguageEnglishRadioBtn;
    
    @FindBy(xpath = "(//input[@class='mud-radio-input'])[4]")
    private WebElement OwnerAnnualIncomeRadioBtn;
    
    @FindBy(xpath = "(//span[@class='mud-typography mud-typography-button'])[2]")
    private WebElement NextBtn;
    
        public void policyOwnerDropdown() {
        	        PolicyOwnerDropdown.click();
        }
        
        
		public void individualOption() {
			IndividualOption.click();
		}
		
		public void relationDropdown() {
			RelationDropdown.click();
			ChildOption.click();
		}
		
		public void ownerFirstName(String firstName) {
			OwnerFirstName.sendKeys(firstName);
		}
		
		public void ownerLastName(String lastName) {
			OwnerLastName.sendKeys(lastName);
		}
		
		public void ownerDOB(String dob) {
			OwnerDOB.sendKeys(dob);
		}
		
		public void ownerEmail(String email) {
			OwnerEmail.sendKeys(email);
		}
		
		public void ownerPhoneNumber(String phoneNumber) {
			OwnerPhoneNumber.sendKeys(phoneNumber);
		}
		
		public void ownerSSN(String ssn) {
			OwnerSSN.sendKeys(ssn);
		}
		
		public void ownerAddress(String address) {
			OwnerAddress.sendKeys(address);
		}
		
		public void ownerAddress2(String address2) {
			OwnerAddress2.sendKeys(address2);
		}
		
		public void ownerCity(String city) {
			OwnerCity.sendKeys(city);
		}
		
		public void stateDropdown() {
			StateDropdown.click();
			AlaskaOption.click();
		}
		
		public void ownerZipcode(String zipcode) {
			OwnerZipcode.sendKeys(zipcode);
		}
		
		public void ownerPrimarylanguageEnglishRadioBtn() {
			OwnerPrimarylanguageEnglishRadioBtn.click();
		}
		
		public void ownerAnnualIncomeRadioBtn() {
			OwnerAnnualIncomeRadioBtn.click();
		}
		
		public void nextBtn() {
			NextBtn.click();
		}
		
    
	
	

}

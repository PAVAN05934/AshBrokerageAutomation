package AshBrokerage.main;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInformationPage {
	
	public WebDriver driver;

	public UserInformationPage(WebDriver driver) {
	       this.driver = driver;
	       PageFactory.initElements(driver, this);
	}
	

String randomText = RandomStringUtils.randomAlphabetic(10);    //random text generator
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement editButton;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement LastName;	
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@placeholder='Address']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@placeholder='City']")
	private WebElement City;
	
	@FindBy(xpath="//input[@placeholder='NPN']")
	private WebElement NPN;
	
	@FindBy(xpath="//input[@placeholder='Zip']")
	private WebElement Zip;
	
	@FindBy(xpath="(//input[@class='peer'])[2]")
	private WebElement InsuranceLicenseInfoSection;
	
	@FindBy(xpath="(//*[name()='path'])[7]")
	private WebElement alaskaStateDelete;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="(//*[name()='svg'][@role='img'])[49]")
	private WebElement addIcon;
	
	@FindBy(xpath="//input[@placeholder='State']")
	private WebElement stateBox;
	
	@FindBy(xpath="//div[text()='Alaska']")
	private WebElement alaskaStateSelect;
	
	@FindBy(xpath="(//input[@placeholder='License Number'])[48]")
	private WebElement licenseNumberBox;
	
	@FindBy(xpath="(//input[@class='peer'])[3]")
	private WebElement carrierContractsSection;
	
	
	@FindBy(xpath="(//*[name()='path'])[103]")
	private WebElement americanNationalCarrerDelete;
	
	@FindBy(xpath="(//*[name()='svg'][@role='img'])[69]")
	private WebElement carrierAddBtn;
	
	@FindBy(xpath="(//input[@placeholder='Carrier'])[1]")
	private WebElement carrierDrpDown;
	
	@FindBy(xpath="//div[text()='American National']")
	private WebElement americanNationalSelect;
	
	@FindBy(xpath="(//input[@placeholder='Agent Writing Code'])[20]")
	private WebElement agentWritingCodeBox;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement SaveButton;
	
	public void edit_btn() {
		editButton.click();
	}
	
	public void firstName_txt() {
		FirstName.clear();
		FirstName.sendKeys(randomText);
	}
	
	public void lastName_txt() {
		LastName.clear();
		LastName.sendKeys(randomText);
	}
	
	public void phoneNumber_txt() {
		PhoneNumber.clear();
		PhoneNumber.sendKeys("9876543210");
	}
	
	public void address_txt() {
		Address.clear();
		Address.sendKeys("123 Main St");
	}
	
	public void city_txt() {
		City.clear();
		City.sendKeys("New York");
	}
	public void npn_txt() {
        NPN.clear();
        NPN.sendKeys("4444567");
}
	
public void zip_txt() {
        Zip.clear();
        Zip.sendKeys("12345");

}

public void insuranceLicenseInfoSection() {
    InsuranceLicenseInfoSection.click();
    alaskaStateDelete.click();
    
}

public void addIcon() {
    addIcon.click();	 
}

public void newStateAdd() {
	stateBox.click();
	alaskaStateSelect.click();
	licenseNumberBox.sendKeys("QA2213");
}

public void contactSection() {
	    carrierContractsSection.click();
	    americanNationalCarrerDelete.click();
}

public void carrierAdd_Btn() {
	carrierAddBtn.click();
    
}

public void carrierDrpDown() {
    carrierDrpDown.click();
    americanNationalSelect.click();
    agentWritingCodeBox.sendKeys("123445");
}

public void SaveButton() {
    SaveButton.click();
}
}

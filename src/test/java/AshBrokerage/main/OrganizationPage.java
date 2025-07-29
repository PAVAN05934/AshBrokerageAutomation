package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	WebDriver driver; 
	public OrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='organizationName']")
	public WebElement OrganizationName;     //textbox
	
	@FindBy(xpath="//button[@name='action']")
	public WebElement Continue_btn;
	
	public void enteroriganzationName() {
		OrganizationName.sendKeys("acme");
	//	OrganizationName.sendKeys("productlogo");
		}
	public void clickonContinuebtn() {
		Continue_btn.click();
	}
	
}

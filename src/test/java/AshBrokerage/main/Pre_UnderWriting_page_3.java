package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pre_UnderWriting_page_3 {
	
	public WebDriver driver;

	public Pre_UnderWriting_page_3(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//input[@name='drivingConvictionDui'])[2]")
	private WebElement drivingConvictionDui;
	
	@FindBy(xpath = "(//input[@name='drivingConvictionViolations'])[2]")
	private WebElement drivingConvictionViolations;
	
	@FindBy(xpath = "(//input[@name='drivingConvictionSuspension'])[2]")
	private WebElement drivingConvictionSuspension;
	
	@FindBy(xpath = "(//input[@name='criminalhistory'])[2]")
	private WebElement criminalhistory;
	
	@FindBy(xpath = "(//input[@name='businessRelated'])[2]")
	private WebElement businessRelated;
	
	@FindBy(xpath = "//button[@id='quoter_action_button_quote']")
	private WebElement getQuoteBtn;
	
	public void drivingConvictionDui() {
		drivingConvictionDui.click();
	}
	
	public void drivingConvictionViolations() {
		drivingConvictionViolations.click();
	}
	
	public void drivingConvictionSuspension() {
		drivingConvictionSuspension.click();
	}
	
	public void criminalhistory() {
		criminalhistory.click();
	}
	
	public void businessRelated() {
		businessRelated.click();
	}
	
	public void getQuoteBtn() {
		getQuoteBtn.click();
	}
	
	

}

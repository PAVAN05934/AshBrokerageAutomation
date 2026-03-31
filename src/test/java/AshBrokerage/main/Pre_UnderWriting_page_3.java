package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AshBrokerage.commonfile.Waits;

public class Pre_UnderWriting_page_3 {
	
	public WebDriver driver;
	public Waits waits;
	public Pre_UnderWriting_page_3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waits = new Waits(driver);

	}
	
	@FindBy(xpath = "//span[text()='No']")
	private WebElement drivingConvictionDui;
	
	@FindBy(xpath = "(//span[text()='No'])[2]")
	private WebElement drivingConvictionViolations;
	
	@FindBy(xpath = "(//span[text()='No'])[3]")
	private WebElement drivingConvictionSuspension;
	
	@FindBy(xpath = "(//span[text()='No'])[4]")
	private WebElement criminalhistory;
	
	@FindBy(xpath = "(//span[text()='No'])[5]")
	private WebElement businessRelated;
	
	@FindBy(xpath = "//button[@id='quoter_action_button_quote']")
	private WebElement getQuoteBtn;
	
	public void drivingConvictionDui() {
		waits.clickWhenReady(drivingConvictionDui);
	
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

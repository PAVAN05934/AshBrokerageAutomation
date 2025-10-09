package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pre_UnderWriting_page_2 {
	
	public WebDriver driver;

	public Pre_UnderWriting_page_2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@name='noHealthConditions2']")
	private WebElement noHealthCondition2;
	
	@FindBy(xpath = "(//input[@name='conditionsFamilyHxParents'])[2]")
	private WebElement conditionsFamilyHxParents;
	
	@FindBy(xpath = "(//input[@name='conditionsFamilyHxSiblings'])[2]")
	private WebElement conditionsFamilyHxSiblings;

	@FindBy(xpath = "//button[@id='quoter_action_button_next']")
	private WebElement NextBtn;

	public void noHealthCondition2() {
		noHealthCondition2.click();
	}
	
	public void conditionsFamilyHxParents() {
		conditionsFamilyHxParents.click();
	}
	
	public void conditionsFamilyHxSiblings() {
		conditionsFamilyHxSiblings.click();
	}
	
	public void NextBtn() {
		NextBtn.click();
	}
	

}

package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AshBrokerage.commonfile.Waits;

public class Pre_UnderWriting_page_2 {
	
	public WebDriver driver;
	public Waits waits;
	
	public Pre_UnderWriting_page_2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waits = new Waits(driver);
	}
	
	@FindBy(xpath = "//span[text()='None of the above']")
	private WebElement noHealthCondition2;
	
	@FindBy(xpath = "//span[text()='No']/parent::div")
	private WebElement conditionsFamilyHxParents;
	
	@FindBy(xpath = "(//span[text()='No'])[2]")
	private WebElement conditionsFamilyHxSiblings;

	@FindBy(xpath = "//button[@id='quoter_action_button_next']")
	private WebElement NextBtn;

	public void noHealthCondition2() {
		waits.clickWhenReady(noHealthCondition2);
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

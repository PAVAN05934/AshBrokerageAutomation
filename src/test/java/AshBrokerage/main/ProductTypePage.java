package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTypePage {
	
	public WebDriver driver;

	public ProductTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='radio checked:radio-primary radio-sm']")
	private WebElement term_btn;
	
	@FindBy(xpath="//input[@class='svelte-17l1npl']")
	private WebElement State_Dropdown;
	
	@FindBy(xpath="//div[text()='Arizona']")
	private WebElement stateSelect;
	
	@FindBy(xpath="//input[@placeholder='Face Amount']")
	private WebElement faceAmount;
	
	@FindBy(xpath="//input[@placeholder='Term Length']")
	private WebElement termLengthselect;
	
	@FindBy(xpath="//div[contains(text(),'20-Year Term')]")
	private WebElement years_term;
	
	@FindBy(xpath="(//button[normalize-space()='PERSONALIZED QUOTE'])[1]")
	private WebElement PersonalizeBtn;
	
	public void termBtn() {
		term_btn.click();
	}
	
	public void stateSelection() {
		State_Dropdown.click();
		stateSelect.click();
	}
	
	public void faceAmountEnter() {
		faceAmount.sendKeys("500000");
	}
	
	public void termLengthSelectionDropdown() {
		termLengthselect.click();
	}
	
	public void termLenthSelect() {
		years_term.click();
	}
	
	public void clickOnPersonalizedQuoteBtn() {
		PersonalizeBtn.click();
	}
	
	
	

}

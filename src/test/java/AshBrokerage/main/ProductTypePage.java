package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductTypePage {
	
	public WebDriver driver;

	public ProductTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='New Quote']")
	private WebElement term_btn;
	
	@FindBy(xpath="//input[@class='svelte-17l1npl']")
	private WebElement State_Dropdown;
	
	@FindBy(xpath="//div[text()='Idaho']")
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
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(term_btn)).click();
	}
	
	public void stateSelection() throws InterruptedException {
		State_Dropdown.click();
		Thread.sleep(2000);
		stateSelect.click();
	}
	
	public void faceAmountEnter() {
		faceAmount.sendKeys("500000");
	}
	
	public void FEfaceAmountEnter() throws InterruptedException {
		Thread.sleep(2000);
		faceAmount.clear();
		Thread.sleep(2000);
		faceAmount.sendKeys("50000");
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
	
	
	
	@FindBy(xpath="//button[text()='IUL']")
	private WebElement iul_btn;
	
	public void iulBtn() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(iul_btn)).click();
	}
	
	
	@FindBy(xpath="//button[text()='QUICK QUOTE']")
	private WebElement quickQuoteBtn;
	
	
	public void clickOnQuickQuoteBtn() throws InterruptedException {
		Thread.sleep(2000);
		quickQuoteBtn.click();
	}
	
	
	@FindBy(xpath="//button[text()='Other Products']")
	private WebElement otherProductsBtn;
	
	public void clickOnOtherProductsBtn() throws InterruptedException {
		Thread.sleep(2000);
		otherProductsBtn.click();
	}
}

   

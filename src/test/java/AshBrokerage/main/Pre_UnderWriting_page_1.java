package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pre_UnderWriting_page_1 {
	
	public WebDriver driver;

	public Pre_UnderWriting_page_1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[contains(@placeholder,'Feet')]")
	private WebElement heightinFeet;
	
	@FindBy(xpath="(//div[@class='item  svelte-3e0qet'])[5]")
	private WebElement height;
	
	@FindBy(xpath="//input[@placeholder='Inches']")
	private WebElement heightinInch;
	
	@FindBy(xpath="(//div[@class='item first hover svelte-3e0qet'])[1]")
	private WebElement inchheightselection;
	
	@FindBy(xpath="//input[@placeholder='Pounds']")
	private WebElement weight;
	
	@FindBy(xpath="(//input[@value='1'])[1]")
	private WebElement usCitizen;
	
	@FindBy(xpath="//input[@placeholder='Tobacco / Nicotine']")
	private WebElement tobaccoNicotine;
	
	@FindBy(xpath="//div[@class='item first hover svelte-3e0qet']")
	private WebElement neverDropdown;
	
	@FindBy(css="input[placeholder='Marijuana Usage']")
	private WebElement marijuanaUsage;
	
	@FindBy(xpath="//div[@class='item first hover svelte-3e0qet']")
	private WebElement neverMarijuanaUsage;
	
	@FindBy(css="input[name='noHealthConditions']")
	private WebElement neverHealthCondition;
	
	@FindBy(xpath="//button[@id='quoter_action_button_next']")
	private WebElement NextBtn;
	
	public void feetinHeightDropDown() throws InterruptedException {
		Thread.sleep(3000);
		heightinFeet.click();
		Thread.sleep(3000);
		height.click();
		
	}
	
	public void inchInheight() throws InterruptedException {
		Thread.sleep(3000);
		heightinInch.click();
		inchheightselection.click();
	}
	
	public void weightPass() throws InterruptedException {
		Thread.sleep(3000);
		weight.sendKeys("180");
		
	}
	
	public void usCitizenRadioBtn() throws InterruptedException {
		Thread.sleep(3000);
		usCitizen.click();
	}
	
	public void tobaccoOrNicotineDropdown() throws InterruptedException {
		Thread.sleep(3000);
		tobaccoNicotine.click();
	}
	
	public void tobaccoOrNicotineUse() throws InterruptedException {
		Thread.sleep(3000);
		neverDropdown.click();
	}
	
	public void marijuanaDropdown() throws InterruptedException {
		Thread.sleep(3000);
		marijuanaUsage.click();
	}
	
	public void marijuanaeUse() throws InterruptedException {
		Thread.sleep(3000);
		neverMarijuanaUsage.click();
	}
	
	public void healthConditionDropDown() throws InterruptedException {
		Thread.sleep(3000);
		neverHealthCondition.click();
	}
	
	public void clickOnNextBtn() {
		NextBtn.click();
		
	}
	
}

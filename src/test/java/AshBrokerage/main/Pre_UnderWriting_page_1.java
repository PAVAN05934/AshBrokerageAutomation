package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AshBrokerage.commonfile.Waits;

public class Pre_UnderWriting_page_1 {

	public WebDriver driver;
	public Waits waits;

	public Pre_UnderWriting_page_1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waits = new Waits(driver);
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Feet')]")
	private WebElement heightinFeet;

	@FindBy(xpath = "(//div[@class='item  svelte-3e0qet'])[5]")
	private WebElement height;

	@FindBy(xpath = "//input[@placeholder='Inches']")
	private WebElement heightinInch;

	@FindBy(xpath = "(//div[@class='item first hover svelte-3e0qet'])[1]")
	private WebElement inchheightselection;

	@FindBy(xpath = "//input[@placeholder='Pounds']")
	private WebElement weight;

	@FindBy(xpath = "(//input[@value='1'])[1]")
	private WebElement usCitizen;

	@FindBy(xpath = "//input[@placeholder='Tobacco / Nicotine']")
	private WebElement tobaccoNicotine;

	@FindBy(xpath = "//div[@class='item first hover svelte-3e0qet']")
	private WebElement neverDropdown;

	@FindBy(css = "input[placeholder='Marijuana Usage']")
	private WebElement marijuanaUsage;

	@FindBy(xpath = "(//div[text()='Never'])[2]")
	private WebElement neverMarijuanaUsage;

	@FindBy(xpath = "//span[text()='None of the above' or class='text-answer ml-2']")
	private WebElement neverHealthCondition;

	@FindBy(xpath = "//button[@id='quoter_action_button_next']")
	private WebElement NextBtn;
	
	
	//FE product
	@FindBy(xpath = "//span[text()='No']")  
	private WebElement ChronicCondition; 
	
	

	public void feetinHeightDropDown() throws InterruptedException {
		waits.clickWhenReady(heightinFeet);
		waits.clickWhenReady(height);

	}

	public void inchInheight() throws InterruptedException {
		waits.clickWhenReady(heightinInch);
		waits.clickWhenReady(inchheightselection);
	}

	public void weightPass() throws InterruptedException {
		waits.sendKeysWhenVisible(weight, "150");

	}
	

	public void usCitizenRadioBtn() throws InterruptedException {
		waits.clickWhenReady(usCitizen);
	}

	public void tobaccoOrNicotineDropdown() throws InterruptedException {
		waits.clickWhenReady(tobaccoNicotine);
	}

	public void tobaccoOrNicotineUse() throws InterruptedException {
		waits.clickWhenReady(neverDropdown);
	}

	public void marijuanaDropdown() throws InterruptedException {
		waits.clickWhenReady(marijuanaUsage);
	}

	public void marijuanaeUse() throws InterruptedException {
		waits.clickWhenReady(neverMarijuanaUsage);
	}

	public void healthConditionDropDown() throws InterruptedException {
		neverHealthCondition.click();
	}

	public void clickOnNextBtn() {
		NextBtn.click();

	}

	public void chronicCondition() {
		ChronicCondition.click();
	}
}

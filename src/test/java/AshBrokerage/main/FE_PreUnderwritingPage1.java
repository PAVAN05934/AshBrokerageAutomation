package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FE_PreUnderwritingPage1 {

	private WebDriver driver;


	@FindBy(xpath = "//input[@placeholder='Feet']")
	private WebElement FeetInput;

	@FindBy(xpath = "//div[text()='5']")
	private WebElement FeetValue;

	@FindBy(xpath = "//input[@placeholder='Inches']")
	private WebElement InchInput;

	@FindBy(xpath = "//div[text()='10']")
	private WebElement InchValue;

	@FindBy(name = "Weight")
	private WebElement WeightInput;

	@FindBy(xpath = "//input[@name='care']")
	private WebElement CareRadio;

	@FindBy(xpath = "//div[@class='col-span-11']//input[@type='text']")
	private WebElement TobaccoDropdown;

	@FindBy(xpath = "//div[@class='listContainer svelte-1uyqfml']//div[1]//div")
	private WebElement TobaccoOption;

	@FindBy(name = "noHealthConditions4")
	private WebElement NoneHealth1;

	@FindBy(id = "quoter_action_button_next")
	private WebElement NextBtn;


	public FE_PreUnderwritingPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillPreUnderwritingPage1() throws InterruptedException {

		Thread.sleep(1500);

		FeetInput.click();
		FeetValue.click();

		InchInput.click();
		InchValue.click();

		WeightInput.clear();
		WeightInput.sendKeys("150");

		CareRadio.click();

		TobaccoDropdown.click();
		TobaccoOption.click();

		NoneHealth1.click();

		NextBtn.click();
	}
}
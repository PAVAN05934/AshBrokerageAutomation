package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iul_advance_page {

	private WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Face Amount']")
	private WebElement FaceAmountRadioBtn;

	@FindBy(xpath = "//span[normalize-space()='Minimum Non-MEC']")
	private WebElement MinimumNonMECBtn;

	@FindBy(xpath = "//input[contains(@placeholder,'Monthly Premium')]")
	private WebElement MonthlyPremium;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement NextBtn;

	@FindBy(xpath = "//input[@placeholder='Death Benefit Option']")
	private WebElement DeathPolicyOptions;

	@FindBy(xpath = "//div[@class='item first hover svelte-3e0qet']")
	private WebElement SelectOptions;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Allocation1;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Allocation2;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Allocation3;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Allocation4;

	@FindBy(xpath = "//span[normalize-space()='Loan Report']")
	private WebElement ReportCheckbox;

	@FindBy(xpath = "//button[normalize-space()='Illustrate']")
	private WebElement IllustrateBtn;

	// Constructor
	public Iul_advance_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ----------------- METHODS -------------------

	public void SolveFor() {
		FaceAmountRadioBtn.click();
		MinimumNonMECBtn.click();
		MonthlyPremium.sendKeys("50000");
		NextBtn.click();
	}

	public void PolicyOption() {
		DeathPolicyOptions.click();
		SelectOptions.click();
		NextBtn.click();
	}

	public void IndexOptions() throws InterruptedException {
		Thread.sleep(1000);
		Allocation1.sendKeys("25");
		Allocation2.sendKeys("25");
		Allocation3.sendKeys("25");
		Thread.sleep(1000);
		Allocation4.sendKeys("25");
		NextBtn.click();
	}

	public void Disbursements() throws InterruptedException {
		Thread.sleep(1000);
		NextBtn.click();
	}

	public void Riders() throws InterruptedException {
		Thread.sleep(1000);
		NextBtn.click();
	}

	public void Reports() throws InterruptedException {
		Thread.sleep(1000);
		ReportCheckbox.click();
		IllustrateBtn.click();
		Thread.sleep(5000);
	}
}
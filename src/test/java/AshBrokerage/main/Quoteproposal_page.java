package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Quoteproposal_page {

	@FindBy(xpath = "//button[normalize-space()='Show More Products']")
	private WebElement ShowmoreBtn;

	@FindBy(xpath = "(//div[@role='button'])[1]")
	private WebElement CheckBox1;

	@FindBy(xpath = "(//div[@role='button'])[3]")
	private WebElement CheckBox2;

	@FindBy(xpath = "(//div[@role='button'])[5]")
	private WebElement CheckBox3;

	@FindBy(xpath = "(//button[normalize-space()='Add Selected (3)'])")
	private WebElement AddselectedBtn;

	@FindBy(xpath = "(//button[normalize-space()='View (3)'])")
	private WebElement ViewBtn;

	@FindBy(xpath = "(//button[normalize-space()='Print'])")
	private WebElement PrintBtn;

	@FindBy(xpath = "(//button[@id='quoter_action_button_back'])")
	private WebElement BackBtn;

	@FindBy(xpath = "(//input[@class='input w-full input-sm pl-3 pr-0 leading-6 text-answer outline outline-1 outline-primary pl-5 focus:outline-none focus:border-primary'])")
	private WebElement FaceamountField;

	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	private WebElement Premiummode;

	@FindBy(xpath = "//div[normalize-space()=\"Quarterly\"]")
	private WebElement Quoterly;

	@FindBy(xpath = "//div[@class='col-span-2 md:col-auto']//input[@type='text']")
	private WebElement Healthclass;

	@FindBy(xpath = "//div[@class='item first svelte-3e0qet']")
	private WebElement PPNT;

	@FindBy(xpath = "//div[@class='grid grid-flow-col md:col-auto col-span-2 md:grid-cols-1 none-FlatExtraRider gap-2']//input[@type='text']")
	private WebElement Flatextra;

	@FindBy(xpath = "//div[@class='item first svelte-3e0qet']")
	private WebElement AddBtn;

	@FindBy(xpath = "//div[contains(@class,'grid grid-cols-2 gap-2')]//input[contains(@type,'text')]")
	private WebElement Years;

	@FindBy(xpath = "//div[contains(@class,'svelte-3e0qet')][normalize-space()='2']")
	private WebElement Selectyear;

	@FindBy(xpath = "//div[@class='col-span-2 ']//input[@type='text']")
	private WebElement Mode;
	
	
	
	@FindBy(xpath = "//div[@class='item active hover svelte-3e0qet' and text()='Annual']")
	private WebElement Annual;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
	private WebElement Productdetails;

	@FindBy(xpath = "//button[contains(@class,'close-button btn btn-active hover:bg-gray-400 text-secondary btn-ghost btn-sm rounded-md btn-back svelte-1s3500y')]")
	private WebElement CloseBtn;

	private WebDriver driver;

	public Quoteproposal_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void QuoteP() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		wait.until(ExpectedConditions.visibilityOf(ShowmoreBtn));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", ShowmoreBtn);
		Thread.sleep(500);
		js.executeScript("arguments[0].click();", ShowmoreBtn);

		wait.until(ExpectedConditions.elementToBeClickable(CheckBox1));
		js.executeScript("arguments[0].click();", CheckBox1);

		wait.until(ExpectedConditions.elementToBeClickable(CheckBox2));
		js.executeScript("arguments[0].click();", CheckBox2);

		wait.until(ExpectedConditions.elementToBeClickable(CheckBox3));
		js.executeScript("arguments[0].click();", CheckBox3);

		wait.until(ExpectedConditions.elementToBeClickable(AddselectedBtn));
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", AddselectedBtn);
		Thread.sleep(300);
		js.executeScript("arguments[0].click();", AddselectedBtn);
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(4000);
		PrintBtn.click();
		Thread.sleep(6000);
		BackBtn.click();
		Thread.sleep(1000);

		Premiummode.click();
		Thread.sleep(2000);
		Quoterly.click();
		Thread.sleep(2000);
		Healthclass.click();
		Thread.sleep(2000);
		PPNT.click();
		Thread.sleep(3000);
		Flatextra.click();
		Thread.sleep(2000);
		AddBtn.click();
		Thread.sleep(6000);
		Years.click();
		Thread.sleep(3000);
		Selectyear.click();
		Thread.sleep(3000);
		Annual.click();
		Thread.sleep(2000);
		Productdetails.click();
		Thread.sleep(2000);
		CloseBtn.click();

	}

}
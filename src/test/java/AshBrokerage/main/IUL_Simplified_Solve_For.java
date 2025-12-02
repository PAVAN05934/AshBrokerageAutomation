	package AshBrokerage.main;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

public class IUL_Simplified_Solve_For {

	public WebDriver driver;

	public IUL_Simplified_Solve_For(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement HealthClass;
	
	@FindBy(xpath="(//div[@class='item active hover svelte-3e0qet'])[1]")
	private WebElement HealthClassSelect;
	
	@FindBy(xpath="(//h4[normalize-space()='What is your goal for this policy?'])[1]")
	private WebElement GoalforPolicy;
	
	@FindBy(xpath="(//span[normalize-space()='Maximum Cash Accumulation and Income'])[1]")
	private WebElement Maximize_Cash_Accumulation;
	
	@FindBy(xpath="(//input[@id='ia1dg_1'])[1]")
	private WebElement Solve_For_Protection;
	
	@FindBy(xpath="(//input[@placeholder='Monthly Premium'])[1]")
	private WebElement MonthlyPremium;
	
	@FindBy(xpath="(//input[@type='text'])[3])")
	private WebElement PremiumDuration;
	
	@FindBy(xpath="(//div[@class='item active first hover svelte-3e0qet'])[1]")
	private WebElement PremiumDurationSelect;
	
	@FindBy(xpath="input[name='SaveAgeCheckbox']")
	private WebElement SaveAge;
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	private WebElement NextBtn;
	
	public void HealthClass() throws InterruptedException {
		Thread.sleep(3000);
		HealthClass.click();
		HealthClassSelect.click();
		}
	
	public void GoalforPolicy() throws InterruptedException {
		Thread.sleep(3000);
		Maximize_Cash_Accumulation.click();
		}
	
/*	public void Solve_For_Protection() throws InterruptedException {
		Thread.sleep(3000);
		Solve_For_Protection.click();
		}*/
	
	public void MonthlyPremium() throws InterruptedException {
		Thread.sleep(3000);
		MonthlyPremium.sendKeys("500");
		}
	public void PremiumDuration() throws InterruptedException {
		Thread.sleep(3000);
		PremiumDuration.click();
		PremiumDurationSelect.click();
		}
	public void SaveAge() throws InterruptedException {
		Thread.sleep(5000);
		SaveAge.click();
		}
	
	public void ClickNextBtn() throws InterruptedException {
	
	    Thread.sleep(3000);
	    NextBtn.click();
	}
	}



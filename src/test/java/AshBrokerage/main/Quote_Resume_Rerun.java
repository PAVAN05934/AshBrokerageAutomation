package AshBrokerage.main;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quote_Resume_Rerun {public WebDriver driver;

	public Quote_Resume_Rerun(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	// ---Resume Elements---
	
	@FindBy(xpath="//span[normalize-space()='Quote / Apply']")
	private WebElement QuoteAndApply;
	
	@FindBy(xpath="(//input[contains(@placeholder,'Search')])[1]")
	private WebElement SearchBox;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary rounded-md shadow-lg w-[97px] h-auto pt-1 pb-1 action-btn'])[1]")
	private WebElement ResumeBtn;
	
	// ---Rerun Elements---
	@FindBy(xpath="(//button[normalize-space()='Quote / Apply'])[1]")
	private WebElement QuoteAndApply_Rerun;
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-primary rounded-md shadow-lg action-btn w-[97px]']")
	private WebElement RerunBtn;
	
	@FindBy(xpath="(//button[normalize-space()='NEXT'])[1]")
	private WebElement PriUnder2NextBtn;
	
	@FindBy(xpath="//button[@class='rounded-md shadow-lg btn btn-active hover:bg-gray-400 btn-ghost uppercase btn-sm mt-5 btn-back tooltip-top tooltip tooltip-primary normal-case']")
	private WebElement QuickQuoteBtn;
	
	// ---Resume Methods---
	public Quote_Resume_Rerun clickonQuoteAndApply() throws InterruptedException {
		Thread.sleep(3000);
		QuoteAndApply.click();
		return this;
		}
	public Quote_Resume_Rerun clickonSearchBox() throws InterruptedException {
		Thread.sleep(3000);
		SearchBox.sendKeys("Niklas Roupe");
		return this;
		}
	public Quote_Resume_Rerun clickonResumeBtn() throws InterruptedException {
		Thread.sleep(3000);
		ResumeBtn.click();
		return this;	
	}
	
	// ---Rerun Methods---
	public Quote_Resume_Rerun clickonQuoteAndApply_Rerun() throws InterruptedException {
		Thread.sleep(3000);
		QuoteAndApply_Rerun.click();
		return this;
		}
	public void clickOnRerunBtn() throws InterruptedException {
		Thread.sleep(4000);
		RerunBtn.click();
	}
	public void clickOnPriUnder2NextBtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(false);", PriUnder2NextBtn);
	    Thread.sleep(500);
	}
	public void QuickQuoteBtnClick() throws InterruptedException {
		Thread.sleep(3000);
		QuickQuoteBtn.click();
	}
}

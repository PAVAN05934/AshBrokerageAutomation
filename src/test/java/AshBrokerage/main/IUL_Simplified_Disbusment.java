package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUL_Simplified_Disbusment {
	
	public WebDriver driver;

	public IUL_Simplified_Disbusment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="(//input[@value='1'])[1]")
	private WebElement IllustrateDisbursement;
	
	@FindBy(xpath="(//input[@placeholder='Begin disbursements at age'])[1]")
	private WebElement BeginDisbursementAge;
	
	@FindBy(xpath="//div[text()='41']")
	private WebElement BeginDisbursementAgeSelect;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement YearsofDisbursement;
	
	@FindBy(xpath="(//div[@class='item active first svelte-3e0qet'])[1]")
	private WebElement YearsofDisbursementSelect;
	
	@FindBy(xpath="(//button[normalize-space()='Illustrate'])[1]")
	private WebElement IllustrateBtn;
	
	public void clickonIllustrateDisbursement() throws InterruptedException {
		Thread.sleep(3000);
		IllustrateDisbursement.click();
		}
	
	public void clickonBeginDisbursementAge() throws InterruptedException {
		Thread.sleep(3000);
		BeginDisbursementAge.click();
		BeginDisbursementAgeSelect.click();
		}
	public void clickonYearsofDisbursement() throws InterruptedException {
		Thread.sleep(3000);
		YearsofDisbursement.click();
		YearsofDisbursementSelect.click();
		}
	public void clickonIllustrateBtn() throws InterruptedException {
		Thread.sleep(3000);
		IllustrateBtn.click();
	}
}

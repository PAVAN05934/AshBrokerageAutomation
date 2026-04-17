package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class QuoterResultPage {

	public WebDriver driver;

	public QuoterResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[text()='Apply'])[5]")
	private WebElement applyBtnforPrincipalJourney;
	
	@FindBy(xpath="(//button[text()='Apply'])[2]")
	private WebElement applyBtnforAmeritasJourney;
	
	@FindBy(xpath="//div[text()='Add']")
	private WebElement flatExtray;
	
	@FindBy(xpath="//input[@name='quoteSelected']")
	private WebElement selectAmericoPremium;
	
	@FindBy(xpath="//div[@role='button']/child::input[@name='quoteSelected']")
	private WebElement selectAmericoEagleSelect;
	
	@FindBy(xpath="(//button[text()='Apply'])[8]")
	private WebElement applyBtnforPaclificLifePromiseTermJourney;
	
	@FindBy(xpath="(//div[starts-with(@class,'w-full text-')]/label)[3]")
	private WebElement quoteDetailseditBtn;
	
	public void applyBtn_ameritasJourney() {
		applyBtnforAmeritasJourney.click();
	}
	
	public void applyBtn_principalJourney() {
		applyBtnforPrincipalJourney.click();
	}

	public void applyBtn_PacificLifePromiseTermJourney() {
		applyBtnforPaclificLifePromiseTermJourney.click();
	}
	
	public void quoteDetailsEditButton() throws InterruptedException {
		    
		  Thread.sleep(10000);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		    wait.until(ExpectedConditions.elementToBeClickable(quoteDetailseditBtn));
		    quoteDetailseditBtn.click();
	}
	
	public void editIUL() throws InterruptedException {
		 Thread.sleep(40000);
		 quoteDetailseditBtn.click();
	}

}

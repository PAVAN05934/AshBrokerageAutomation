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
	
	
	public void applyBtn_ameritasJourney() {
		applyBtnforAmeritasJourney.click();
	}
	
	public void applyBtn_principalJourney() {
		applyBtnforPrincipalJourney.click();
	}

	
}

package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InForce_Policies {
	public WebDriver driver;

	public InForce_Policies(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//span[contains(text(), 'In-Force Policies')]")
	private WebElement InForcePolicies;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary rounded-md shadow-lg action-btn'][normalize-space()='View'])[1]")
	private WebElement ViewBtn;

	@FindBy(xpath="(//button[normalize-space()='Back'])[1]")
	private WebElement BackBtn;
	
	public void clickOnInForcePolicies() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(InForcePolicies));
	    InForcePolicies.click();
	}
	
	public void clickonViewBtn() throws InterruptedException {	
		Thread.sleep(3000);
		ViewBtn.click();
		}
	public void clickonBackBtn() throws InterruptedException {	
		Thread.sleep(3000);
		BackBtn.click();
		}
}

package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InForce_Policies {
	public WebDriver driver;

	public InForce_Policies(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//span[normalize-space()='In-Force Policies']")
	private WebElement InForcePolicies;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary rounded-md shadow-lg action-btn'][normalize-space()='View'])[1]")
	private WebElement ViewBtn;

	@FindBy(xpath="(//button[normalize-space()='Back'])[1]")
	private WebElement BackBtn;
	
	public void clickonInForcePolicies() throws InterruptedException {
		Thread.sleep(3000);
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

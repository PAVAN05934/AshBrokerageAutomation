package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	
	
	public void applyBtn_ameritasJourney() {
		applyBtnforAmeritasJourney.click();
	}
	
	public void applyBtn_principalJourney() {
		applyBtnforPrincipalJourney.click();
	}

	@FindBy(xpath = "//div[@class='col-span-2 md:col-auto']//input[@type='text']")
	private WebElement HealthClass;

	@FindBy(xpath = "//div[contains(text(),'Preferred Plus Tobacco')]")
	private WebElement PPT;

	public void HealthClass() throws InterruptedException {
		Thread.sleep(5000);
		HealthClass.click();
	}



	public void PPT() {
		PPT.click();
	}

}

package AshBrokerage.main;

import java.util.Set;

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
	private WebElement applyBtn;
	
	
	public void applyBtn_ameritasJourney() {
		applyBtn.click();
	}
	
	public void applyBtn_principalJourney() {
		applyBtnforPrincipalJourney.click();
		
		}
	
	
	
}



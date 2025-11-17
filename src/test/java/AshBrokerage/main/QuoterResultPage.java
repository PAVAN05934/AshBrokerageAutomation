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
	
	//@FindBy(xpath="//p[text()='Principal']")
	//private WebElement principalJourney;
	
	//@FindBy(xpath="//p[text()='Term Non-Convertible']")
	//private WebElement termNonConvertible;
	
	@FindBy(xpath="(//button[text()='Apply'])[5]")
	private WebElement applyBtn;
	
	public void applyBtn() {
		applyBtn.click();
	}
	
	
	
}

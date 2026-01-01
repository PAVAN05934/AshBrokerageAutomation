package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class QuoterResultPage {

	public WebDriver driver;

	public QuoterResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="//p[text()='Principal']")
	// private WebElement principalJourney;

	// @FindBy(xpath="//p[text()='Term Non-Convertible']")
	// private WebElement termNonConvertible;

	@FindBy(xpath = "(//button[text()='Apply'])[5]")
	private WebElement applyBtn;

	@FindBy(xpath = "//div[@class='col-span-2 md:col-auto']//input[@type='text']")
	private WebElement HealthClass;

	@FindBy(xpath = "//div[contains(text(),'Preferred Plus Tobacco')]")
	private WebElement PPT;

	public void HealthClass() throws InterruptedException {
		Thread.sleep(5000);
		HealthClass.click();
	}

	public void applyBtn() {
		applyBtn.click();
	}

	public void PPT() {
		PPT.click();
	}

}
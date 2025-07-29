package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement Email_id;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	public WebElement Continue_btn_login; 
	
	@FindBy(xpath="//span[@id=\"error-element-password\"]")
	public WebElement error_msg;
	
	@FindBy(xpath="//p[text()=\"Log in to acme to continue to Techficient Dynamic SPA.\"]")
	public WebElement headline_loginPage;
	
	@FindBy(xpath="//img[@alt=\"acme\"]")
	public WebElement logoOnLoginPage;
	
	//Methods
	public void emailIdPass() {
		Email_id.sendKeys("user@acme.com");
	//	Email_id.sendKeys("admin@email.com");
	}
	
	public void passwordSend() {
		password.sendKeys("BoiseIdaho!");
		}
	
	public void errormsg() {
		String act_error_msg = error_msg.getText();
		String exp_error_msg = "Wrong email or password";
		Assert.assertEquals(act_error_msg, exp_error_msg);
	}
	
	public void checkLogoOnLoginPage() {
		logoOnLoginPage.isEnabled();       
	}
	
	public void clickOnContinueBtn() {
		Continue_btn_login.click();
	}
	
	public void invalidEmailid() {
		Email_id.sendKeys("user4acme.com");
	}
	
	public void invalidPass() {
		password.sendKeys("Test1234");
	}
	
	
}

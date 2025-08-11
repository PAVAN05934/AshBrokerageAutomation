package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver driver;


	public Dashboard(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Clients']")
	private WebElement Clients_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[2]")
	private WebElement QuotesOrApply_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[3]")
	private WebElement cases_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[4]")
	private WebElement Users_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[5]")
	private WebElement InForcePolicy_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[7]")
	private WebElement LearnOrDemo_btn;
	
	@FindBy(xpath="//span[text()='Call Support']")
	private WebElement call_support_btn;
	
	@FindBy(xpath="//span[text()='Email Support']")
	private WebElement email_support_btn;
	
	@FindBy(xpath="//span[@class='ml-3 text-[0.85rem] break-all leading-5 font-light']")
	private WebElement support_email;
	
	
	@FindBy(xpath="(//input[@class='svelte-17l1npl'])[9]")
	private WebElement mode;
	
	@FindBy(xpath="//div[text()='Regular Mode']")
	private WebElement RegularMode;
	
	public void Client_btn() {
	//	System.out.println(Clients_btn.isDisplayed());
		Clients_btn.click();
	
		
	}
	
	public void regularMode() {
		mode.click();
		RegularMode.click();
		
	}
	
	

}

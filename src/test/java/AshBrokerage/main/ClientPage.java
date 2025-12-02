package AshBrokerage.main;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	
	WebDriver driver; 
	 public String title1;
	public ClientPage(WebDriver driver){     //page factory
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	String randomText = RandomStringUtils.randomAlphabetic(10); 
	
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	private WebElement first_name;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public WebElement Last_name; 
	
	@FindBy(xpath="//input[@placeholder='Date of Birth']")
	public WebElement Date_of_Birth; 
	
	@FindBy(xpath="//*[@id=\"page-content\"]/div/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div/input[1]")
	public WebElement Gender; 
	
	@FindBy(xpath="//*[@id=\"page-content\"]/div/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]")
	public WebElement malegender;  //gender selection
	
	@FindBy(xpath="	//button[@class='btn btn-sm btn-primary rounded-md shadow-lg w-[85px] btn-next']")
	public WebElement save_btn;    //clicked on save button
	
	@FindBy(xpath="//button[contains(text(),'Term')]")  //staging
	//@FindBy(xpath="//button[text()='Quote & Apply']")
   public WebElement TermQuoteBtn;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary rounded-md shadow-lg btn-next lg:w-40\" and text()=\"Term\"]")
	public WebElement term_quote;    
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary rounded-md shadow-lg btn-next')]")
	private WebElement Quote_ApplyBtn;

	
	public void firstName() {
		first_name.sendKeys(randomText);
	}
	
	public void lastName() {
		Last_name.sendKeys(randomText);
	}
	
	public void DOB() {
		Date_of_Birth.sendKeys("09091985"); 
	}
	
	public void genderSelection() {
		Gender.click();
		malegender.click();   //selected male gender
	}
	
	public void savebtn() {
		save_btn.click();
	}
	
	public void applyBtn(){
		TermQuoteBtn.click();
		
	}
	
	public void quoteApplyBtn() {
		Quote_ApplyBtn.click();
	}
	
	

}

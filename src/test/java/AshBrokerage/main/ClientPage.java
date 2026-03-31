package AshBrokerage.main;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath="//button[text()='Quote / Apply']")
	private WebElement Quote_ApplyBtn;
	
	//Edit Client Information
	
	@FindBy(xpath="(//button[contains(text(),'View')])[1]")
	private WebElement View_Client_btn;

		//Delete Client Information

		@FindBy(xpath="//*[text()='Delete']")
		private WebElement Delete_Client_btn;
			
		@FindBy(xpath="//button[@class='btn btn-sm text-red-500 font-bold sm:text-base border-2 rounded-md shadow-lg border-red-500 bg-inherit hover:bg-red-200 hover:border-red-500']")
		private WebElement Delete_Client_btn1;
		
public void viewClientBtn() {
		View_Client_btn.click();
	}

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
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.elementToBeClickable(Quote_ApplyBtn)).click();
	}
	
 	//Edit Client Information Methods
	
	public void clickViewClientBtn() {
		View_Client_btn.click();
	}
	
   public void editFirstName(String newFirstName) {
	first_name.clear();
	first_name.sendKeys(newFirstName);
	}


	public void editLastName(String newLastName) {
	Last_name.clear();
	Last_name.sendKeys(newLastName);
	}


	public void editDOB(String newDOB) {
	Date_of_Birth.clear();
	Date_of_Birth.sendKeys(newDOB);
	}


	public void editGenderToMale() {
	Gender.click();
	malegender.click();
	}


	public void clickSaveAfterEdit() {
	save_btn.click();
	}
	
	//Delete Client Information Methods

	public void clickDeleteAfterEdit() {
		// Auto-generated method stub
		Delete_Client_btn.click();
		
		
	}
	
	public void clickDeleteAfterEdit1() {
		// Auto-generated method stub
		Delete_Client_btn1.click();
	}


}

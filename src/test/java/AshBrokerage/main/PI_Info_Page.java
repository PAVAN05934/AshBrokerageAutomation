package AshBrokerage.main;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PI_Info_Page {
	
	private WebDriver driver;

	public PI_Info_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//input[@class='mud-radio-input'])[4]")
	private WebElement PIisNotOwnerRadioBtn;
	
	@FindBy(xpath="(//*[name()='svg'][@role='img'])[9]")
	    private WebElement DeveloperTools;
	
		@FindBy(xpath = "//span[@class='mud-typography mud-typography-button']")
		private WebElement NextBtn_PI;    
		
		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement RegularModecheckBox;
		
		@FindBy(xpath = "(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
		private WebElement driverLicenseNumber;
		
		
		@FindBy(xpath = "//span[text()='Next']")  //Ameritas Journey
		private WebElement nextBtn;
		
		public void PIisNotOwnerRadioBtn() {
			PIisNotOwnerRadioBtn.click();
		}
		
		public void developerTools() {
			DeveloperTools.click();
		}
		
		public void regularModecheckBox() {
			RegularModecheckBox.click();
		}
		
		public void nextBtnPI() throws InterruptedException {
			Thread.sleep(10000);
			NextBtn_PI.click();
		}
		
		public void driverLicenseNumber_txt()  {
			
	
}
		public void nextBtn() {
			nextBtn.click();
		}
		
		public void PIInfoNexBtn() {
			nextBtn.click();
		
		}
		
		
}

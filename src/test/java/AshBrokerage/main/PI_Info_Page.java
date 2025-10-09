package AshBrokerage.main;

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
	
	@FindBy(xpath = "(9//input[@class='mud-radio-input'])[4]")
	private WebElement PIisNotOwnerRadioBtn;
	
	@FindBy(xpath="(//*[name()='svg'][@role='img'])[9]")
	    private WebElement DeveloperTools;
	
		@FindBy(xpath = "//button[text()='Continue']")
		private WebElement continueBtn;
		
		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement RegularModecheckBox;
		
		@FindBy(xpath = "//span[text()='Next']")
		private WebElement NextBtn;

		public void PIisNotOwnerRadioBtn() {
			PIisNotOwnerRadioBtn.click();
		}
		
		public void developerTools() {
			DeveloperTools.click();
		}
		
		public void regularModecheckBox() {
			RegularModecheckBox.click();
		}
		
		public void nextBtn() {
			continueBtn.click();
		}
		
		
	
	

}

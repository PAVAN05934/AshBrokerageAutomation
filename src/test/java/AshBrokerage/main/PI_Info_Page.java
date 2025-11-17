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


		public void PIisNotOwnerRadioBtn() {
			PIisNotOwnerRadioBtn.click();
		}
		
		public void developerTools() {
			DeveloperTools.click();
		}
		
		public void regularModecheckBox() {
			RegularModecheckBox.click();
		}
		
		public void nextBtnPI() {
			NextBtn_PI.click();
		}
		
		public void switchWindow() {
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			String parent_id = (String) it.next();
			String child_id = (String) it.next();
			driver.switchTo().window(child_id);  
		}
	
		
		
	

}

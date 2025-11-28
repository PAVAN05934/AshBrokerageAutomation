package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfile {
	
	private WebDriver driver;

	public UserProfile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//span[@class='text-xl']//*[name()='svg']")
	    private WebElement userProfileIcon;
	
	@FindBy(xpath="div[class='drawer-content flex-col items-center justify-center'] li:nth-child(5) a:nth-child(1)")
	    private WebElement userProfileBtn;
	
		public void userProfileIcon() {
			userProfileIcon.click();
		}
		
		public void userProfileBtn() {
			driver.switchTo().frame(userProfileBtn);
			userProfileBtn.click();
		}
		
		public void usergggchu() {
			driver.switchTo().frame(userProfileBtn);
			userProfileBtn.click();
		}
		
		

}

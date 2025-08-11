package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage {
	WebDriver driver;
	
	public ClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Add Client']")
	private WebElement Add_Client_btn;
	
	
	public void AddClientBtn() {
		Add_Client_btn.click();
	}
	

}

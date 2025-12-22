package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Agent_Information_Page {
	
	WebDriver driver;
    WebDriverWait wait;
    
    public Agent_Information_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[@class='mud-button-root mud-icon-button mud-ripple mud-ripple-radio mud-default-text hover:mud-default-hover mud-radio-dense mud-checked']//input[@name='3e3c4082-40b1-4205-b542-8af130eaa557']")
    private WebElement agentYesRadioBtn;
    
    @FindBy(xpath = "//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']//span[@class='mud-icon-button-label']//*[name()='svg']")
    private WebElement agentsliptBtn;
    
    public void agentYesRadioBtn() {
		agentYesRadioBtn.click();
		}
	
	public void agentsliptBtn() {
		agentsliptBtn.click();		
		
	}
}

	

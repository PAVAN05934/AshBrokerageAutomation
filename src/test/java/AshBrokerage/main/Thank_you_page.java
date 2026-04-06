package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thank_you_page {
	
	private WebDriver driver;

	public Thank_you_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Agent Assist']")
	private WebElement agentAssistBtn;
	
	public void clickOnAgentAssistBtn() {
		agentAssistBtn.click();
	}

}

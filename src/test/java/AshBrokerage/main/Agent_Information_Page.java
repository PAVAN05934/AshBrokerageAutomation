package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Agent_Information_Page {
	
	public WebDriver driver;
    public WebDriverWait wait;
    
    public Agent_Information_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[@class='mud-button-root mud-icon-button mud-ripple mud-ripple-radio mud-default-text hover:mud-default-hover mud-radio-dense mud-checked']//input[@name='3e3c4082-40b1-4205-b542-8af130eaa557']")
    private WebElement agentYesRadioBtn;
    
    @FindBy(xpath = "//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']//span[@class='mud-icon-button-label']//*[name()='svg']")
    private WebElement agentsliptBtn;
    
    @FindBy(xpath = "//input[@id='mudinputuf1gci2o']")
    private WebElement agentfirstname;
    
    @FindBy(xpath = "//input[@id='mudinputjblrchxs']")
    private WebElement agentlastname;
    
    @FindBy(xpath = "//input[@id='mudinputowwaon0i']")
    private WebElement agentphone;
    
    @FindBy(xpath = "//input[@id='mudinputb62oa25f']")
    private WebElement agentemail;
    
    @FindBy(xpath = "//input[@id='mudinput5226s2k8']")
    private WebElement agentcarrierwriting;
    
    @FindBy(xpath = "//input[@id='mudinputnc7g4ues']")
    private WebElement agentpercentage;
    
    @FindBy(xpath = "//input[@id='mudinputcpn47ywj']")
    private WebElement agentsplitpercentage;
    
    @FindBy(xpath = "//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement nextBtn;
    
    //Action Methods
	public void agentpercentage_txt() {
		agentpercentage.clear();
		agentpercentage.sendKeys("10");
	}
    public void agentYes_RadioBtn() {
		agentYesRadioBtn.click();
	}
	public void agentslipt_btn() {
		agentsliptBtn.click();				
	}
	public void agentfirstname_txt() {
		agentfirstname.sendKeys("Fname");
	}
	public void agentlastname_txt() {
		agentlastname.sendKeys("Lname");
	}
	public void agentphone_txt() {
		agentphone.sendKeys("(342) 342-3423");
	}
	public void agentemail_txt() {
		agentemail.sendKeys("testing@yopmail.com");
	}
	public void agentcarrierwriting_txt() {
		agentcarrierwriting.sendKeys("000031162");
	}
	public void agentsplitpercentage_txt() {
		agentsplitpercentage.sendKeys("90");
	}
	public void nextBtn() {
		nextBtn.click();
	}
}

	

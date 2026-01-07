package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_History_Page {
	
		public WebDriver driver;

	    public Personal_History_Page(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	
	    @FindBy(xpath="//span[@class='mud-button-root mud-icon-button mud-ripple mud-ripple-radio mud-default-text hover:mud-default-hover mud-radio-dense mud-checked']//input[@name='c0ec0444-8b20-4b8e-a063-edf00f0597fb']")
	    private WebElement PITravelOutSideUS;
	    
	    @FindBy(xpath="//label[@id='checkboxizbro4b0']//input[@type='checkbox']")
	    private WebElement PurposeofTravel_Work;
	    
	    @FindBy(xpath="//label[@id='checkbox0rp10dmi']//input[@type='checkbox']")
	    private WebElement PurposeofTravel_Other;
	    
	    @FindBy(xpath="(//span[@class='mud-typography mud-typography-button'])[1]")
	    private WebElement Personal_History_NextBtn;
	    
	    public void TravelOutSideUS_radio() {
	    PITravelOutSideUS.click();
	    }
	    
	    public void PurposeofTravel_Work_checkbox() {
	    	PurposeofTravel_Work.click();
	    }
	    
	    public void PurposeofTravel_Other_checkbox() {
	    	PurposeofTravel_Other.click();
	    }
	    public void Personal_History_Next_Btn() {
	    	Personal_History_NextBtn.click();
	    }
}

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
	
	    @FindBy(xpath="//input[@name='905035b2-d383-41c0-bd58-10a7edb11f06'])[1]")
	    private WebElement PITravelOutSideUS;
	    
	    @FindBy(xpath="//label[@id='checkboxbc50vg4p']//input[@type='checkbox']")
	    private WebElement PurposeofTravel_Work;
	    
	    @FindBy(xpath="(//input[@type='checkbox'])[3]")
	    private WebElement PurposeofTravel_Other;
	    
	    @FindBy(xpath="(//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple'])[1]")
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

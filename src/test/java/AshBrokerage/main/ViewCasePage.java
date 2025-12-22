package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCasePage {

   public WebDriver driver;

    // -------------------------------
    // Constructor
    // -------------------------------
    public ViewCasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }
    
   //Cases button Elements
    
    @FindBy(xpath = "//span[text()='Cases']/parent::a")
    WebElement casesButton;
    
    //search box Elements
    
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchBox;
    
    //View Case button elements
    
    @FindBy(xpath = "//body//div//div[@slot='body']//div//div[1]//div[7]//span[1]//div[1]//button[1]")
    WebElement viewCaseButton;

    // Open eApp button elements
    @FindBy(xpath = "//button[normalize-space()='Open eApp']")
    WebElement openEappButton;
    
    //Completed Carrier Application link elements
   /* @FindBy(xpath = "//p[@class='cursor-pointer text-blue-500']")
    WebElement completedCarrierAppLink;
    
    //Resend Email link elements
    @FindBy(xpath = "(//*[name()='path'])[8]")
    WebElement resendEmailLink;
    
    //Resend message elements
    @FindBy(xpath = "//div[@class='toast-message']")
    WebElement resendMessage; */
    
    // -------------------------------
    // Scroll until element is visible
    // -------------------------------
   /* public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }
*/
    
    public void clickCasesButton() {
        
        try {
            // Navigate to Users tab
        	casesButton.click();

            // Perform a search action
        	searchBox.sendKeys("testttttfgffg");
            
            // Clear the existing value in the search field
        	searchBox.clear();

         // Perform a search action
        	searchBox.sendKeys("Asia Valiant");
        	
        	searchBox.clear();
        	
        	viewCaseButton.click();
        	
        	openEappButton.click();
        	
        	// completedCarrierAppLink.click();
        	
        	 // resendEmailLink.click();
        	
        	 // resendMessage.isDisplayed();
        	
        	Thread.sleep(5000);
        	
        } catch (Exception e) {
			e.printStackTrace();
			
    }
    
}
    
}



        
        

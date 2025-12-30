package AshBrokerage.main;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewCasePage {

    public WebDriver driver;

    // -------------------------------
    // Constructor
    // -------------------------------
    public ViewCasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // -------------------------------
    // Page Elements
    // -------------------------------

    // Cases button
    @FindBy(xpath = "//span[text()='Cases']/parent::a")
    WebElement casesButton;

    // Search box
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchBox;

    // View Case button
    @FindBy(xpath = "//button[normalize-space()='View Case']/parent::div")
    WebElement viewCaseButton;

    // Open eApp button
    @FindBy(xpath = "//button[normalize-space()='Open eApp']")
    WebElement openEappButton;
    
    @FindBy(xpath = "//p[@class='cursor-pointer text-blue-500']")
    WebElement completedCarrierAppLink;

    @FindBy(xpath = "(//*[name()='path'])[8]")
    WebElement resendEmailLink;

    @FindBy(xpath = "//div[@class='toast-message']")
    WebElement resendMessage;
    
    // -------------------------------
    // Utility Methods
    // -------------------------------

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].scrollIntoView({block: 'center'});",
                element
        );
    }

    public void waitForViewCaseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(viewCaseButton));
    }

    // -------------------------------
    // Page Actions / Methods
    // -------------------------------

    public void clickCasesButton() {
        casesButton.click();
    }

    public void searchCase(String caseName) {
        searchBox.clear();
        searchBox.sendKeys(caseName);
    }

    public void clearSearchBox() {
        searchBox.clear();
    }

    public void clickViewCaseButton() {
        waitForViewCaseButton();
        viewCaseButton.click();
    }
    

    public void clickOpenEappButton() {
        openEappButton.click();
    }

    public void clickCompletedCarrierAppLink() {
		scrollToElement(completedCarrierAppLink);
		completedCarrierAppLink.click();
	}
   
    public void openCaseAndLaunchEapp(String caseName) throws InterruptedException {
        clickCasesButton();
        searchCase(caseName);
        clickViewCaseButton();
        clickOpenEappButton();
        Thread.sleep(5000);
        clickCompletedCarrierAppLink();
    }
}

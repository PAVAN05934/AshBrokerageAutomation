package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtherProductPage {

    public WebDriver driver;
    WebDriverWait wait;

    // ================== Constructor ==================

    public OtherProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    // ================== Product Type ==================
    
    @FindBy(xpath = "//button[text()='Other Products']")
    private WebElement otherProductsBtn;

    public void clickOtherProducts() {
        wait.until(ExpectedConditions.elementToBeClickable(otherProductsBtn)).click();
    }

    @FindBy(xpath = "//input[@placeholder='Product Type']")
    private WebElement productTypeInput;

    // ================== Product Information ==================

    @FindBy(xpath = "(//input[@placeholder='Solicitation State'])[1]")
    private WebElement solicitationStateInput;

    @FindBy(xpath = "//h4[text()='Health Class']/ancestor::div[contains(@class,'flex')]//input[@type='text']")
    private WebElement healthClassInput;

    // ================== Text Fields ==================

    @FindBy(name = "carrierName")
    private WebElement carrierNameInput;

    @FindBy(name = "productName")
    private WebElement productNameInput;

    @FindBy(xpath = "//input[@placeholder='Premium']")
    private WebElement premiumInput;

    // ================== Premium Mode ==================

    @FindBy(xpath = "//input[@placeholder='Premium Mode']")
    private WebElement premiumModeInput;

    
    // ================== Monthly Benefit ==================

    @FindBy(xpath = "(//input[@placeholder='Monthly Benefit Amount'])[1]")
    private WebElement monthlyBenefitInput;
    
    // ================== Action Button ==================

    @FindBy(id = "quoter_action_button_next")
    private WebElement nextButton;

    // ================== Actions ==================

    private void selectFromDropdown(WebElement element, String value) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }

    private void enterText(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }

    // ================== Business Flow ==================

    public void completeOtherProductPage(
            String productType,
            String solicitationState,
           // String healthClass,
            String carrierName,
            String productName,
            String premium,
            String premiumMode, 
            String monthlyBenefit
            
    	)
    		
    {

        selectFromDropdown(productTypeInput, productType);
        selectFromDropdown(solicitationStateInput, solicitationState);
        //selectFromDropdown(healthClassInput, healthClass);

        enterText(carrierNameInput, carrierName);
        enterText(productNameInput, productName);
        enterText(premiumInput, premium);
        selectFromDropdown(premiumModeInput, premiumMode);
        enterText(monthlyBenefitInput, monthlyBenefit);

        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
    }
}

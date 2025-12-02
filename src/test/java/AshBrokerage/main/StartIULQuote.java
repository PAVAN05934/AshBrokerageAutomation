// java
package AshBrokerage.main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StartIULQuote {

    WebDriver driver;
    WebDriverWait wait;

    public StartIULQuote(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space() = 'IUL']")
    private WebElement iulButton;

    // Solicitation State select container / input / hidden value
    @FindBy(xpath = "//div[contains(@class,'selectContainer')]//input[@type='text' or @placeholder='']")
    private WebElement solicitationStateInput;

    @FindBy(xpath = "//div[contains(@class,'selectedItem')]//div[contains(@class,'selection')]")
    private WebElement solicitationStateSelected;    

    // Next / Personalized Quote button
    @FindBy(xpath = "(//button[normalize-space()='QUICK QUOTE'])[1]")
    private WebElement QuickQuoteButton;

    // --- Element actions ---

    public void selectProductType(String product) {
        if (product == null) return;
        try {
            switch (product.trim().toLowerCase()) {

                case "iul": iulButton.click(); break;
                default:
                    // fallback: click by visible button text
                    driver.findElement(By.xpath("//button[normalize-space()='" + product + "']")).click();
            }
        } catch (Exception ignored) {}
    }

    public void selectSolicitationState(String state) {
        if (state == null || state.isEmpty()) return;
        try {
            solicitationStateInput.click();
            By stateOption = By.xpath("//div[normalize-space()='" + state + "']");
            wait.until(ExpectedConditions.elementToBeClickable(stateOption));
            driver.findElement(stateOption).click();
        } catch (Exception ignored) {}
    }
  
    public void clickNext() {
        try { QuickQuoteButton.click(); } catch (Exception ignored) {}
    }
   
    public void completeStartIULQuote(
            String productType,
            String solicitationState)
    {
       selectProductType(productType);
       selectSolicitationState(solicitationState); 
       clickNext();
    }
}

package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteApplyPage {

    private WebDriver driver;

    // =======================
    // BUTTONS / RADIOS
    // =======================

    @FindBy(xpath = "//button[text()='Final Expense']")
    private WebElement finalExpenseBtn;

    @FindBy(xpath = "//input[@value='1']")
    private WebElement startNewQuoteRadio;

    @FindBy(id = "quoter_action_button_next")
    private WebElement nextBtn;

    // =======================
    // STATE SELECTION
    // =======================

    @FindBy(xpath = "//input[@placeholder='Solicitation State']")
    private WebElement stateDropdown;

    @FindBy(xpath = "//div[text()='Arizona']")
    private WebElement stateArizona;

    // =======================
    // FACE AMOUNT
    // =======================

    @FindBy(xpath = "//input[@placeholder='Face Amount']")
    private WebElement faceAmount;

    // =======================
    // IUL FLOW ELEMENTS
    // =======================

    @FindBy(xpath = "//*[@id='page-content']/div/div[3]/div/div/div/div[2]/div/div[1]/button[3]")
    private WebElement IULBtn;

    @FindBy(xpath = "//*[@id='page-content']/div/div[3]/div/div/div/div[2]/div/div[3]/button")
    private WebElement quickQuoteBtn;

    @FindBy(xpath = "//*[@id='page-content']/div/div[3]/div/div/div/div[2]/div[2]/div[2]/div[2]/div/button")
    private WebElement advanceStartBtn;

    @FindBy(xpath = "//input[@placeholder='Solicitation State']")
    private WebElement selectStateDropdown;

    @FindBy(xpath = "//div[contains(text(),'Arizona')]")
    private WebElement selectState;

    // =======================
    // CONSTRUCTOR
    // =======================

    public QuoteApplyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // =======================
    // ACTION METHODS
    // =======================

    public void selectFinalExpense() {
        finalExpenseBtn.click();
        startNewQuoteRadio.click();
        nextBtn.click();
    }

    public void selectIUL() throws InterruptedException {
        Thread.sleep(1000);
        IULBtn.click();

        selectStateDropdown.click();
        selectState.click();

        quickQuoteBtn.click();
        Thread.sleep(1000);
        advanceStartBtn.click();
    }

    public void enterQuoteDetails() {
        stateDropdown.click();
        stateArizona.click();

        faceAmount.clear();
        faceAmount.sendKeys("50000");

        nextBtn.click();
    }
}

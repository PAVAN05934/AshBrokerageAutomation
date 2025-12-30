package AshBrokerage.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QuoteApplyPage {

    private WebDriver driver;

    private By finalExpenseBtn = By.xpath("//button[text()='Final Expense']");
    private By startNewQuoteRadio = By.xpath("//input[@value='1']");
    private By nextBtn = By.id("quoter_action_button_next");

    private By stateDropdown = By.xpath("//input[@placeholder='Solicitation State']");
    private By stateArizona = By.xpath("//div[text()='Arizona']");

    private By faceAmount = By.xpath("//input[@placeholder='Face Amount']");
    
    private By IULBtn = By.xpath("//*[@id=\"page-content\"]/div/div[3]/div/div/div/div[2]/div/div[1]/button[3]");
    private By QuickquoteBtn = By.xpath("//*[@id=\"page-content\"]/div/div[3]/div/div/div/div[2]/div/div[3]/button");
    private By AdvancestartBtn = By.xpath("//*[@id=\"page-content\"]/div/div[3]/div/div/div/div[2]/div[2]/div[2]/div[2]/div/button");
    private By Selectstatedropdown = By.xpath("//input[@placeholder='Solicitation State']");
    private By Selectstate = By.xpath("//div[contains(text(),'Arizona')]");
    
    
    public QuoteApplyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

   	}

    public void selectFinalExpense() {
        driver.findElement(finalExpenseBtn).click();
        driver.findElement(startNewQuoteRadio).click();
        driver.findElement(nextBtn).click();
    }

    public void selectIUL() throws InterruptedException {
    	Thread.sleep(1000);
        driver.findElement(IULBtn).click();
        driver.findElement(Selectstatedropdown).click();
        driver.findElement(Selectstate).click();
        driver.findElement(QuickquoteBtn).click();
        Thread.sleep(1000);
        driver.findElement(AdvancestartBtn).click();
        
    }
    
    	
    public void enterQuoteDetails() {
        driver.findElement(stateDropdown).click();
        driver.findElement(stateArizona).click();

        driver.findElement(faceAmount).clear();
        driver.findElement(faceAmount).sendKeys("50000");

        driver.findElement(nextBtn).click();
    }
}
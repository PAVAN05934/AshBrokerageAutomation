package AshBrokerage.main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;

    @FindBy(xpath = "(//input[@class='svelte-17l1npl'])[9]")
    private WebElement ModeDropdown;

    @FindBy(xpath = "//div[text()='Regular Mode']")
    private WebElement RegularModeOption;

    @FindBy(xpath = "//span[contains(text(), 'Quote / Apply')]")
    private WebElement QuoteApplyTab;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void selectRegularMode() throws InterruptedException {
        Thread.sleep(4000);
        ModeDropdown.click();
        Thread.sleep(2000);
        RegularModeOption.click();
    }

    public void openQuoteApply() {
        QuoteApplyTab.click();
    }
}
package FEflow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    private By modeDropdown = By.xpath("(//input[@class='svelte-17l1npl'])[9]");
    private By regularModeOption = By.xpath("//div[text()='Regular Mode']");
    private By quoteApplyTab = By.xpath("//span[contains(text(), 'Quote / Apply')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

   	}

    public void selectRegularMode() throws InterruptedException {
        
    	driver.findElement(modeDropdown).click();
        driver.findElement(regularModeOption).click();
    }

    public void openQuoteApply() {
        driver.findElement(quoteApplyTab).click();
    }
}

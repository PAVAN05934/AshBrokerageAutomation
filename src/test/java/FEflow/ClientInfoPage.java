package FEflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ClientInfoPage {

    private WebDriver driver;

    private By btnQuoteApply = By.xpath("//button[contains(text(),'Quote / Apply')]");
    private By btnCreateNew = By.xpath("//button[contains(text(),'Create New')]");

    private By firstName = By.xpath("//input[@placeholder='First Name']");
    private By lastName = By.xpath("//input[@placeholder='Last Name']");
    private By dob = By.xpath("//input[@placeholder='Date of Birth']");
    private By gender = By.xpath("//input[@placeholder='Gender']");
    private By maleOption = By.xpath("//div[text()='Male']");
    private By createClient = By.xpath("//button[text()='Create Client']");

    public ClientInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

   	}

    public void startNewQuote() throws InterruptedException {
        Thread.sleep(2000);
    	driver.findElement(btnQuoteApply).click();
        driver.findElement(btnCreateNew).click();
    }

    public void enterClientDetails() {
        driver.findElement(firstName).sendKeys("John Michael Smith");
        driver.findElement(lastName).sendKeys("Doe");
        driver.findElement(dob).sendKeys("01/01/1990");

        driver.findElement(gender).click();
        driver.findElement(maleOption).click();
        driver.findElement(createClient).click();
    }
}


package FEflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class PreUnderwritingPage {

    private WebDriver driver;

    private By feetInput = By.xpath("//input[@placeholder='Feet']");
    private By feetValue = By.xpath("//div[text()='5']");

    private By inchInput = By.xpath("//input[@placeholder='Inches']");
    private By inchValue = By.xpath("//div[text()='10']");

    private By weight = By.name("Weight");
    private By careRadio = By.xpath("//input[@name='care']");

    private By tobaccoDropdown = By.xpath("//div[@class='col-span-11']//input[@type='text']");
    private By tobaccoOption = By.xpath("//div[@class='listContainer svelte-1uyqfml']//div[1]//div");

    private By noneHealth1 = By.name("noHealthConditions4");
    private By nextBtn = By.id("quoter_action_button_next");

    public PreUnderwritingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

   	}

    public void fillPreUnderwritingPage1() throws InterruptedException {
        Thread.sleep(5000);
    	driver.findElement(feetInput).click();
        driver.findElement(feetValue).click();

        driver.findElement(inchInput).click();
        driver.findElement(inchValue).click();

        driver.findElement(weight).clear();
        driver.findElement(weight).sendKeys("150");

        driver.findElement(careRadio).click();

        driver.findElement(tobaccoDropdown).click();
        driver.findElement(tobaccoOption).click();

        driver.findElement(noneHealth1).click();

        driver.findElement(nextBtn).click();
    
    
   
}
}



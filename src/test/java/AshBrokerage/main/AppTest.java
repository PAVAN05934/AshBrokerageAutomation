package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void testOpenLoginPage() {
        driver.get("https://dynamic-advisor-qa.techf.com/");
        driver.manage().window().maximize();

        wait.until((ExpectedCondition<Boolean>) wd ->
            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("acme\n");
    }

    @Test(dependsOnMethods = "testOpenLoginPage")
  

    	public void testLogin() throws InterruptedException {
    		Thread.sleep(1000);

    		OrganizationPage org = new OrganizationPage(driver);
    		org.enteroriganzationName();
    		org.clickonContinuebtn();
    		LoginPage loginPage = new LoginPage(driver);
    		loginPage.emailIdPass();
    		loginPage.passwordSend();
    		loginPage.clickOnContinueBtn();

    		Thread.sleep(7000);
    	}
    	
    

    @Test(dependsOnMethods = "testLogin")
    public void testQuoteApplyFlow() throws InterruptedException {
        // Scroll the sidebar to make the dropdown visible
        WebElement mode = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("(//input[@class='svelte-17l1npl'])[9]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mode);

        // Click the dropdown input
        mode.click();

        // Wait for and click the "Regular Mode" option
        WebElement regularMode = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[text()='Regular Mode']")));
        regularMode.click();

        WebElement sidebarTab = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[contains(@class, 'sidebar-tab') and contains(text(), 'Quote / Apply')]")));
        sidebarTab.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(@class, 'btn-next') and contains(text(), 'Quote / Apply')]")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'btn-next') and contains(text(), 'Create New')]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John Michael Smith");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");
        driver.findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("01/01/1990");
        driver.findElement(By.xpath("//input[@placeholder='Gender']")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'item') and contains(@class, 'first') and contains(@class, 'hover') and text()='Male']")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'btn-next') and text()='Create Client']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//button[contains(@class, 'btn-next') and text()='Final Expense']")));
        driver.findElement(By.xpath("//button[contains(@class, 'btn-next') and text()='Final Expense']")).click();

        driver.findElement(By.xpath("//input[@type='radio' and @name='Start new quote or upload an illustration for submission' and @value='1']")).click();

        // Wait for the button to be present and visible
        WebElement personalizedBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("quoter_action_button_next")
        ));

        // scroll into view
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({behavior:'smooth', block:'center'});", personalizedBtn
        );

        // try normal click, fallback to JS click if blocked
        try {
            personalizedBtn.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", personalizedBtn);
        }

        // small pause to allow navigation
        Thread.sleep(500);

        // Wait for and click the dropdown input with placeholder 'Solicitation State'
        WebElement solicitationStateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//input[@placeholder='Solicitation State' and contains(@class, 'svelte-17l1npl')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", solicitationStateDropdown);
        solicitationStateDropdown.click();

        // Wait for and click the "Arizona" option
        WebElement arizonaOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class, 'item') and contains(@class, 'svelte-3e0qet') and text()='Arizona']")));
        arizonaOption.click();

        // Wait for the Face Amount input, click and enter 50000
        WebElement faceamount = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//input[@placeholder='Face Amount' and contains(@class,'input')]")
        ));
        faceamount.click();
        faceamount.clear();
        faceamount.sendKeys("50000");

        // Click personalized button (use elementToBeClickable + JS fallback)
        WebElement pesonalizedbutto = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("quoter_action_button_next")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior:'smooth', block:'center'});", pesonalizedbutto);
        try {
            pesonalizedbutto.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pesonalizedbutto);
        }

        // Wait for the personalized action to complete / page to update
        wait.until(ExpectedConditions.stalenessOf(pesonalizedbutto));

// Select Feet dropdown
WebElement feetInput = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//input[@placeholder='Feet']")));
feetInput.click();
wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div[contains(text(),'5')]"))).click();   // choose any value

// Select Inches dropdown
WebElement inchInput = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//input[@placeholder='Inches']")));
inchInput.click();
wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div[contains(text(),'10')]"))).click();  // choose any value

// Enter Weight
WebElement weight = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.name("Weight")));
weight.clear();
weight.sendKeys("150");

// Select Care radio button
WebElement careRadio = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//input[@type='radio' and @name='care']")));
careRadio.click();

// Tobacco/Nicotine dropdown

WebElement Tobacco_Nicotindropdown = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div[@class='col-span-11']//input[@type='text']")));
Tobacco_Nicotindropdown.click();

WebElement ddOption = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div[@class='listContainer svelte-1uyqfml']//div[1]//div")));
ddOption.click();

WebElement NoneOfTheAboveCheckBox = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//input[@name='noHealthConditions4']")));
NoneOfTheAboveCheckBox.click();

WebElement NextButton = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//button[@id='quoter_action_button_next']")));
NextButton.click();

// Pre - Underwriting Page 2

WebElement NoneOfTheAboveCheckBox1 = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//input[@name='noHealthConditions3']")));
NoneOfTheAboveCheckBox1.click();

WebElement NoButton = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div[@class='w-full custom-radio']//input[@name='criminalhistory']")));
NoButton.click();

WebElement NoButton1 = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//div[@class='w-full custom-radio']//input[@name='drivingConvictionDui']")));
NoButton1.click();

WebElement NextButton1 = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//button[@id='quoter_action_button_next']")));
NextButton1.click();
















// Select Checkbox
WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
        By.name("noHealthConditions4")));
if (!checkbox.isSelected()) {
    checkbox.click();
}







        

        // Now wait for the NEXT button by id to become clickable (may re-use same id)
        WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("quoter_action_button_next")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior:'smooth', block:'center'});", nextBtn);
        try {
            nextBtn.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextBtn);
        }

        // small pause to let any animation finish
        Thread.sleep(500);

        // If you need to click NEXT again, wait and click again
        WebElement nextBtn2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("quoter_action_button_next")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior:'smooth', block:'center'});", nextBtn2);
        try {
            nextBtn2.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextBtn2);
        }


        WebElement applyBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//button[contains(@class, 'applyButton') and contains(text(), 'Apply')]")
        ));

        // Scroll to the "Apply" button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", applyBtn);

        // Click the "Apply" button
        applyBtn.click();
    }
}

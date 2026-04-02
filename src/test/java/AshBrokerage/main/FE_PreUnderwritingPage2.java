package AshBrokerage.main;



	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import java.time.Duration;

	public class FE_PreUnderwritingPage2 {

	    WebDriver driver;
	    WebDriverWait wait;

	    // Constructor
	    public FE_PreUnderwritingPage2(WebDriver driver) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        PageFactory.initElements(driver, this);
	    }

	    // ------------------- LOCATORS -------------------

	    @FindBy(xpath = "//span[text()='None of the above']")
	    private WebElement noneOfTheAboveCheckBox1;

	    @FindBy(xpath = "//span[text()='No']")
	    private WebElement criminalHistoryNo;

	    @FindBy(xpath = "(//span[text()='No'])[2]")
	    private WebElement drivingConvictionDuiNo;

	    @FindBy(id = "quoter_action_button_next")
	    private WebElement nextButton;

	    // ------------------- ACTION METHODS -------------------

	    public void selectNoneOfTheAbove() {
	        wait.until(ExpectedConditions.elementToBeClickable(noneOfTheAboveCheckBox1)).click();
	    }

	    public void selectCriminalHistoryNo() {
	        wait.until(ExpectedConditions.elementToBeClickable(criminalHistoryNo)).click();
	    }

	    public void selectDrivingConvictionDuiNo() {
	        wait.until(ExpectedConditions.elementToBeClickable(drivingConvictionDuiNo)).click();
	    }

	    public void clickNextButton() {
	        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	    }

	    // ------------------- MAIN FLOW METHOD -------------------


	    public void completePreUnderwritingPage2() {
	        selectNoneOfTheAbove();
	        selectCriminalHistoryNo();
	        selectDrivingConvictionDuiNo();
	        clickNextButton();
	    }
	}
	

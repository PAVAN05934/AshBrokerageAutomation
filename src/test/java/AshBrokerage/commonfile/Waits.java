package AshBrokerage.commonfile;


	
	import java.time.Duration;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Waits {
		
	    private WebDriver driver;
	    private WebDriverWait wait;

	    public Waits(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    // ✅ Clickable wait
	    public void clickWhenReady(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	    }

	    // ✅ Send keys after visible
	    public void sendKeysWhenVisible(WebElement element, String value) {
	        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
	    }

	    // ✅ Only wait for visibility
	    public WebElement waitForVisibility(WebElement element) {
	        return wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    // ✅ Wait using locator
	    public WebElement waitForElement(By locator) {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
	}



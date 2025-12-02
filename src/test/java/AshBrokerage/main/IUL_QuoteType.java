package AshBrokerage.main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUL_QuoteType {public WebDriver driver;

public IUL_QuoteType(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);	
}

@FindBy(xpath="(//button[@class='btn btn-sm btn-primary rounded-md shadow-lg btn-next'][normalize-space()='Start'])[1]")
private WebElement SimplifiedBtn;

public void clickonSimplifiedBtn() throws InterruptedException {
	Thread.sleep(3000);
	SimplifiedBtn.click();
	}
}



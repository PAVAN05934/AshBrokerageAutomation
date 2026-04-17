package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit_page {
	
public WebDriver driver;
	
	public Submit_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//h1[@class='mud-typography mud-typography-h1'])[2]")
	public WebElement submitPageHeader;
	
	public void verifTextOnSubmitPage() {
		String expectedText = "Status: Application Submitted To Carrier";
		String actualText = submitPageHeader.getText();
		
		if (actualText.equals(expectedText)) {
		    System.out.println("Text verification passed: " + actualText);
		} else {
		    System.out.println("Text verification failed. Expected: '" + expectedText + "', but got: '" + actualText + "'");
		}
	}
	
}

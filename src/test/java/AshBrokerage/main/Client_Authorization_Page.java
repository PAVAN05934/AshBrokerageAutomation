package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_Authorization_Page {
	public WebDriver driver;

    public Client_Authorization_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="(//span[@class='mud-button-label'])[3]")
    private WebElement Nextbtn;

    public void Next_btn() {
		Nextbtn.click();
	}
}

package AshBrokerage.main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Noy use this code
public class FE_PreUnderwritingPage1 {

	public WebDriver driver;



	@FindBy(xpath = "//input[@name='care']")
	private WebElement CareRadio;

	@FindBy(xpath = "//div[@class='col-span-11']//input[@type='text']")
	private WebElement TobaccoDropdown;

	@FindBy(xpath = "//div[@class='listContainer svelte-1uyqfml']//div[1]//div")
	private WebElement TobaccoOption;

	@FindBy(name = "noHealthConditions4")
	private WebElement NoneHealth1;

	@FindBy(id = "quoter_action_button_next")
	private WebElement NextBtn;


	public FE_PreUnderwritingPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillPreUnderwritingPage1() throws InterruptedException {

		CareRadio.click();

		TobaccoDropdown.click();
		TobaccoOption.click();

		NoneHealth1.click();

		NextBtn.click();
	}
}
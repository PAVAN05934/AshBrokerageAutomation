package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pre_UnderWriting_page_2 {
	
	public WebDriver driver;

	public Pre_UnderWriting_page_2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	//@FindBy()
}

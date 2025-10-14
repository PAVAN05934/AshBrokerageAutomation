package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Beneficiary_Info_page {
	
	public WebDriver driver;
	
	public Beneficiary_Info_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}

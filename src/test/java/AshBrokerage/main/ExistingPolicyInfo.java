package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ExistingPolicyInfo {
	WebDriver driver;
	public ExistingPolicyInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

package AshBrokerage.core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Base {
	
public WebDriver driver;

@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://dynamic-advisor-staging.techf.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}

package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.LoginPage;
import AshBrokerage.main.OrganizationPage;

public class LoginPage_test_scenario extends Base{
	
	@Test
	public void loginFlow() { //Valid Credential
		OrganizationPage org = new OrganizationPage(driver);
		org.enteroriganzationName();
		org.clickonContinuebtn();
		LoginPage login = new LoginPage(driver);
		login.emailIdPass();
		login.passwordSend();
		login.clickOnContinueBtn();
		
	}
	
	//Invalid Username and Password scenario
//	@Test
	public void invalidCredentialPass() {
		OrganizationPage org = new OrganizationPage(driver);
		org.enteroriganzationName();
		org.clickonContinuebtn(); 
		LoginPage login = new LoginPage(driver);
		login.invalidEmailid();
		login.invalidPass();
		login.clickOnContinueBtn();
		login.errormsg();
	}
	
	@Test(dependsOnMethods="loginFlow")
	public void dfsdf() throws InterruptedException {
		Thread.sleep(10000);
		String url = driver.getCurrentUrl();
		System.out.println("URL is" + url);
	}
	
	
	
	
	
	
	

}

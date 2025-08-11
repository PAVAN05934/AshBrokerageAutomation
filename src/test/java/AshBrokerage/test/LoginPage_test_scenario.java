package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.LoginPage;
import AshBrokerage.main.OrganizationPage;
import AshBrokerage.main.ProductTypePage;

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
	public void invalidCredentialPass() throws InterruptedException {
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
	public void client_create() throws InterruptedException {
		Dashboard dash = new Dashboard(driver);
		dash.regularMode();
		dash.Client_btn();
		ClientsPage cp = new ClientsPage(driver);
		cp.AddClientBtn();
		ClientPage clientpa = new ClientPage(driver);
		clientpa.firstName();
		clientpa.lastName();
		clientpa.DOB();
		clientpa.genderSelection();
		clientpa.savebtn();
		Thread.sleep(5000);
	}
		
		
		@Test(dependsOnMethods="client_create")
		public void termQuote() throws InterruptedException {
		ClientPage clientpa = new ClientPage(driver);
		clientpa.quoteApplyBtn();
		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(5000);
		product.termBtn();
		
	}
}
	
	
	
	
	
	
	



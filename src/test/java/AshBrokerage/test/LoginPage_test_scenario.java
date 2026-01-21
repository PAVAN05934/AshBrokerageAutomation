package AshBrokerage.test;

import org.testng.annotations.Test;
import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.InForce_Policies;
import AshBrokerage.main.LoginPage;
import AshBrokerage.main.OrganizationPage;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.Quote_Resume_Rerun;
import AshBrokerage.main.UserInformationPage;
import AshBrokerage.main.ViewCasePage;

public class LoginPage_test_scenario extends Base {

	// Invalid User name and Password scenario
	@Test(enabled = false)
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

	@Test
	public void userProfile() throws InterruptedException {
		Dashboard dash = new Dashboard(driver);
		dash.userProfile();
		Thread.sleep(5000);
		dash.User_p();
		UserInformationPage userInf = new UserInformationPage(driver);
		userInf.edit_btn();
		userInf.firstName_txt();
		userInf.lastName_txt();
		userInf.phoneNumber_txt();
		userInf.address_txt();
		userInf.city_txt();
		userInf.npn_txt();
		// userInf.zip_txt();
		userInf.insuranceLicenseInfoSection();
		userInf.addIcon();
		userInf.newStateAdd();
		userInf.contactSection();
		userInf.carrierAdd_Btn();
		userInf.carrierDrpDown();
	}

	@Test
	public void InforcePolicies() throws InterruptedException {
		InForce_Policies inp = new InForce_Policies(driver);
		inp.clickonInForcePolicies();
		inp.clickonViewBtn();
		inp.clickonBackBtn();
	}

	@Test
	public void Quote_Resume_RerunTest() throws InterruptedException {
		Quote_Resume_Rerun qrr = new Quote_Resume_Rerun(driver);
		qrr.clickonQuoteAndApply();
		qrr.clickonSearchBox();
		qrr.clickonResumeBtn();
	}

	@Test
	public void Quote_RerunTest() throws InterruptedException {
		Dashboard dash = new Dashboard(driver);
		dash.regularMode();

		Quote_Resume_Rerun qrr = new AshBrokerage.main.Quote_Resume_Rerun(driver);
		qrr.clickonQuoteAndApply();
		qrr.clickonQuoteAndApply_Rerun();
		qrr.clickonSearchBox();
		qrr.clickOnRerunBtn();

		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(5000);
		product.termBtn();
		qrr.QuickQuoteBtnClick();
	}

	// Edit Client Information Test

	@Test
	public void EditClient() throws InterruptedException {

		Dashboard dash = new Dashboard(driver);
		dash.regularMode();
		dash.Client_btn();
		ClientPage client = new ClientPage(driver);

		// Edit fields using new methods
		client.clickViewClientBtn();
		client.editFirstName("UpdatedFname");
		client.editLastName("UpdatedLname");
		client.editDOB("01011990");
		// client.editGenderToMale();

		// Save changes
		client.clickSaveAfterEdit();

		Thread.sleep(3000);

	}

	// Delete Client Information Test

	@Test
	public void DeleteClient() throws InterruptedException {

		Dashboard dash = new Dashboard(driver);
		dash.regularMode();
		dash.Client_btn();
		ClientPage client = new ClientPage(driver);

		// Save changes
		client.clickViewClientBtn();
		client.clickDeleteAfterEdit();
		client.clickDeleteAfterEdit1();
		Thread.sleep(3000);

	}

	@Test
	public void clickCasesButtonTest() throws InterruptedException {

		ViewCasePage viewCasePage = new ViewCasePage(driver);

		viewCasePage.clickCasesButton();
		viewCasePage.searchCase("Asia Valiant");
		Thread.sleep(5000);
		viewCasePage.clickViewCaseButton();
		// viewCasePage.clickOpenEappButton();
		Thread.sleep(5000);
		viewCasePage.clickCompletedCarrierAppLink();

	}
}

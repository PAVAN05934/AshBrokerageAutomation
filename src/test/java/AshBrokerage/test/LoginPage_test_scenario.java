package AshBrokerage.test;

import java.util.Set;

import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.InForce_Policies;
import AshBrokerage.main.LoginPage;
import AshBrokerage.main.OrganizationPage;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.Quote_Resume_Rerun;
import AshBrokerage.main.UserInformationPage;

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

	@Test // Created User Profile XML file
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

	@Test // Done
	public void InforcePolicies() throws InterruptedException {
		InForce_Policies inp = new InForce_Policies(driver);
		inp.clickonInForcePolicies();
		inp.clickonViewBtn();
		inp.clickonBackBtn();
	}

	@Test
	public void Quote_Resume_RerunTest() throws InterruptedException {
		AshBrokerage.main.Quote_Resume_Rerun qrr = new AshBrokerage.main.Quote_Resume_Rerun(driver);
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

}

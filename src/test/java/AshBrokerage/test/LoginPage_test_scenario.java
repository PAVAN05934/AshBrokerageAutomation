package AshBrokerage.test;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.IUL_QuoteType;
import AshBrokerage.main.IUL_Simplified_Disbusment;
import AshBrokerage.main.IUL_Simplified_Solve_For;
import AshBrokerage.main.InForce_Policies;
import AshBrokerage.main.KnockOutPage;
import AshBrokerage.main.LoginPage;
import AshBrokerage.main.OrganizationPage;
import AshBrokerage.main.PI_Info_Continued;
import AshBrokerage.main.PI_Info_Page;
import AshBrokerage.main.Policy_Owner_InfoPage;
import AshBrokerage.main.Pre_UnderWriting_page_1;
import AshBrokerage.main.Pre_UnderWriting_page_2;
import AshBrokerage.main.Pre_UnderWriting_page_3;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.Quote_Resume_Rerun;
import AshBrokerage.main.QuoterResultPage;
import AshBrokerage.main.StartIULQuote;
import AshBrokerage.main.UserInformationPage;
import AshBrokerage.main.UserProfile;
import AshBrokerage.main.UsersPage;
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

	@Test (priority=1)
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

	@Test(dependsOnMethods = "client_create", priority=2)
	public void termQuote() throws InterruptedException {
		ClientPage clientpa = new ClientPage(driver);
		clientpa.quoteApplyBtn();
		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(5000);
		product.termBtn();

	}

	@Test(dependsOnMethods = "termQuote", priority=3)
	public void TermFlow() throws InterruptedException {
		ProductTypePage product = new ProductTypePage(driver);
		product.stateSelection();
		product.faceAmountEnter();
		product.termLengthSelectionDropdown();
		product.termLenthSelect();
		product.clickOnPersonalizedQuoteBtn();
		Pre_UnderWriting_page_1 preUnderWri = new Pre_UnderWriting_page_1(driver);
		preUnderWri.feetinHeightDropDown();
		preUnderWri.inchInheight();
		preUnderWri.weightPass();
		preUnderWri.usCitizenRadioBtn();
		preUnderWri.tobaccoOrNicotineDropdown();
		preUnderWri.tobaccoOrNicotineUse();
		preUnderWri.marijuanaDropdown();
		preUnderWri.marijuanaeUse();
		preUnderWri.healthConditionDropDown();
		preUnderWri.clickOnNextBtn();
		Pre_UnderWriting_page_2 preUnderWri2 = new Pre_UnderWriting_page_2(driver);
		Thread.sleep(5000);
		preUnderWri2.noHealthCondition2();
		preUnderWri2.conditionsFamilyHxParents();
		preUnderWri2.conditionsFamilyHxSiblings();
		preUnderWri2.NextBtn();
		Pre_UnderWriting_page_3 preUnderWri3 = new Pre_UnderWriting_page_3(driver);
		Thread.sleep(5000);
		preUnderWri3.drivingConvictionDui();
		preUnderWri3.drivingConvictionViolations();
		preUnderWri3.drivingConvictionSuspension();
		preUnderWri3.criminalhistory();
		preUnderWri3.businessRelated();
		preUnderWri3.getQuoteBtn();
		QuoterResultPage quote = new QuoterResultPage(driver);
		Thread.sleep(10000);
	}

	@Test(priority = 4)
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
	
	
	//View Case Page Test
	
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

	//Starting of IUL Quote Flow
			@Test(dependsOnMethods="termQuote")
			public void startIULQuoteTest()
			{		
				StartIULQuote startIUL = new StartIULQuote(driver);
				startIUL.completeStartIULQuote(
						"IUL",        // productType
						"Arizona"    // solicitationState
						);
			}
			
			@Test(dependsOnMethods="startIULQuoteTest")
			public void IULQuoteTypeTest() throws InterruptedException {
			IUL_QuoteType iulQuoteType = new IUL_QuoteType(driver); 
			iulQuoteType.clickonSimplifiedBtn();
			}
			
			@Test(dependsOnMethods="IULQuoteTypeTest")
			public void IUL_Simplified_Solve_ForTest() throws InterruptedException {
				IUL_Simplified_Solve_For iulSolveFor = new IUL_Simplified_Solve_For(driver);
				iulSolveFor.HealthClass();
				iulSolveFor.GoalforPolicy();
			//	iulSolveFor.Solve_For_Protection();
				iulSolveFor.MonthlyPremium();
			//	iulSolveFor.PremiumDuration();
			//	iulSolveFor.SaveAge();
				iulSolveFor.ClickNextBtn();			
			}
			
			@Test(dependsOnMethods="IUL_Simplified_Solve_ForTest")
			public void IUL_Simplified_DisbusmentTest() throws InterruptedException {
				IUL_Simplified_Disbusment iulDisbursement = new IUL_Simplified_Disbusment(driver);
				iulDisbursement.clickonIllustrateDisbursement();
				iulDisbursement.clickonBeginDisbursementAge();
				iulDisbursement.clickonYearsofDisbursement();
				iulDisbursement.clickonIllustrateBtn();
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
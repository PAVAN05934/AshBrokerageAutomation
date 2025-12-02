package AshBrokerage.test;
import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
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
import AshBrokerage.main.QuoterResultPage;
import AshBrokerage.main.UserProfile;
import AshBrokerage.main.UsersPage;
import AshBrokerage.main.StartIULQuote;
import AshBrokerage.main.IUL_QuoteType;
import AshBrokerage.main.IUL_Simplified_Solve_For;
import AshBrokerage.main.InForce_Policies;
import AshBrokerage.main.IUL_Simplified_Disbusment;
import AshBrokerage.main.Quote_Resume_Rerun;
public class LoginPage_test_scenario extends Base{
	
	@Test
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
		@Test(dependsOnMethods="termQuote")
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
			quote.applyBtn();
			KnockOutPage knock = new KnockOutPage(driver);
			Thread.sleep(10000);
			knock.carrierKnockout();
			knock.continueBtn();
			PI_Info_Page pi = new PI_Info_Page(driver);	
			Thread.sleep(5000);
			pi.PIisNotOwnerRadioBtn();
			pi.developerTools();
			pi.regularModecheckBox();
			pi.nextBtn();
			Policy_Owner_InfoPage policy = new Policy_Owner_InfoPage(driver);
			Thread.sleep(5000);
			policy.policyOwnerDropdown();
			policy.individualOption();
			policy.ownerFirstName("OwnerFname");
			policy.ownerLastName("OwnerLname");
			policy.ownerDOB("01011990");
			policy.ownerEmail("owner@gmail.com");
			policy.ownerPhoneNumber("9876543210");
			policy.ownerSSN("45555");
			policy.ownerAddress("123 Street");
			policy.ownerAddress2("Address2");
			policy.ownerCity("City");
			policy.stateDropdown();
			policy.ownerPrimarylanguageEnglishRadioBtn();
			policy.ownerAnnualIncomeRadioBtn();
			policy.nextBtn();
			PI_Info_Continued pi2 = new PI_Info_Continued(driver);
			Thread.sleep(5000);
			pi2.disabledYesRadioBtn();
			pi2.disabilityDetails("Disability details");
			pi2.principalYesRadioBtn();
			pi2.lifeInsuranceYesRadioBtn();
			pi2.nextBtn();
					
		}
		
		@Test(dependsOnMethods="loginFlow")
		 
		public void userProfileTest() {
			UserProfile up = new UserProfile(driver);
			up.userProfileIcon();
			up.userProfileBtn();
		}
		
		@Test//(dependsOnMethods="client_create")
		(dependsOnMethods="loginFlow")
		public void completeUsersPageTest() {
		    UsersPage usersPage = new UsersPage(driver);
		    usersPage.completeUsersPage();
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
		@Test(dependsOnMethods="loginFlow")
		public void InforcePolicies() throws InterruptedException {
			InForce_Policies inp = new InForce_Policies(driver);
			inp.clickonInForcePolicies();
			inp.clickonViewBtn();
			inp.clickonBackBtn();
		}
		@Test(dependsOnMethods="loginFlow")
		public void Quote_Resume_RerunTest() throws InterruptedException {
			AshBrokerage.main.Quote_Resume_Rerun qrr = new AshBrokerage.main.Quote_Resume_Rerun(driver);
			qrr.clickonQuoteAndApply();
			qrr.clickonSearchBox();
			qrr.clickonResumeBtn();
		}
		@Test(dependsOnMethods="loginFlow")
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
		

	
	
	
	



package AshBrokerage.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.IUL_QuoteType;
import AshBrokerage.main.IUL_Simplified_Disbusment;
import AshBrokerage.main.IUL_Simplified_Solve_For;
import AshBrokerage.main.Pre_UnderWriting_page_1;
import AshBrokerage.main.Pre_UnderWriting_page_2;
import AshBrokerage.main.Pre_UnderWriting_page_3;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.QuoterResultPage;
import AshBrokerage.main.StartIULQuote;

public class IUL_Testcases extends LoginPage_test_scenario { 
	public WebDriver driver;
	
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

	@Test(dependsOnMethods = "client_create")
	public void termQuote() throws InterruptedException {
		ClientPage clientpa = new ClientPage(driver);
		clientpa.quoteApplyBtn();
		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(5000);
		product.termBtn();

	}
	
	@Test(dependsOnMethods = "termQuote")
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

	@Test
	public void startIULQuoteTest() throws InterruptedException
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

}

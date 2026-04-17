package AshBrokerage.test;

import org.testng.annotations.Test;
import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.FE_PreUnderwritingPage2;
import AshBrokerage.main.IUL_QuoteType;
import AshBrokerage.main.IUL_Simplified_Disbusment;
import AshBrokerage.main.IUL_Simplified_Solve_For;
import AshBrokerage.main.InForce_Policies;
import AshBrokerage.main.OtherProductPage;
import AshBrokerage.main.Pre_UnderWriting_page_1;
import AshBrokerage.main.Pre_UnderWriting_page_2;
import AshBrokerage.main.Pre_UnderWriting_page_3;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.QuoteApplyPage;
import AshBrokerage.main.Quote_Resume_Rerun;
import AshBrokerage.main.QuoterResultPage;
import AshBrokerage.main.StartIULQuote;


public class Term_testcases extends Base {
	
	@Test
	public void TermFlow() throws InterruptedException {
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
		clientCreation.TermFlow_UptoQuoteResult_Page();
			
	}
	
	@Test
	public void termEditBtn() throws InterruptedException {
		QuoterResultPage quoteResult = new QuoterResultPage(driver);
		quoteResult.quoteDetailsEditButton();
	}
	
	@Test
	public void feFlow() throws InterruptedException {
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		QuoteApplyPage quote = new QuoteApplyPage(driver);
		quote.selectFinalExpense();
		ProductTypePage product = new ProductTypePage(driver);
		//product.stateSelection();
		product.FEfaceAmountEnter();
		Thread.sleep(5000);
		product.clickOnPersonalizedQuoteBtn();
		Pre_UnderWriting_page_1 preUnderWri = new Pre_UnderWriting_page_1(driver);
		preUnderWri.chronicCondition();
		//preUnderWri.tobaccoOrNicotineDropdown();
	//	preUnderWri.tobaccoOrNicotineUse();
		preUnderWri.healthConditionDropDown();
		preUnderWri.clickOnNextBtn();
		Thread.sleep(5000);
		FE_PreUnderwritingPage2 preUnderWri2 = new FE_PreUnderwritingPage2(driver);
		preUnderWri2.completePreUnderwritingPage2();
	}
	
	@Test
	public void feEditBtn() throws InterruptedException {
		QuoterResultPage quoteResult = new QuoterResultPage(driver);
		quoteResult.quoteDetailsEditButton();
	}
	
	@Test
	public void iulSelection() throws InterruptedException {
		ProductTypePage product = new ProductTypePage(driver);
		product.iulBtn();
		Thread.sleep(3000);
		product.clickOnQuickQuoteBtn();
		IUL_QuoteType iulQuoteType = new IUL_QuoteType(driver); 
		iulQuoteType.clickonSimplifiedBtn();
		IUL_Simplified_Solve_For iulSolveFor = new IUL_Simplified_Solve_For(driver);
		iulSolveFor.HealthClass();
		iulSolveFor.GoalforPolicy();
		iulSolveFor.MonthlyPremium();
		iulSolveFor.ClickNextBtn();	
		IUL_Simplified_Disbusment iulDisbursement = new IUL_Simplified_Disbusment(driver);
		iulDisbursement.clickonIllustrateDisbursement();
		iulDisbursement.clickonBeginDisbursementAge();
		iulDisbursement.clickonYearsofDisbursement();
		iulDisbursement.clickonIllustrateBtn();
		
	}
	
	@Test
	public void iulEditBtn() throws InterruptedException {
		QuoterResultPage quoteResult = new QuoterResultPage(driver);
		quoteResult.editIUL();
	}
	
	@Test
	public void otherProduct() throws InterruptedException {
		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(3000);
		product.clickOnOtherProductsBtn();
		OtherProductPage otherProductPage = new OtherProductPage(driver);
		otherProductPage.productTypeSelect();
		otherProductPage.carrierNameEnter();
		otherProductPage.productNameEnter();
		otherProductPage.premiumEnter();
		otherProductPage.premiumModeSelect();
		
	}
	
	@Test
	public void InforcePolicies() throws InterruptedException {
		InForce_Policies inp = new InForce_Policies(driver);
		inp.clickOnInForcePolicies();
		inp.clickonViewBtn();
		inp.clickonBackBtn();
	}

	@Test
	public void Quote_Resume_RerunTest() throws InterruptedException {
		Quote_Resume_Rerun qrr = new Quote_Resume_Rerun(driver);
		qrr.clickonQuoteAndApply();
		qrr.clickonSearchBox();
		qrr.clickOnRerunBtn();
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

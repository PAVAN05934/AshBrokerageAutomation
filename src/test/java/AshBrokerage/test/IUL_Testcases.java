package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.IUL_QuoteType;
import AshBrokerage.main.IUL_Simplified_Disbusment;
import AshBrokerage.main.IUL_Simplified_Solve_For;

import AshBrokerage.main.StartIULQuote;

public class IUL_Testcases extends Base { 
	
	@Test
	public void startIULQuoteTest() throws InterruptedException
	{	
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
		StartIULQuote startIUL = new StartIULQuote(driver);
		startIUL.completeStartIULQuote(
				"IUL",        // productType
				"Arizona"    // solicitationState
				);
	}
	
	@Test
	public void IULQuoteTypeTest() throws InterruptedException {
	IUL_QuoteType iulQuoteType = new IUL_QuoteType(driver); 
	iulQuoteType.clickonSimplifiedBtn();
	}
	
	@Test
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
	
	@Test
	public void IUL_Simplified_DisbusmentTest() throws InterruptedException {
		IUL_Simplified_Disbusment iulDisbursement = new IUL_Simplified_Disbusment(driver);
		iulDisbursement.clickonIllustrateDisbursement();
		iulDisbursement.clickonBeginDisbursementAge();
		iulDisbursement.clickonYearsofDisbursement();
		iulDisbursement.clickonIllustrateBtn();
	}

}

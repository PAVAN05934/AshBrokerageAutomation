package AshBrokerage.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import AshBrokerage.core.Base;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.IUL_QuoteType;
import AshBrokerage.main.IUL_Simplified_Disbusment;
import AshBrokerage.main.IUL_Simplified_Solve_For;
import AshBrokerage.main.StartIULQuote;

public class IUL_Testcases extends Base{ 
	public WebDriver driver;
	
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

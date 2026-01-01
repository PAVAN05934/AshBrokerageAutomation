package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.OrganizationPage;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.FE_PreUnderwritingPage1;
import AshBrokerage.main.FE_PreUnderwritingPage2;
import AshBrokerage.main.QuoteApplyPage;
import AshBrokerage.main.QuoterResultPage;

public class FE_flow extends Base {

	@Test
	public void runQuoteApplyFlow() throws Exception {

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
		ClientPage clientpaq = new ClientPage(driver);
		clientpaq.quoteApplyBtn();
		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(5000);

		QuoteApplyPage quote = new QuoteApplyPage(driver);
		quote.selectFinalExpense();
		Thread.sleep(1500);
		quote.enterQuoteDetails();

		FE_PreUnderwritingPage1 pre = new FE_PreUnderwritingPage1(driver);
		Thread.sleep(1500);
		pre.fillPreUnderwritingPage1();

		FE_PreUnderwritingPage2 pre2 = new FE_PreUnderwritingPage2(driver);
		Thread.sleep(1500);
		pre2.completePreUnderwritingPage2();

		QuoterResultPage SelectHealthClass = new QuoterResultPage(driver);
		SelectHealthClass.HealthClass();
		SelectHealthClass.PPT();

	}
}

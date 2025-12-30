package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.ClientInfoPage;
import AshBrokerage.main.HomePage;
import AshBrokerage.main.Iul_advance_page;
import AshBrokerage.main.QuoteApplyPage;

public class IUL_advance_Flow extends Base {
	@Test
	public void runIULFlow() throws Exception {

		Thread.sleep(5000);

		HomePage home = new HomePage(driver);
		home.selectRegularMode();
		home.openQuoteApply();

		ClientInfoPage client = new ClientInfoPage(driver);
		client.startNewQuote();
		client.enterClientDetails();

		QuoteApplyPage quote = new QuoteApplyPage(driver);
		quote.selectIUL();

		Iul_advance_page advance = new Iul_advance_page(driver);
		advance.SolveFor();
		advance.PolicyOption();
		advance.IndexOptions();
		advance.Disbursements();
		advance.Riders();
		advance.Reports();

	}
}

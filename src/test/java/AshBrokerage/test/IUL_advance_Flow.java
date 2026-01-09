package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.Iul_advance_page;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.QuoteApplyPage;

public class IUL_advance_Flow extends Base {
	@Test
	public void runIULFlow() throws Exception {
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
		Thread.sleep(5000);
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

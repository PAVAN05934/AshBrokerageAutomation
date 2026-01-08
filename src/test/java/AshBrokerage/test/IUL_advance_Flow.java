package AshBrokerage.test;

import org.testng.annotations.Test;

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

		Thread.sleep(5000);

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

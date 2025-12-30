package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.Pre_UnderWriting_page_1;
import AshBrokerage.main.Pre_UnderWriting_page_2;
import AshBrokerage.main.Pre_UnderWriting_page_3;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.Quoteproposal_page;

public class Quoteproposal_test extends Base {

	@Test
	public void TermFlow() throws Exception {

	
		Dashboard dash = new Dashboard(driver);
		Thread.sleep(2000);
		dash.regularMode();
		dash.Client_btn();
		ClientsPage cp = new ClientsPage(driver);
		cp.AddClientBtn();
		ClientPage client = new ClientPage(driver);
		client.firstName();
		client.lastName();
		client.DOB();
		client.genderSelection();
		client.savebtn();
		Thread.sleep(3000);

		client.quoteApplyBtn();

		
		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(3000);
		product.termBtn();

		product.stateSelection();
		product.faceAmountEnter();
		product.termLengthSelectionDropdown();
		product.termLenthSelect();
		product.clickOnPersonalizedQuoteBtn();

	
		Pre_UnderWriting_page_1 pre1 = new Pre_UnderWriting_page_1(driver);
		pre1.feetinHeightDropDown();
		pre1.inchInheight();
		pre1.weightPass();
		pre1.usCitizenRadioBtn();
		pre1.tobaccoOrNicotineDropdown();
		pre1.tobaccoOrNicotineUse();
		pre1.marijuanaDropdown();
		pre1.marijuanaeUse();
		pre1.healthConditionDropDown();
		pre1.clickOnNextBtn();

		Pre_UnderWriting_page_2 pre2 = new Pre_UnderWriting_page_2(driver);
		Thread.sleep(3000);
		pre2.noHealthCondition2();
		pre2.conditionsFamilyHxParents();
		pre2.conditionsFamilyHxSiblings();
		pre2.NextBtn();

		Pre_UnderWriting_page_3 pre3 = new Pre_UnderWriting_page_3(driver);
		Thread.sleep(3000);
		pre3.drivingConvictionDui();
		pre3.drivingConvictionViolations();
		pre3.drivingConvictionSuspension();
		pre3.criminalhistory();
		pre3.businessRelated();
		pre3.getQuoteBtn();

		Thread.sleep(3000);

		Quoteproposal_page quoteResults = new Quoteproposal_page(driver);
		quoteResults.QuoteP();
	
	}
}
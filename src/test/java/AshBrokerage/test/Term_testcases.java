package AshBrokerage.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.KnockOutPage;
import AshBrokerage.main.Pre_UnderWriting_page_1;
import AshBrokerage.main.Pre_UnderWriting_page_2;
import AshBrokerage.main.Pre_UnderWriting_page_3;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.QuoterResultPage;

public class Term_testcases extends Base {
	
	@Test(groups = {"regression"})
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
		quote.applyBtn_ameritasJourney();
		KnockOutPage knock = new KnockOutPage(driver);
		Thread.sleep(5000);
		knock.carrierKnockout();
		Thread.sleep(5000);
		knock.continueBtn();
	}

	

}

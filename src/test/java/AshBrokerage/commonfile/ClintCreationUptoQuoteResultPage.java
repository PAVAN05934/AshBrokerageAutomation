package AshBrokerage.commonfile;

import org.openqa.selenium.WebDriver;

import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.FE_PreUnderwritingPage2;
import AshBrokerage.main.KnockOutPage;
import AshBrokerage.main.Pre_UnderWriting_page_1;
import AshBrokerage.main.Pre_UnderWriting_page_2;
import AshBrokerage.main.Pre_UnderWriting_page_3;
import AshBrokerage.main.ProductTypePage;
import AshBrokerage.main.QuoteApplyPage;
import AshBrokerage.main.QuoterResultPage;

public class ClintCreationUptoQuoteResultPage {
	
	public WebDriver driver;
	
	public ClintCreationUptoQuoteResultPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void creatClient() throws InterruptedException {
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
		clientpa.quoteApplyBtn();
		
		ProductTypePage product = new ProductTypePage(driver);
		product.termBtn();
	}
	
	
	public void TermFlow_UptoQuoteResult_Page() throws InterruptedException {
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
		
	}
	
	public void FEFlowUptoQuoteResult() throws InterruptedException {
		QuoteApplyPage quote = new QuoteApplyPage(driver);
		quote.selectFinalExpense();
		ProductTypePage product = new ProductTypePage(driver);
		product.stateSelection();
		product.FEfaceAmountEnter();
		Thread.sleep(5000);
		product.clickOnPersonalizedQuoteBtn();
		
		Pre_UnderWriting_page_1 preUnderWri = new Pre_UnderWriting_page_1(driver);
		preUnderWri.feetinHeightDropDown();
		preUnderWri.inchInheight();
		preUnderWri.weightPass();
		preUnderWri.chronicCondition();
		preUnderWri.tobaccoOrNicotineDropdown();
		preUnderWri.tobaccoOrNicotineUse();
		preUnderWri.healthConditionDropDown();
		preUnderWri.clickOnNextBtn();
		Thread.sleep(5000);
		FE_PreUnderwritingPage2 preUnderWri2 = new FE_PreUnderwritingPage2(driver);
		preUnderWri2.completePreUnderwritingPage2();
		
	}

}

package AshBrokerage.test;


import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.ClientInfoPage;
import AshBrokerage.main.HomePage;
import AshBrokerage.main.LoginPage;
import AshBrokerage.main.OrganizationPage;
import AshBrokerage.main.FE_PreUnderwritingPage1;
import AshBrokerage.main.FE_PreUnderwritingPage2;
import AshBrokerage.main.QuoteApplyPage;
import AshBrokerage.main.QuoterResultPage;


public class FE_flow extends Base {

    @Test
    public void runQuoteApplyFlow() throws Exception {

     

        HomePage home = new HomePage(driver);
        home.selectRegularMode();
        home.openQuoteApply();

        ClientInfoPage client = new ClientInfoPage(driver);
        client.startNewQuote();
        client.enterClientDetails();

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

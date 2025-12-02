package Feflowtestcase;


import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import FEflow.ClientInfoPage;
import FEflow.HomePage;
import FEflow.LoginPage;
import FEflow.PreUnderwritingPage;
import FEflow.PreUnderwritingPage2;
import FEflow.QuoteApplyPage;

public class QuoteApplyTest extends Base {

    @Test
    public void runQuoteApplyFlow() throws Exception {

        driver.get("https://dynamic-advisor-qa.techf.com/");

        LoginPage login = new LoginPage(driver);
        login.enterTenant();
        Thread.sleep(1000);
        login.setUsername("Admin@acme.com");
        login.setPassword("BoiseIdaho!");
        login.clickLogin();

        Thread.sleep(5000);

        HomePage home = new HomePage(driver);
        home.selectRegularMode();
        home.openQuoteApply();

        ClientInfoPage client = new ClientInfoPage(driver);
        client.startNewQuote();
        client.enterClientDetails();

        QuoteApplyPage quote = new QuoteApplyPage(driver);
        quote.selectFinalExpense();
        Thread.sleep(5000);
        quote.enterQuoteDetails();

        PreUnderwritingPage pre = new PreUnderwritingPage(driver);
        Thread.sleep(5000);
        pre.fillPreUnderwritingPage1();
        
        PreUnderwritingPage2 pre2 = new PreUnderwritingPage2(driver);
        Thread.sleep(3000);
        pre2.completePreUnderwritingPage2(); 
    }
}

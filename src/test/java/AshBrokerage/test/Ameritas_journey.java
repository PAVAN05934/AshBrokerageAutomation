package AshBrokerage.test;

import java.util.Set;

import org.testng.annotations.Test;

import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.Additional_Policy_Info;
import AshBrokerage.main.Agent_Information_Page;
import AshBrokerage.main.Beneficiary_Info_page;
import AshBrokerage.main.ExistingPolicyInfo;
import AshBrokerage.main.Family_History;
import AshBrokerage.main.Health_Condition_page;
import AshBrokerage.main.Health_Info_page;
import AshBrokerage.main.KnockOutPage;
import AshBrokerage.main.Life_style_questions;
import AshBrokerage.main.PI_Info_Page;
import AshBrokerage.main.ProposedInsuredInfo_Second;
import AshBrokerage.main.QuoterResultPage;
import AshBrokerage.main.Thank_you_page;
import AshBrokerage.main.Verify_info_page;

public class Ameritas_journey extends Base{
	
	@Test
	public void AmeritasJourneyFlow() throws InterruptedException {
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
		clientCreation.TermFlow_UptoQuoteResult_Page();
		QuoterResultPage quote = new QuoterResultPage(driver);
		Thread.sleep(10000);
    	quote.applyBtn_ameritasJourney();
		KnockOutPage knock = new KnockOutPage(driver);
		Thread.sleep(5000);
		knock.carrierKnockout();
		Thread.sleep(5000);
		String parentWindowID = driver.getWindowHandle();
		System.out.println("Parent window ID: " + parentWindowID);
		knock.continueBtn();
		Thread.sleep(10000);
		PI_Info_Page pi = new PI_Info_Page(driver);
		
		Set<String> windowHandles = driver.getWindowHandles();
		 for (String childWindow : windowHandles) {
	            if (!childWindow.equals(parentWindowID)) {
	                driver.switchTo().window(childWindow);
	                System.out.println("Switched to child window" + childWindow);
	                Thread.sleep(5000);
	                pi.nextBtnPI();
	                Thread.sleep(5000);
	                ProposedInsuredInfo_Second PIISecond = new ProposedInsuredInfo_Second(driver);
	                PIISecond.usArmedForcesYesRadioBtn();
	                PIISecond.pendingAnotherCompanyYesRadioBtn();
	                PIISecond.health_insudeclinedYesRadioBtn();
	                PIISecond.nextBtn();
	                Thread.sleep(5000);
	                ExistingPolicyInfo existingPolicy = new ExistingPolicyInfo(driver);
	                existingPolicy.clickOnNextBtn();
	                Thread.sleep(5000);
	                pi.PIInfoNexBtn();
	                Thread.sleep(5000);
	                Additional_Policy_Info additionalPolicy = new Additional_Policy_Info(driver);
	                additionalPolicy.clickOnNextBtn();
	                Thread.sleep(5000);
	                Additional_Policy_Info additionalPolicyInfo = new Additional_Policy_Info(driver);
	                additionalPolicyInfo.clickOnNextBtn();
	                Thank_you_page thankYou = new Thank_you_page(driver);
	                thankYou.clickOnAgentAssistBtn();
	                Thread.sleep(5000);
	                Verify_info_page verifyInfo = new Verify_info_page(driver);
	                verifyInfo.clickOnNextBtn();
	                Thread.sleep(5000);
	                Life_style_questions lifeStyle = new Life_style_questions(driver);
	                lifeStyle.clickOnNextBtn();
	                Thread.sleep(5000);
	                lifeStyle.clickOnNextBtn();
	                Thread.sleep(5000);
	                lifeStyle.clickOnNextBtn();
	                Thread.sleep(5000);
	                Beneficiary_Info_page beneficiaryInfo = new Beneficiary_Info_page(driver);
	                beneficiaryInfo.clickOnNextBtn();
	                Thread.sleep(5000);
	                Health_Condition_page healthCondition = new Health_Condition_page(driver);
	                healthCondition.clickOnNextBtn();
	                Thread.sleep(5000);
	                healthCondition.clickOnNextBtn();
	                Thread.sleep(5000);
	                healthCondition.clickOnNextBtn();
	                Thread.sleep(5000);
	                Health_Info_page healthInfo = new Health_Info_page(driver);
	                healthInfo.clickOnNextBtn();
	                Thread.sleep(5000);
	                Family_History familyHistory = new Family_History(driver);
	                for(int i=0; i<4; i++) {
	                familyHistory.clickOnNextBtn();
	                Thread.sleep(5000);   
	                
	            }
	        }
		
	}
	
	
	}}

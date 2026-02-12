package AshBrokerage.test;

import java.util.Set;

import org.testng.annotations.Test;

import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.KnockOutPage;
import AshBrokerage.main.PI_Info_Page;
import AshBrokerage.main.ProposedInsuredInfo_Second;
import AshBrokerage.main.QuoterResultPage;

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
	            }
	        }
		
	}
	
	
	

}

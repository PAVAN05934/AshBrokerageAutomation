package AshBrokerage.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.Additional_Policy_Info;
import AshBrokerage.main.Agent_Information_Page;
import AshBrokerage.main.Beneficiary_Info_page;
import AshBrokerage.main.ExistingPolicyInfo;
import AshBrokerage.main.KnockOutPage;
import AshBrokerage.main.PI_Info_Page;
import AshBrokerage.main.PI_Info_page_2;
import AshBrokerage.main.PacificLifeSpecInfo_page;
import AshBrokerage.main.PacificLifeSpecific_Info2_page;
import AshBrokerage.main.ProposedInsuredInfo_Second;
import AshBrokerage.main.QuoterResultPage;

public class PacificLife_PromiseTerm_journey extends Base {

	@Test
	public void pacificLifePromiseTermJourneyFlow() throws InterruptedException {
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
		clientCreation.TermFlow_UptoQuoteResult_Page();
		QuoterResultPage quote = new QuoterResultPage(driver);
		Thread.sleep(10000);
		quote.applyBtn_PacificLifePromiseTermJourney();
		KnockOutPage knock = new KnockOutPage(driver);
		Thread.sleep(5000);
		knock.ConditionApply();
		String parentWindowID = driver.getWindowHandle();
		System.out.println("Parent window ID: " + parentWindowID);
		;
		knock.continueBtn();
		Thread.sleep(10000);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String childWindow : windowHandles) {
			if (!childWindow.equals(parentWindowID)) {
				driver.switchTo().window(childWindow);
				PI_Info_Page pi = new PI_Info_Page(driver);
				Thread.sleep(5000);
				pi.nextBtnPI();
				PI_Info_page_2 pi2 = new PI_Info_page_2(driver);
				pi.USArmedForcesYesRadioBtn();
				pi2.clickOnNextBtn();
				ExistingPolicyInfo existingPolicy = new ExistingPolicyInfo(driver);
				existingPolicy.pendingInsuranceRadioBtn();
				existingPolicy.declinedInsuranceRadioBtn();
				existingPolicy.InforceInsuranceRadioBtn();
				existingPolicy.clickOnNextBtn();
				Thread.sleep(3000);
				PacificLifeSpecInfo_page specInfo = new PacificLifeSpecInfo_page(driver);
				Thread.sleep(2000);
				specInfo.clickOnNextBtn();
				Additional_Policy_Info additionalPolicy = new Additional_Policy_Info(driver);
				additionalPolicy.clickOnNextBtn();
				PacificLifeSpecific_Info2_page specificInfo2 = new PacificLifeSpecific_Info2_page(driver);
				specificInfo2.clickOnNextBtn();
				Beneficiary_Info_page beneficiary = new Beneficiary_Info_page(driver);
				Thread.sleep(3000);
				beneficiary.clickOnNextBtn();
				Agent_Information_Page agentInfo = new Agent_Information_Page(driver);
				agentInfo.submitBtn();
				Thread.sleep(3000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
				    By.xpath("//*[contains(text(),'Help us improve')]")
				));
				WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(
					    By.xpath("//button[normalize-space()='Submit']")
					));

					submitBtn.click();
					
					

			}
		}

	}

}

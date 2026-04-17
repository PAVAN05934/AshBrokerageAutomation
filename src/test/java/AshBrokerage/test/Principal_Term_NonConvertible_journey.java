package AshBrokerage.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.Agent_Information_Page;
import AshBrokerage.main.Beneficiary_Info_page;
import AshBrokerage.main.KnockOutPage;
import AshBrokerage.main.PI_Info_Page;
import AshBrokerage.main.ProposedInsuredInfo_Second;
import AshBrokerage.main.QuoterResultPage;
import AshBrokerage.main.Submit_page;

public class Principal_Term_NonConvertible_journey extends Base {

	@Test
	public void principalTermNonConvertibleJourneyFlow() throws InterruptedException {
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
		clientCreation.TermFlow_UptoQuoteResult_Page();
		QuoterResultPage quote = new QuoterResultPage(driver);
		Thread.sleep(10000);
		quote.applyBtn_principalJourney();
		KnockOutPage knock = new KnockOutPage(driver);
		Thread.sleep(5000);
	//	knock.YescriteriaMet();
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
				ProposedInsuredInfo_Second PIISecond = new ProposedInsuredInfo_Second(driver);
				PIISecond.yes_ComboForLifeDesability();
				PIISecond.yes_examRequiredYesRadioBtn();
				PIISecond.yes_lifeInsuranceYesRadioBtn();
				PIISecond.nextBtn();
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
					Thread.sleep(20000);
					Submit_page submitPage = new Submit_page(driver);
					submitPage.verifTextOnSubmitPage();
	}
}
}
}

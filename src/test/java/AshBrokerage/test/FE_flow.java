package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;

public class FE_flow extends Base {

	@Test
	public void runQuoteApplyFlow() throws Exception {
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
		clientCreation.FEFlowUptoQuoteResult();


	
	}
}

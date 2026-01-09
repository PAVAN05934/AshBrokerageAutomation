package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.commonfile.ClintCreationUptoQuoteResultPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.OtherProductPage;

public class OtherProductFlow extends Base {
	
	@Test
	public void verifyOtherProductForm() throws InterruptedException {
		 
	
		OtherProductPage otherProductPage = new OtherProductPage(driver);
		ClintCreationUptoQuoteResultPage clientCreation = new ClintCreationUptoQuoteResultPage(driver);
		clientCreation.creatClient();
	    Thread.sleep(5000);
	    otherProductPage.clickOtherProducts();
	    otherProductPage.completeOtherProductPage(
	            "Disability",         // Product Type
	            "Alabama",             // Solicitation State
	           // "Preferred Plus",         // Health Class
	            "ABC Insurance",          // Carrier Name
	            "Super Term 20",          // Product Name
	            "2500",                   // Premium
	            "Monthly",                // Premium Mode
	            "5000"                    // Monthly Benefit
	    );

	    
	    Thread.sleep(3000); 
	}

}

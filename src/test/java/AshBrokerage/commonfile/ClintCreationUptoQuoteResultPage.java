package AshBrokerage.commonfile;

import org.openqa.selenium.WebDriver;

import AshBrokerage.main.ClientPage;
import AshBrokerage.main.ClientsPage;
import AshBrokerage.main.Dashboard;
import AshBrokerage.main.ProductTypePage;

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
		
		Thread.sleep(5000);
		clientpa.quoteApplyBtn();
		
		ProductTypePage product = new ProductTypePage(driver);
		Thread.sleep(5000);
		product.termBtn();
	}
	

}

package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class UsersPage {
 
    WebDriver driver;
 
    public UsersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 
    // WebElements
    @FindBy(xpath = "//a[@href='/users']")
    private WebElement usersTab;
 
    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchField;
    
    public void completeUsersPage() {
        try {
            // Navigate to Users tab
            usersTab.click();
 
            // Perform a search action
            searchField.sendKeys("Susan Saam");
            Thread.sleep(2000);
            // Clear the existing value in the search field
            searchField.clear();
 
         // Perform a search action
            searchField.sendKeys("Eric Carlson");
            
        } catch (Exception e) {
            System.out.println("Error completing UsersPage: " + e.getMessage());
        }
    }
 
    
}
 
   /* @FindBy(xpath = "//button[contains(text(),'Create New')]")
     private WebElement createNewButton;
    
    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userName;
 
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;
 
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNumber;
 
    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveButton;
 
    // Methods
    public void enterUserName(String name) {
        userName.sendKeys(name);
    }
 
    public void enterEmail(String userEmail) {
        email.sendKeys(userEmail);
    }
 
    public void enterPhoneNumber(String phone) {
        phoneNumber.sendKeys(phone);
    }
 
    public void completeUsersPage() {
        try {
            // Navigate to Users tab
            usersTab.click();
 
            // Click "Create New" button
            createNewButton.click();
 
            // Fill in the input fields with dummy values
            userName.sendKeys("Dummy User");
            email.sendKeys("dummy.user@example.com");
            phoneNumber.sendKeys("1234567890");
 
            // Click the "Save" button
            saveButton.click();
 
        } catch (Exception e) {
            System.out.println("Error completing UsersPage: " + e.getMessage());
        }
    }
} */

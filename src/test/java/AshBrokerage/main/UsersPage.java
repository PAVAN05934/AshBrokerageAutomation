package AshBrokerage.main;

import org.openqa.selenium.By;
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
            
            // Clear the existing value in the search field
            searchField.clear();

         // Perform a search action
            searchField.sendKeys("Eric Carlson");
            
        // Click the "Create New" button
        WebElement createNewButton = driver.findElement(By.xpath("//button[contains(@class, 'btn-next') and text()='Create New']"));
        createNewButton.click();

        // Fill in the input fields
        WebElement firstNameField = driver.findElement(By.name("firstName"));
        firstNameField.sendKeys("John");

        WebElement lastNameField = driver.findElement(By.name("lastName"));
        lastNameField.sendKeys("Doe");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("Payal.doe@example.com");

        WebElement phoneField = driver.findElement(By.name("phone"));
        phoneField.sendKeys("7234567890");

        WebElement dobField = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
        dobField.sendKeys("01/01/1990");

        WebElement ssnField = driver.findElement(By.name("ssn"));
        ssnField.sendKeys("723-45-6789");

        WebElement npnField = driver.findElement(By.name("npn"));
        npnField.sendKeys("9876543210");

        WebElement addressField = driver.findElement(By.name("address"));
        addressField.sendKeys("123 Main St");

        WebElement cityField = driver.findElement(By.name("city"));
        cityField.sendKeys("Springfield");

        WebElement stateField = driver.findElement(By.xpath("//input[@placeholder='State']"));
        stateField.sendKeys("IL");

        WebElement zipField = driver.findElement(By.name("zip"));
        zipField.sendKeys("62704");

        // Click the "Save" button
        WebElement saveButton = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and text()='Save']"));
        saveButton.click();
        
        Thread.sleep(5000);
        
        // Locate and click the "View" button
        WebElement viewButton = driver.findElement(By.xpath("//button[contains(@class, 'action-btn') and .//span[text()='View']]"));
        viewButton.click();

        // Locate and click the "Edit" button
        WebElement editButton = driver.findElement(By.xpath("//button[contains(@class, 'btn-next') and text()='Edit']"));
        editButton.click();

        // Enable and fill in the input fields
        WebElement firstNameField1 = driver.findElement(By.name("firstName"));
        firstNameField1.clear();
        firstNameField1.sendKeys("Bijal");

        WebElement lastNameField1 = driver.findElement(By.name("lastName"));
        lastNameField1.clear();
        lastNameField1.sendKeys("Patel");

        WebElement emailField1 = driver.findElement(By.name("email"));
        emailField1.clear();
        emailField1.sendKeys("Bijalnew.doe@example.com");

        WebElement phoneField1 = driver.findElement(By.name("phone"));
        phoneField1.clear();
        phoneField1.sendKeys("565-456-7890");

        WebElement dobField1 = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
        dobField1.clear();
        dobField1.sendKeys("01/01/1995");

        WebElement ssnField1 = driver.findElement(By.name("ssn"));
        ssnField1.clear();
        ssnField1.sendKeys("989-45-6789");

        WebElement npnField1 = driver.findElement(By.name("npn"));
        npnField1.clear();
        npnField1.sendKeys("9876543210");

        WebElement addressField1 = driver.findElement(By.name("address"));
        addressField1.clear();
        addressField1.sendKeys("123 Main St");

        WebElement cityField1 = driver.findElement(By.name("city"));
        cityField1.clear();
        cityField1.sendKeys("Springfield");

        WebElement stateField1 = driver.findElement(By.xpath("//div[@class='selection' and text()='Idaho']"));
        stateField1.click(); // Assuming a dropdown interaction is required

        WebElement zipField1 = driver.findElement(By.name("zip"));
        zipField1.clear();
        zipField1.sendKeys("62704");

        // Save the changes
        WebElement saveButton1 = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and text()='Save']"));
        saveButton1.click();
        
        Thread.sleep(5000);
        
    } catch (Exception e) {
        System.out.println("Error completing UsersPage: " + e.getMessage());
    }
}

}

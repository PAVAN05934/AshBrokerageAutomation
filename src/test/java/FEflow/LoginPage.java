package FEflow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    private By usernameField = By.xpath("//input[@type='text']");
    private By emailField = By.id("username");
    private By passwordField = By.id("password");
    private By loginBtn = By.xpath("/html/body/div/main/section/div/div/div/form/div[2]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

   	}

    public void enterTenant() {
        driver.findElement(usernameField).sendKeys("acme\n");
    }

    public void setUsername(String username) {
        driver.findElement(emailField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}


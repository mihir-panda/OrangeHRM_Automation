package page_object_model;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.AutoConstant;
import utils.ExcelUtils;

public class LoginPage extends ExcelUtils implements AutoConstant {
	
	private WebDriver driver;
	private WebDriverWait wait;

    // Locators
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");

 // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set 10 sec wait
        PageFactory.initElements(driver, this);
    }

    public void enterUsername() throws IOException {
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        username.sendKeys(excel(sheetname, 1, 0));
    }

    public void enterPassword() throws IOException {
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        password.sendKeys(excel(sheetname, 1, 1));
    }

    public void clickLogin() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }
}

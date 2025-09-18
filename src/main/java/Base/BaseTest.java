package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import page_object_model.LoginPage;

public class BaseTest {
	
	public WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
     // ✅ Perform Login before every test automatically
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();
    }

    /*@AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }*/

}

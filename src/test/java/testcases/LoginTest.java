package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import page_object_model.LoginPage;

public class LoginTest extends BaseTest {

	    @Test
	    public void loginWithExcelData() throws IOException {
	  
	        // Perform Login
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUsername();
	        loginPage.enterPassword();
	        loginPage.clickLogin();
	        
	        // Capture and print the title
	        String actualTitle = driver.getTitle();
	        System.out.println("Page title after login: " + actualTitle);
	        // Expected title (change it based on what your app shows)
	        String expectedTitle = "OrangeHRM";
	        // Assertion to verify title
	        Assert.assertEquals(actualTitle, expectedTitle, "Login failed or unexpected page title.");
	        
	      //Changes for test 2
	    }
}



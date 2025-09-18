package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import page_object_model.PIMpage;



public class PIMTest extends BaseTest {
	
	@Test
    public void verifyPIMButtonClick() throws IOException {	
	PIMpage PIM = new PIMpage(driver);
	PIM.ClickPIMButton();
	PIM.ClickAddEmployee();
	//PIM.Clickupload();
	// ✅ Directly upload file
	String filePath = "E:\\1.jpg";
    PIM.uploadProfilePicture(filePath);
    PIM.EnterFirstName();
    PIM.EnterMiddleName();
    PIM.EnterLastName();
    PIM.ClickSubmit();
	String expectedUrlFragment = "/pim";
    String actualUrl = driver.getCurrentUrl();
    Assert.assertTrue(actualUrl.contains(expectedUrlFragment), "PIM page did not load correctly.");
    System.out.println("Successfully navigated to PIM page: " + actualUrl);
  }
}


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

public class PIMpage extends ExcelUtils implements AutoConstant {
	
	    private WebDriver driver;
		private WebDriverWait wait;

	    // Locators
		private By PIMButton = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
		private By AddEmployee = By.xpath("//a[text()='Add Employee']");
		//private By upload = By.xpath("//i[@class='oxd-icon bi-plus']");
		private By fileUploadInput = By.xpath("//input[@type='file']");
		private By FirstName = By.xpath("//input[@name='firstName']");
		private By MiddleName = By.xpath("//input[@name='middleName']");
		private By LastName = By.xpath("//input[@name='lastName']");
		private By Submit = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
		
		public PIMpage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set 10 sec wait
	        PageFactory.initElements(driver, this);
	    }
		
		public void ClickPIMButton() throws IOException {
	        WebElement PIM = wait.until(ExpectedConditions.visibilityOfElementLocated(PIMButton));
	        PIM.click();
	    }
		
		public void ClickAddEmployee() throws IOException {
	        WebElement PIM = wait.until(ExpectedConditions.visibilityOfElementLocated(AddEmployee));
	        PIM.click();
	    }
		
		/*public void Clickupload() throws IOException {
	        WebElement PIM = wait.until(ExpectedConditions.visibilityOfElementLocated(upload));
	        PIM.click();
	    }*/
		
		// ✅ Direct file upload without opening OS dialog
		public void uploadProfilePicture(String filePath) throws IOException {
	        WebElement uploadElement = wait.until(ExpectedConditions.presenceOfElementLocated(fileUploadInput));
	        uploadElement.sendKeys(filePath); // Send absolute path of file
	    }
		
		public void EnterFirstName() throws IOException {
	        WebElement PIM = wait.until(ExpectedConditions.visibilityOfElementLocated(FirstName));
	        PIM.sendKeys(excel(sheetname1, 1, 0));
	    }
		
		public void EnterMiddleName() throws IOException {
	        WebElement PIM = wait.until(ExpectedConditions.visibilityOfElementLocated(MiddleName));
	        PIM.sendKeys(excel(sheetname1, 1, 1));
	    }
		
		public void EnterLastName() throws IOException {
	        WebElement PIM = wait.until(ExpectedConditions.visibilityOfElementLocated(LastName));
	        PIM.sendKeys(excel(sheetname1, 1, 2));
	    }
		
		public void ClickSubmit() throws IOException {
	        WebElement PIM = wait.until(ExpectedConditions.visibilityOfElementLocated(Submit));
	        PIM.click();
	    }
}


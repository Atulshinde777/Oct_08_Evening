package UtestAccoountCreation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FourthAboutYourDevices {

	@FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[4]")
	WebElement SelectMobileBrand;

	@FindBy(xpath = "//div[text()='Lenovo']")
	WebElement SelectBrand;

	@FindBy(xpath = "(//span[@class='btn btn-default form-control ui-select-toggle'])[5]")
	WebElement SelectMobileModel;

	@FindBy(xpath = "//div[text()='ThinkPad']")
	WebElement EnterModelText;

	@FindBy(xpath = "(//span[@style='outline: 0;'])[6]")
	WebElement OperatingSystem;

	@FindBy(xpath = "//div[text()='Android 4.1.1']")
	WebElement OSFire;

	@FindBy(xpath = "//span[text()='Next: Last Step']")
	WebElement NextLastStep;

	// Constructor
	private WebDriver driver;
	private WebDriverWait  webDriverwait;

	public FourthAboutYourDevices(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver = this.driver;
	}

	// Methods

	public void selectMobileBrand() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(2000);
		SelectMobileBrand.click();
	}
	
	public void selectBrand(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Lenovo']")));
		SelectBrand.click();
		//SelectBrand.click();
	}


	public void selectMobileModel() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		SelectMobileModel.click();
	}

	public void enterModelText() throws InterruptedException {
		Thread.sleep(1000);
		EnterModelText.click();
	}

	public void operatingSystem() throws InterruptedException {
		Thread.sleep(1000);
		OperatingSystem.click();
		Thread.sleep(2000);
	}

	public void oSFire() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		OSFire.click();
	}

	public void nextLastStep() {
		NextLastStep.click();
	}
	
}

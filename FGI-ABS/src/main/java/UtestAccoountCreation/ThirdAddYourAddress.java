package UtestAccoountCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdAddYourAddress {

	// variabales

	@FindBy(xpath = "//input[@id='city']")
	private WebElement CityPune;

	@FindBy(xpath = "//input [@id='zip']")
	private WebElement ZipCode;

	@FindBy(xpath = "(//span[@ng-show='$select.isEmpty()'])[2]")
	private WebElement Country;

	@FindBy(xpath = "//div[text()='India']")
	private WebElement India;

	@FindBy(xpath = "(//span[@aria-hidden='true'])[9]")
	private WebElement NextDevices;

	// Constructor

	private WebDriver driver;
	private Actions action;
	public ThirdAddYourAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver = this.driver;
		action = new Actions (this.driver);
		
	}

	// methods

	public void CheckAndSelectCity() throws InterruptedException {
		String CityText = CityPune.getText();
		if (CityText.equals("CityPune")) {
			System.out.println("City name successfully added ON UI");
		} else {
			System.out.println("City name not added ON UI");
			CityPune.sendKeys("Pune");
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
		}
	}

	public void ChceckAndSelectZipCode() {
		String Zip = ZipCode.getText();
		if (ZipCode.equals("411033")) {
			System.out.println("ZipCode successfully Entered ON UI");
		} else {
			System.out.println("ZipCode not Entered ON UI");
			ZipCode.sendKeys("411033");
		}
	}

	public void ClickOnCountry() throws InterruptedException {
		Thread.sleep(1000);
		
		Country.click();
	}

	public void ClickOnIndia() throws InterruptedException {
		Thread.sleep(1000);
		India.click();
		Thread.sleep(2000);
	}

	public void ClickOnNextDevices() throws InterruptedException{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
			WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement NextDevices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@aria-hidden='true'])[9]")));
		NextDevices.click();
//		action.moveToElement(NextDevices).click().build().perform();
	//	NextDevices.click();
	}

}
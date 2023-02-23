package AngelBrocking;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneStock {

	// find variables
	@FindBy(xpath = "//button[@id='wzrk-cancel']")
	private WebElement NoThanks;

	@FindBy(xpath = "//span[text()='Stocks']")
	private WebElement Stocks;

	@FindBy(xpath = "//a[@href='https://www.angelone.in/stocks/a-and-m-febcon-ltd']")
	private WebElement stockOne;

	@FindBy(xpath = "//div[@class='share-stocks cell small-2 large-1']")
	private WebElement share;

	@FindBy(xpath = "//span[@class='heateor_sss_svg']")
	private WebElement Whatsup;

	// Making Constructor
	private WebDriver driver;


	public OneStock(WebDriver driver) {

		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	// Methods

	public void ClickOnNoThanks() {
		NoThanks.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void ClickOnStocks() {
		Stocks.click();
	}

	public void ClickOnstockOne() {
		stockOne.click();
	}

	public void ClickOnshare() {
		share.click();
	}

	public void ViaWhatsup() {
		Whatsup.click();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		driver.getCurrentUrl();
		driver.switchTo().window(addr.get(1));
		driver.close();
		
		driver.switchTo().window(addr.get(0));
	}

}

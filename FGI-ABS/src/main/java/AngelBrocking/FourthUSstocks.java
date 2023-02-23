package AngelBrocking;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourthUSstocks {

	// variable

	@FindBy(xpath = "(//span[@class='usp-title'])[6]")
	private WebElement USStocks;

	@FindBy(xpath = "//a[@href='https://www.angelone.in/us-stocks/apple-inc']")
	private WebElement Apple;

	@FindBy(xpath = "//button[@id='five_year']")
	private WebElement Graphfive;

	@FindBy(xpath = "//td[@class='text-center']//img")
	private WebElement Delete;

	@FindBy(xpath = "//button[@class='clear button bold']")
	private WebElement Add;

	@FindBy(xpath = "//input[@type='select-one']")
	private WebElement TextBox;

	@FindBy(xpath = "(//span[@class='name'])[1]")
	private WebElement SelectApple;

	// constructor
	private WebDriver driver;

	public FourthUSstocks(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Methods
	public void ClickOnUSStocks() {
		driver.get("https://www.angelone.in/");

		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js12.executeScript("window.scrollBy(0,1000)");
		USStocks.click();
	}

	public void ClickOnApple() {
		Apple.click();
	}

	public void ClickOnGraphfive() {
		Graphfive.click();
	}

	public void ClickOnDelete() {
		Delete.click();
	}

	public void SelectAdd() {
		Add.click();
	}

	public void SelectTextBox() {
		TextBox.sendKeys("Apple");
	}

	public void ClickOnSelectApple() {
		SelectApple.click();
		driver.close();

	}

}

package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	// variable home page and select categeries of men's sweatshirt

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement Cancel;

	@FindBy(xpath = "(//div[@class='xtXmba'])[3]")
	private WebElement Fashion;

	@FindBy(xpath = "(//a[@class='_6WOcW9'])[10]")
	private WebElement Winter;

	@FindBy(xpath = "(//a[@class='_6WOcW9 _3YpNQe'])[3]")
	private WebElement shirts;

	// Constructor : intialization of Webelement : home page and select categeries
	// of men's sweatshirt
	private Actions action;
	private WebDriver driver;
	private WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(this.driver);
		wait= new WebDriverWait(driver,20);	
	}
	// methods: action on Webelement : home page and select categeries of men's
	// sweatshirt

	public void clickCancel() {

		Cancel.click();
	}

	public void clickFashion() {
		
		action.moveToElement(Fashion).perform();	
	}

	public void clickWinter() {
		wait.until(ExpectedConditions.visibilityOf(Winter));
		action.moveToElement(Winter).perform();
	}
	
	public void clickShirts() {
		wait.until(ExpectedConditions.visibilityOf(shirts));
		shirts.click();
	}

}

	
	



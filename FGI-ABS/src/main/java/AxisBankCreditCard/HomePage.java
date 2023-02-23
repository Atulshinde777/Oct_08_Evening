package AxisBankCreditCard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//  variabels identification
	@FindBy(xpath = "//div[@class='loginClk jsloginClk']")
	private WebElement login;

	@FindBy(xpath = "//div[@class='loginDrpDown jsLoginDrpDwn']//a[3]//h4")
	private WebElement cards;

	@FindBy(xpath = "(//a[@data-eventcategory='login'])[8]")
	private WebElement CreditCards;

	// MAke constructor
	
	private WebDriver driver;
	private Actions Action;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	// Methods to action on WebElement

	public void MouseHoverOnHomePage() {
		Actions act = new Actions(driver);
		act.moveToElement(login).perform();
	}

	public void ClickOnCards() {
		cards.click();
	}

	public void CreditCardsDisplayOrNot() {
		boolean a = CreditCards.isDisplayed();
		System.out.println(a);
		if (a == false) {
			System.out.println("Element is not Displayed");
			CreditCards.click();
		} else {
			System.out.println("Element is Displayed");
		}

	}

}
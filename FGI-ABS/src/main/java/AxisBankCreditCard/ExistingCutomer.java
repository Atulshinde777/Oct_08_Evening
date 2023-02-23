package AxisBankCreditCard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingCutomer {
	
	// finding variables or WebElement
	
	@FindBy(xpath = "//a[@title='Yes']")
	private WebElement ExistingCustomer;

	// Making Constructor

	public ExistingCutomer(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Creating Methods

	public void ClickOnExistingCustomer() {
		ExistingCustomer.click();

	}
}

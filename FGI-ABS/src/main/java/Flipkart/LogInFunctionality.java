package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInFunctionality {

	@FindBy(xpath = "//input[@maxlength='auto']")
	private WebElement MObileNumber;

	@FindBy(xpath = "//span[text()='CONTINUE']")
	private WebElement Continue;

	public LogInFunctionality(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void MObileNumber() {
		MObileNumber.sendKeys("8390084243");
	}

	public void Continue() {
		Continue.click();
	}

}

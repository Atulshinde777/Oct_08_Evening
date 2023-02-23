package UtestAccoountCreation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneBusinessHomePage {

	// variables.

	@FindBy(xpath = "(//a[text()='Become a uTester'])[2]")
	private WebElement BecomeaUTester;

	// Constructor

	private WebDriver driver;

	public OneBusinessHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	
	// method 
	
	public void ClickOnBecomeaUTester() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement BecomeaUTester = wait
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Become a uTester'])[2]")));
		BecomeaUTester.click();
	}
}
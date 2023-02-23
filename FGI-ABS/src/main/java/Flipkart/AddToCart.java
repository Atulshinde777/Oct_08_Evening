package Flipkart;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	// variable : AddToCart

	@FindBy(xpath = "//a[text()='L']")
	private WebElement SizeL;

 	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
 	private WebElement AddToCart;
	private WebDriver driver;
	// Constructor : intialization of Webelement : AddToCart

	public AddToCart(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// Method : intialization of Webelement : AddToCart

	public void SizeLclick() {

		ArrayList<String> Addr1 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(Addr1.get(1));

		System.out.print(driver.getCurrentUrl());
		SizeL.click();

	}

	public void AddToCart() {
		AddToCart.click();
	}

}

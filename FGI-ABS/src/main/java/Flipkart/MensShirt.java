package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensShirt {

	@FindBy(xpath = "(//div[@class='_24_Dny'])[5]")
	private WebElement Special;

	@FindBy(xpath = "(//img[@class='_2r_T1I'])[3]")
	private WebElement image3;

	public MensShirt(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickSpecial() {

		boolean r = Special.isSelected();
		System.out.println(r);
		if (r == false) {
			System.out.println("Special is not selected");
			Special.click();
		} else {
			System.out.println("Special is  selected");
		}
	}

	public void image3click() throws InterruptedException {
		Thread.sleep(2000);
		image3.click();
	}

}

package AngelBrocking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdIPO {

	// variable

	@FindBy(xpath = "(//span[@class='usp-title'])[2]")
	private WebElement IPO;

	@FindBy(xpath = "//p[text()='Northern Arc Capital Ltd IPO']")
	private WebElement NorthernIPO;

	@FindBy(xpath = "(//a[@href=\"https://www.youtube.com/watch?v=jKUR9hGdv7w\"])[2]")
	private WebElement Iframe;

	private WebDriver driver;

//Constructor

	public ThirdIPO(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Methods
	public void ClickOnIPO() {
		IPO.click();
	}

	public void ClickOnNorthernIPO() {

		NorthernIPO.click();	
		driver.get("https://www.angelone.in/");
	}

//	public void clickonYoutubeLink() {
//		
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0,2500)");
//		WebElement iframeWindow = driver.findElement(By.xpath("//iframe[@width='320']"));
//		driver.switchTo().frame(iframeWindow);
//		Iframe.click();
//	}

}

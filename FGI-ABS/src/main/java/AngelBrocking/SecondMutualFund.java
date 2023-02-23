package AngelBrocking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondMutualFund {
	
	// variable identifications
	
	@FindBy (xpath = "//span[text()='Mutual Funds']")
	WebElement MutualFunds;
	
	@FindBy (xpath = "//span[text()='Top Rated']")
	WebElement TopRated;
	
	@FindBy (xpath = "//div[text()='Quant Mid Cap Fund Growth Direct Plan']")
	WebElement QuantFund;
	
	@FindBy (xpath = "//div[@class='flex justify-center mt-6']//article//div[6]")
	WebElement FiveYear;
	
	@FindBy (xpath = "//button[text()='₹5,000']")
	WebElement FiveThousand;
	
	@FindBy (xpath = "//button[@class='bg-blue-primary w-full py-4 text-white text-sm font-semibold active:opacity-95 rounded h-12']")
	WebElement Invest;
	
	// Constructor
	private WebDriver driver;
	
	public SecondMutualFund(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	// methods
	
	public void ClickOnMutualFund() {
		driver.navigate().back();
		driver.navigate().back();
		MutualFunds.click();
	}
	
	public void ClickOnTopRated() {
		TopRated.click();
	}
	
	public void ClickOnQuantFund() {	
		QuantFund.click();
	}
	
	public void ClickOnFiveYear() {
		FiveYear.click();		
	}
	
	public void ClickOnFiveThousand() {	
		FiveThousand.click();	
	}
	
	public void ClickOnInvest() {
		Invest.click();	
		driver.get("https://www.angelone.in/");
	}
	
	
	
}

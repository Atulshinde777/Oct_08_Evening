package AxisBankCreditCard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FillInBlank {
		// WebElement or Variables Idnetification 
	@FindBy (xpath = "//input[@id='mobileinfo_Mob']")
	private WebElement MobileNumber;
	
	@FindBy(xpath = "//input[@id='mobileinfo_Pan']")
	private WebElement PanNumber;
	
	@FindBy (xpath = "//input[@id='mobileinfo_Dob']")
	private WebElement  DoB;
	
	@FindBy (xpath = "//select[@class='ui-datepicker-month']")
	private WebElement  Month;
	
	@FindBy (xpath = "//select[@class='ui-datepicker-year']")
	private WebElement  Year;
	
	@FindBy (xpath = "//a[text()='25']")
	private WebElement  Date;
	
	@FindBy (xpath = "//button[@id='mobileinfo_submit']")
	private WebElement  Next;
		
	// Making Constructor	
	public FillInBlank(WebDriver driver) {
		
		PageFactory.initElements(driver, this);				
	}	
	
	// Cretaing Methods	
	public void EntermobileNumber(String mobileNumber) {		
		MobileNumber.sendKeys("8390084243");	
	}
	
	public void EnterPanNumber(String panNumber) {
		PanNumber.sendKeys("GKNPS7156S");
	}
	
	public void EnterdoB() {		
		DoB.click();
	}
	
	public void Selectmonth() {	
		Select s = new Select(Month);				
			s.selectByVisibleText("Oct");
	}
	public void Selectyear() {
		Select s = new Select(Year);
		s.selectByValue("1995");
		}
	
	public void Selectdate() {
		Date.click();
	}
	
	public void ClickOnnext() {
		Next.click();
	}
	
	
	
}

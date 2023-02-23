package UtestAccoountCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SecondTellUsAboutYourself {
	
	// variables or Element Identifications
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement Fname;
	
	@FindBy(xpath = "//input[@id='lastName']" )
	WebElement Lname;
	
	@FindBy (xpath = "//input[@id='email']")
	WebElement EmailAddr;
	
	@FindBy(xpath = "//select[@aria-label='Birth month']")
	WebElement Month;
	
	@FindBy(xpath = "//select[@name='birthDay']")
	WebElement Day;
	
	@FindBy(xpath = "//select[@id='birthYear']")
	WebElement Year;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement Languages;
	
	@FindBy(xpath = "//span[@class='ui-select-highlight']")
	WebElement Hindi;
	
	@FindBy(xpath = "//span[text()='Next: Location']")
	WebElement NextLocation;
	
	//Constructor
	
	private WebDriver driver;
	
	public  SecondTellUsAboutYourself(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	// Methods
	
	public void SendKeyFname() {
		Fname.sendKeys("Atul");
	}
	
	public void SendKeyLname() {
		Lname.sendKeys("shinde");
	}
	
	public void SendKeyEmailAddr() {
		EmailAddr.sendKeys("atul.shinde555@yahoo.com");
	}
	public void SelectMonth() {
		Select M = new Select(Month);

		M.selectByVisibleText("May");
}
	public void SelectDay() {
		Select D = new Select(Day);
		D.selectByVisibleText("25");
	}
	public void SelectYear() {
		Select Y = new Select(Year);
		Y.selectByVisibleText("1995");
	}
	
	public void sendKeysLanguages() {
		Languages.sendKeys("Hindi");
	}
	
	public void ClickOnHindi() {
		Hindi.click();
	}
	
	public void ClickOnNextLocation() {
		NextLocation.click();			
	}
		
}

package UtestAccoountCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FifthTheLastStep {

	@ FindBy(xpath ="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	private WebElement CnfmPswd ;
	
	@FindBy(xpath="//span[@class=\\\"checkmark signup-consent__checkbox signup-consent__checkbox--highlight\\\"]")
	private WebElement Checkbox1st;
	
	@FindBy(xpath = "(//span[@class='checkmark signup-consent__checkbox error'])[1]")
	private WebElement Checkbox2nd;
	
	@FindBy(xpath="//span[@class='checkmark signup-consent__checkbox error']")
	private WebElement Checkbox3rd;
	
//	@FindBy(xpath="//span[text()='Complete Setup']']")
	private WebElement CompleteSetUp;
	//Constructor
	private WebDriver driver;
	
	public FifthTheLastStep(WebDriver driver) {
		driver = this.driver;
		
	}
	
	// Methods
	
	public void sendKeysPassword() {
		Password.sendKeys("ATUL$hinde777");
	}
	
	public void sendKeysCnfmPswd() {
		CnfmPswd.sendKeys("ATUL$hinde777");		
	}
	
	public void tickOnCheckbox1st() {
		Checkbox1st.click();
	}
	
	public void tickOnCheckbox2nd() {
		Checkbox2nd.click();	
	}
	
	public void tickOnCheckbox3rd() {
		
		Checkbox3rd.click();

		String Currenturl =driver.getCurrentUrl();
		
		String Expectedturl = "https://www.utest.com/signup/complete";

		if (Expectedturl != Currenturl)	{
			System.out.print("Test case is pass");			
		}
		else {
			System.out.print("Test case is Fail ");	
		}
	}
	
	//public void clickOnCompleteSetUp() {
	//CompleteSetUp.click();	
	//}	
}

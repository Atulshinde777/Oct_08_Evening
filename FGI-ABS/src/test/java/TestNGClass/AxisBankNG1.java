package TestNGClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AxisBankCreditCard.ExistingCutomer;
import AxisBankCreditCard.FillInBlank;
import AxisBankCreditCard.HomePage;
import BrowserSetup.Browsers;

public class AxisBankNG1 {

	WebDriver driver;
	WebDriver homePage;

	@Parameters("browser")

	@BeforeTest
	public void beforeTest(String browserName) {

		System.out.print(browserName);
		if (browserName.equals("Chrome")) {
			driver = Browsers.openChromeBrowser();
		}
		if (browserName.equals("Firefox")) {
			driver = Browsers.openFirefoxBrowser();
		}

		if (browserName.equals("Edge")) {
			driver = Browsers.openEdgeBroser();
		}
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("Before Method1");
		driver.get("https://www.axisbank.com/bank-smart/e-statements/for-nri-banking#menuTab");
	}

	@Test
	public void test1() {

		System.out.println("Test1");
		HomePage homePage = new HomePage(driver);

		homePage.MouseHoverOnHomePage();
		homePage.ClickOnCards();
		homePage.CreditCardsDisplayOrNot();

		ExistingCutomer existingCutomer = new ExistingCutomer(driver);
		existingCutomer.ClickOnExistingCustomer();

		FillInBlank fillInBlank = new FillInBlank(driver);
		fillInBlank.EntermobileNumber("8390084243");
		fillInBlank.EnterPanNumber("GKNPS7156S");
		fillInBlank.EnterdoB();
		fillInBlank.Selectmonth();
		fillInBlank.Selectyear();
		fillInBlank.Selectdate();
		fillInBlank.ClickOnnext();
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driver.close();
	}

}

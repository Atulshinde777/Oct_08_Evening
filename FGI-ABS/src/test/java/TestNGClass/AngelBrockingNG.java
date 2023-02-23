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

import AngelBrocking.FourthUSstocks;
import AngelBrocking.OneStock;
import AngelBrocking.SecondMutualFund;
import AngelBrocking.ThirdIPO;
import BrowserSetup.Browsers;

public class AngelBrockingNG {
	
	WebDriver driver;
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

		WebDriver oneStock;

		@BeforeClass
		public void beforeClass() {
			System.out.println("Before Class");
			driver.get("https://www.angelone.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}

		@BeforeMethod
		public void beforeMethod1() {
			System.out.println("Before Method1");
			driver.get("https://www.angelone.in/");
		}

		@Test(priority = 0)
		public void VerifyStock() {

			System.out.println("Test1");

			OneStock oneStock = new OneStock(driver);
			oneStock.ClickOnNoThanks();
			oneStock.ClickOnStocks();
			oneStock.ClickOnstockOne();
			oneStock.ClickOnshare();
			oneStock.ViaWhatsup();
		}

		@Test(priority = 1)
		public void VerifyMutualFund() {

			System.out.println("Test2");

			SecondMutualFund SecondMutualFund = new SecondMutualFund(driver);

			SecondMutualFund.ClickOnMutualFund();
			SecondMutualFund.ClickOnTopRated();
			SecondMutualFund.ClickOnQuantFund();
			SecondMutualFund.ClickOnFiveYear();
			SecondMutualFund.ClickOnFiveThousand();
			SecondMutualFund.ClickOnInvest();
		}

		@Test(priority = 2)
		public void VerifyIPO() {

			System.out.println("Test3");

			ThirdIPO thirdIPO = new ThirdIPO(driver);

			thirdIPO.ClickOnIPO();
			thirdIPO.ClickOnNorthernIPO();

		}

		@Test(priority = 3)
		public void VerifyUsStock() {

			System.out.println("Test4");

			FourthUSstocks fourthUSstocks = new FourthUSstocks(driver);

			fourthUSstocks.ClickOnUSStocks();
			fourthUSstocks.ClickOnApple();
			fourthUSstocks.ClickOnGraphfive();
			fourthUSstocks.ClickOnDelete();
			fourthUSstocks.SelectAdd();
			fourthUSstocks.SelectTextBox();
			fourthUSstocks.ClickOnSelectApple();
		}

		@AfterMethod
		public void afterMethod1() {

			System.out.println("After Method 1 ");
			// driver.close();
		}

		@AfterClass
		public void afterClass() {
			System.out.println("After Class");
			// driver.quit();
		}
	}


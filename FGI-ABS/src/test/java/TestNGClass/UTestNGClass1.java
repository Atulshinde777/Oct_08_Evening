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
import org.testng.asserts.SoftAssert;

import BrowserSetup.Browsers;
import UtestAccoountCreation.FifthTheLastStep;
import UtestAccoountCreation.FourthAboutYourDevices;
import UtestAccoountCreation.OneBusinessHomePage;
import UtestAccoountCreation.SecondTellUsAboutYourself;
import UtestAccoountCreation.ThirdAddYourAddress;

public class UTestNGClass1 {
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

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.utest.com");
	}

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("Before Method1");

	}

	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test1");
		OneBusinessHomePage oneBusinessHomePage = new OneBusinessHomePage(driver);
		oneBusinessHomePage.ClickOnBecomeaUTester();
	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2");
		SecondTellUsAboutYourself secondTellUsAboutYourself = new SecondTellUsAboutYourself(driver);
		secondTellUsAboutYourself.SendKeyFname();
		secondTellUsAboutYourself.SendKeyLname();
		secondTellUsAboutYourself.SendKeyEmailAddr();
		secondTellUsAboutYourself.SelectMonth();
		secondTellUsAboutYourself.SelectDay();
		secondTellUsAboutYourself.SelectYear();
		secondTellUsAboutYourself.sendKeysLanguages();
		secondTellUsAboutYourself.ClickOnHindi();
		secondTellUsAboutYourself.ClickOnNextLocation();
	}

	@Test
	public void test3() throws InterruptedException {
		System.out.println("Test3");
		ThirdAddYourAddress thirdAddYourAddress = new ThirdAddYourAddress(driver);
		thirdAddYourAddress.CheckAndSelectCity();
		thirdAddYourAddress.ChceckAndSelectZipCode();
		thirdAddYourAddress.ClickOnCountry();
		thirdAddYourAddress.ClickOnIndia();
		thirdAddYourAddress.ClickOnNextDevices();

	}

	@Test
	public void test4() throws InterruptedException {
		System.out.println("Test4");
		FourthAboutYourDevices fourthAboutYourDevices = new FourthAboutYourDevices(driver);
		fourthAboutYourDevices.selectMobileBrand();
		fourthAboutYourDevices.selectBrand();
		fourthAboutYourDevices.selectMobileModel();
		fourthAboutYourDevices.enterModelText();
		fourthAboutYourDevices.operatingSystem();
		fourthAboutYourDevices.oSFire();
		fourthAboutYourDevices.nextLastStep();
	}

	@Test
	public void test5() throws InterruptedException {
		System.out.println("Test5");
		FifthTheLastStep fifthTheLastStep = new FifthTheLastStep(driver);
		fifthTheLastStep.sendKeysPassword();
		fifthTheLastStep.sendKeysCnfmPswd();
		fifthTheLastStep.tickOnCheckbox1st();
		fifthTheLastStep.tickOnCheckbox2nd();
		fifthTheLastStep.tickOnCheckbox3rd();
	}

	@AfterMethod
	public void afterMethod1() {

		System.out.println("After Method 1 ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class 1");

	}

}

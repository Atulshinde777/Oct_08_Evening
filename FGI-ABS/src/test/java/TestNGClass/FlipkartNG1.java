package TestNGClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BrowserSetup.Browsers;
import Flipkart.AddToCart;
import Flipkart.HomePage;
import Flipkart.LogInFunctionality;
import Flipkart.MensShirt;
import Flipkart.placOrdr;

public class FlipkartNG1 {

	WebDriver driver;
	WebDriver homepage;

	@Parameters("browser")

	@BeforeTest
	public void launchBrowser(String browserName) {

		System.out.println(browserName);
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
	public void LaunchTheBrowser() {
		System.out.println("Before Class");
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void CheckHomePage() {
		System.out.println("Before Method");
		driver.get("https://www.flipkart.com/");
	}

	@Test
	public void test() throws InterruptedException {

		System.out.println("Test ok");
		HomePage homepage = new HomePage(driver);
		homepage.clickCancel();
		homepage.clickFashion();
		homepage.clickWinter();
		homepage.clickShirts();

		MensShirt mensShirt = new MensShirt(driver);
		mensShirt.clickSpecial();
		mensShirt.image3click();

		AddToCart addToCart = new AddToCart(driver);
		addToCart.SizeLclick();
		addToCart.AddToCart();

		placOrdr PlacOrdr = new placOrdr(driver);
		PlacOrdr.booking();

		LogInFunctionality logInFunctionality = new LogInFunctionality(driver);
		logInFunctionality.MObileNumber();
		logInFunctionality.Continue();
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

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}

//java.lang.IndexOutOfBoundsException: Arraylist problem.
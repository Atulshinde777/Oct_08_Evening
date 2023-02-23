package UtestAccoountCreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AddYourAddrThird {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\APK\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		ThirdAddYourAddress thirdAddYourAddress = new ThirdAddYourAddress(driver);
		
		thirdAddYourAddress.CheckAndSelectCity();
		thirdAddYourAddress.ChceckAndSelectZipCode();
		thirdAddYourAddress.ClickOnCountry();
		thirdAddYourAddress.ClickOnIndia();
		thirdAddYourAddress.ClickOnNextDevices();
		String Actualurl = "https://www.utest.com/signup/address";
		String Expectedurl = "https://www.utest.com/signup/address";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Actualurl, Expectedurl,"URL is not Found");
		soft.assertAll();
	}
}
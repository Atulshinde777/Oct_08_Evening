package UtestAccoountCreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutYourDeviceFourth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

		FourthAboutYourDevices fourthAboutYourDevices = new FourthAboutYourDevices(driver);
		fourthAboutYourDevices.selectMobileBrand();
		fourthAboutYourDevices.selectBrand();
		fourthAboutYourDevices.selectMobileModel();
		fourthAboutYourDevices.enterModelText();
		fourthAboutYourDevices.operatingSystem();
		fourthAboutYourDevices.oSFire();
		fourthAboutYourDevices.nextLastStep();
	}
}
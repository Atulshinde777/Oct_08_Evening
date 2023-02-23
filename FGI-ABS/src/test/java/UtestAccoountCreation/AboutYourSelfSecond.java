package UtestAccoountCreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutYourSelfSecond {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

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
}
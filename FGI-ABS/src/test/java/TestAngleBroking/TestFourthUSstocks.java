package TestAngleBroking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AngelBrocking.FourthUSstocks;

public class TestFourthUSstocks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.angelone.in/");

		FourthUSstocks fourthUSstocks = new FourthUSstocks(driver);

		fourthUSstocks.ClickOnApple();
		fourthUSstocks.ClickOnGraphfive();
		fourthUSstocks.ClickOnDelete();
		fourthUSstocks.SelectAdd();
		fourthUSstocks.SelectTextBox();
		fourthUSstocks.ClickOnSelectApple();
	}
}

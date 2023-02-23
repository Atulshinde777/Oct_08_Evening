package TestAngleBroking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AngelBrocking.OneStock;

public class TestOneStock {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.angelone.in/");

		OneStock oneStock = new OneStock(driver);
		oneStock.ClickOnNoThanks();
		oneStock.ClickOnStocks();
		oneStock.ClickOnstockOne();
		oneStock.ClickOnshare();

	}

}

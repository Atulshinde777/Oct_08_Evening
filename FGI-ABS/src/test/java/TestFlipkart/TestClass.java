package TestFlipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Flipkart.HomePage;
import Flipkart.MensShirt;

public class TestClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		HomePage homepage = new HomePage(driver);
		
		homepage.clickCancel();
		homepage.clickFashion();
		homepage.clickWinter();
		homepage.clickShirts();
	}
	
}

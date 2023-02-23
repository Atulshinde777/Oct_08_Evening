package TestFlipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Flipkart.AddToCart;

public class TestClass3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		AddToCart addToCart = new AddToCart(driver);

		addToCart.SizeLclick();

		addToCart.AddToCart();

	}
}

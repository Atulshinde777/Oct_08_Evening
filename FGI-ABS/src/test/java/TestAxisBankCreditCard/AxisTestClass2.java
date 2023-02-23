package TestAxisBankCreditCard;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AxisBankCreditCard.ExistingCutomer;

public class AxisTestClass2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.axisbank.com/bank-smart/e-statements/for-nri-banking#menuTab");

		ExistingCutomer existingCutomer = new ExistingCutomer(driver);

		existingCutomer.ClickOnExistingCustomer();

	}
}
package TestAxisBankCreditCard;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AxisBankCreditCard.FillInBlank;

public class AxisTestClass3 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.axisbank.com/bank-smart/e-statements/for-nri-banking#menuTab");

		FillInBlank fillInBlank = new FillInBlank(driver);

		fillInBlank.EntermobileNumber("8390084243");

		fillInBlank.EnterPanNumber("GKNPS7156S");

		fillInBlank.EnterdoB();

		fillInBlank.Selectmonth();

		fillInBlank.Selectyear();

		fillInBlank.Selectdate();

		fillInBlank.ClickOnnext();

	}
}
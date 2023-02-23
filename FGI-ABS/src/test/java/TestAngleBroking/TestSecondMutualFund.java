package TestAngleBroking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AngelBrocking.SecondMutualFund;

public class TestSecondMutualFund {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.angelone.in/");

		SecondMutualFund SecondMutualFund = new SecondMutualFund(driver);
	
		SecondMutualFund.ClickOnMutualFund();
		SecondMutualFund.ClickOnQuantFund();
		SecondMutualFund.ClickOnFiveYear();
		SecondMutualFund.ClickOnFiveThousand();
		SecondMutualFund.ClickOnInvest();

}
}
package UtestAccoountCreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheLastStepFifth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		FifthTheLastStep fifthTheLastStep = new FifthTheLastStep(driver);

		fifthTheLastStep.sendKeysPassword();
		fifthTheLastStep.sendKeysCnfmPswd();
		fifthTheLastStep.tickOnCheckbox1st();
		fifthTheLastStep.tickOnCheckbox2nd();
		fifthTheLastStep.tickOnCheckbox3rd();
		// fifthTheLastStep.clickOnCompleteSetUp();

	}
}
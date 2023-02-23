package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\APK\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;	
	}

	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\APK\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openEdgeBroser() {
	 	System.setProperty("webdriver.edge.driver","C:\\APK\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;	
	}
}

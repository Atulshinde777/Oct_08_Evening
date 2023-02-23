package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ChatGPTTrial {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\APK\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.manage().window().maximize();
	
	 driver.get("https://www.example.com/products");

     // Locate the product you want to add to cart
     WebElement product = driver.findElement(By.xpath("//div[@class='product-name'][text()='Example Product']"));

     // Click on the product
     product.click();

     // Locate the "Add to Cart" button
     WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to Cart']"));

     // Click on the "Add to Cart" button
     addToCartButton.click();

     // Verify that the product was added to the cart
     WebElement cartIcon = driver.findElement(By.xpath("//a[@class='cart-icon']"));
     String cartText = cartIcon.getText();
     if (cartText.equals("1")) {
         System.out.println("Product successfully added to cart");
     } else {
         System.out.println("Failed to add product to cart");
     }
}}


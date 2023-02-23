package TestNGClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TrialNG {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");

	}

	@BeforeMethod
	public void beforeMethod1() {

		System.out.println("Before Method1");

	}

	@Test(priority = 57)
	public void test1() {

		String actualURL = "https://www.instagram.com/";

		String ExpectedURL = "https://www.instagram.com/";

		boolean result = actualURL.equals(ExpectedURL);

		if (result == true) {

			System.out.println("HOMEPAGE URL IS NOT FOUND");
		} else {
			System.out.println("HOMEPAGE URL IS FOUND");

		}

		System.out.println("Test1");
	}

	@Test(priority = 5)
	public void test2() throws InterruptedException {
		Thread.sleep(2980);
		System.out.println("Test2");

	}

	@Test(priority = 0)
	public void test3() {
		SoftAssert soft = new SoftAssert ();
		
		String actualURL = "https://www.instagram.com/";

		String ExpectedURL = "https://www.instagram.com";

		soft.assertNotEquals(actualURL, ExpectedURL, "URL is differt");

		System.out.println("Test3");
	soft.assertAll();
	}

	@Test(priority = 4)
	public void test4() {
		
		SoftAssert soft = new SoftAssert ();
		
		String actualURL = "https://www.instagram.com/";

		String ExpectedURL = "https://www.instagram.com";

		boolean result = actualURL.equals(ExpectedURL);

		soft.assertFalse(result, "HOMEPAGE URL IS NOT FOUND");

		System.out.println("Test4");
		soft.assertAll();

	}

	@Test(priority = 11)
	public void test5() {

		String actualURL = "https://www.instagram.com/";

		String ExpectedURL = "https://www.instagram.com/";

		Assert.assertEquals(actualURL, ExpectedURL);

		System.out.println("Test5");
		// Assert.fail();
	}

	@AfterMethod
	public void afterMethod1() {
		SoftAssert soft = new SoftAssert ();
		System.out.println("After Method 1 ");
		soft.assertAll();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}

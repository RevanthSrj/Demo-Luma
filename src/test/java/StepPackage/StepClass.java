package StepPackage;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.interactions.Actions;

import BasePackage.BaseClass;
import PomPackage.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {
	PomClass pom = new PomClass();
	public static WebDriver option;

	@Given("User Open the Browser and enter the URL")
	public void user_open_the_browser_and_enter_the_url() {

		getURL("https://magento.softwaretestingboard.com/");

	}

	@When("USer Click the Sign-in botton and Login the account")
	public void u_ser_click_the_sign_in_botton_and_login_the_account() {

		implicityWait();
		driver.findElement(pom.clickSignIn).click();

		driver.findElement(pom.enterEmail).sendKeys("srjrevanth850@gmail.com");

		driver.findElement(pom.enterPAssword).sendKeys("14071999@srj");

		driver.findElement(pom.clickSigInBtn).click();

	}

	@When("User click the push it messenger Bag")
	public void user_click_the_push_it_messenger_bag() {

		implicityWait();
		WebElement scrlDn = driver.findElement(pom.clickBag);
		jsScroll(scrlDn);

		Actions action = new Actions(driver);
		action.moveToElement(scrlDn).perform();

		driver.findElement(pom.AddToComp).click();

	}

	@When("User click the add to compare bottun")
	public void user_click_the_add_to_compare_bottun() {

		implicityWait();

		driver.findElement(pom.clickList).click();

//		driver.findElement(pom.clickPrintbtn).click();

//		option = new ChromeDriver((ChromeDriverService) driver);

		// Initialize DevTools
//		DevTools devTools = ((ChromeDriver) driver).getDevTools();
//		devTools.createSession();

		// Navigate to chrome://print/
//		option.get("chrome://print/");
//		option.quit();
//		Set<String> windowHandle = driver.getWindowHandles();
//		List<String> window = new ArrayList<String>(windowHandle);
//		System.out.println(window);
//		driver.switchTo().window(window.get(1));
//		driver.findElement(pom.)
		
		 // Create Chrome options
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//        options.setExperimentalOption("useAutomationExtension", false);

        // Initialize ChromeDriver
//        WebDriver driver = new ChromeDriver(options);

        // Initialize DevTools
//        DevTools devTools = ((ChromeDriver) driver).getDevTools();
//        devTools.createSession();

        // Perform actions before navigating to chrome://print/
//        driver.findElement(pom.clickPrintbtn).click();

        // Switch to the print dialog
//        driver.switchTo().alert().accept();
//         or use dismiss() to cancel the print dialog

        // Navigate to chrome://print/ in a separate window
//        WebDriver printDialog = new ChromeDriver((ChromeDriverService) driver);

        // Wait for the print dialog to load
//        printDialog.get("chrome://print/");

        // Your code to interact with the print dialog goes here

        // Close the print dialog
//        printDialog.quit();


	}

	@When("User click the Compartion list and Add to cart and Add to Wishlist")
	public void user_click_the_compartion_list_and_add_to_cart_and_add_to_wishlist() {

		implicityWait();
		driver.findElement(pom.AddToCart).click();

		driver.findElement(pom.AddToWish).click();

//		driver.findElement(pom.remove).click();
//		driver.findElement(pom.removeOK).click();

	}

	@When("User click the Cart and Edit botton")
	public void user_click_the_cart_and_edit_botton() throws InterruptedException {

		implicityWait();

		driver.findElement(pom.cart).click();

		Thread.sleep(500);
		
		driver.findElement(pom.edit).click();

	}

	@When("Click the Update , Assert the product value and Subtotal value")
	public void click_the_update_assert_the_product_value_and_subtotal_value() {

		implicityWait();

		driver.findElement(pom.update).click();

		try {

			String cartAmt = driver.findElement(pom.cartAmt).getText();

			System.out.println(cartAmt);

			String subTotal = driver.findElement(pom.subtotal).getText();

			System.out.println(subTotal);

			if (cartAmt == subTotal) {
				System.out.println("Its Equal");
				System.out.println("-"+cartAmt+"=="+subTotal+"-");
			} else {
				System.out.println("Its not Equal");
				System.out.println("-"+cartAmt+"=="+subTotal+"-");
			}
		} catch (Exception e) {
		}

	}

	@When("Click the checkout page and Assert the same page")
	public void click_the_checkout_page_and_assert_the_same_page() throws InterruptedException, IOException {

		implicityWait();

		driver.findElement(pom.checkout).click();

		try {
			implicityWait();

			String finalPage = "Shipping Address";

			String shipping = driver.findElement(pom.finalPage).getText();

			Assert.assertEquals(finalPage, shipping);

			System.out.println("This is correct Page");

		} catch (Exception e) {
			System.out.println("This is Not correct Page");
		}
		Thread.sleep(3000);

// 	*	User Screenshot Folder path

		screenshot(driver, "shipping Img");

		driver.navigate().back();

		driver.findElement(pom.cart).click();

		driver.findElement(pom.deleteItem).click();

		driver.findElement(pom.clickOK).click();

	}

	@When("Goto Home page  and Logout the account")
	public void goto_home_page_and_logout_the_account() throws InterruptedException {

		implicityWait();

		for (int i = 0; i < 8; i++) {
			driver.navigate().back();
		}
		Thread.sleep(1000);

		driver.findElement(pom.clickProfile).click();

		String text = driver.findElement(pom.clickSignOut).getText();

//		System.out.println(text);

		driver.findElement(pom.clickSignOut).click();

		Thread.sleep(2000);
	}

}

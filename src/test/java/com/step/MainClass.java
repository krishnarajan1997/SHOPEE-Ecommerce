package com.step;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.baseclass.BaseClass;
import org.junit.Assert;
import org.pom.PomClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainClass extends BaseClass {

	PomClass p = new PomClass();

	@Given("Move to login page")
	public void move_to_login_page() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		elementClick(p.loginpage().getLoginicon());

	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sendKey(p.loginpage().getUser(), excel("Sheet1", 1, 0));
		sendKey(p.loginpage().getPass(), excel("Sheet1", 1, 1));
	}

	@When("click the login button")
	public void click_the_login_button() throws AWTException  {
		for (int i = 0; i < 4; i++) {
			tab();
		}
		enter();
	}

	@Then("check the outcome")
	public void check_the_outcome() throws Exception {
		Assert.assertTrue(pageTitle().contains("Singapore"));
		Thread.sleep(5000);
		takesScreenshot("login");
	}

	@Given("Write the coding for image and links")
	public void write_the_coding_for_image_and_links() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Count of the image=" + p.homePage().getImage().size());
		System.out.println("COunt of the links=" + p.homePage().getLink().size());
	}

	@When("Write the coding for dropdown and textfield")
	public void write_the_coding_for_dropdown_and_textfield() {

		System.out.println("Count of the textfield=" + p.homePage().getTextField().size());
	}

	@When("To check all links are broken or not")
	public void to_check_all_links_are_broken_or_not() throws Exception {
		brokenLink(p.home.getLink());
	}

	@Then("To check the overcome result")
	public void to_check_the_overcome_result() throws Exception {

		Assert.assertTrue(pageTitle().contains("Singapore"));
		System.out.println("Home page is checked");
		takesScreenshot("home");
	}

	@Given("enter the product name and select the product")
	public void enter_the_product_name_and_select_the_product() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sendKey(p.search().getSbox(), excel("Sheet1", 1, 2));
		elementClick(p.search().getSbutton());
		elementClick(p.search().getItem());
	}

	@When("check the price and add the product to cart")
	public void check_the_price_and_add_the_product_to_cart() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String text = getTheText(p.search().getPprice());
		for (String string : text.split("-")) {
		
			System.out.println("The price of the product" + string);

		}
		elementClick(p.search().getPspecification());
		Thread.sleep(2000);
		elementClick(p.search().getPcolour());
		sendKey(p.search().getPquantity(), "2");

		elementClick(p.search().getAddToCart());
	}

	@When("to login the account")
	public void to_login_the_account() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		elementClick(p.loginpage().getLoginicon());
		sendKey(p.loginpage().getUser(), excel("Sheet1", 1, 0));
		sendKey(p.loginpage().getPass(), excel("Sheet1", 1, 1));

		Thread.sleep(2000);
		tab();
		enter();

	}

	@Then("Give details and pay")
	public void give_details_and_pay() throws Exception {
		Thread.sleep(4000);
		elementClick(p.cartpage().getCart());
		elementClick(p.cartpage().getCheckout());
		Thread.sleep(4000);
		sendKey(p.cartpage().getFullname(), excel("Sheet1", 1, 5));
		sendKey(p.cartpage().getPhone(), "+918645123542");
		sendKey(p.cartpage().getPostal(), excel("Sheet1", 1, 7));
		sendKey(p.cartpage().getAddress(), excel("Sheet1", 1, 8));
		sendKey(p.cartpage().getUnit(), excel("Sheet1", 1, 9));
		elementClick(p.cartpage().getSubmit());
		Thread.sleep(4000);
		takesScreenshot("payment1");

	}
}

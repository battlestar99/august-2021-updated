package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.SauceDemoLoginPage;


public class StepDefinition {
	WebDriver driver;
	SauceDemoLoginPage loginPage;
	
	@Given("^user is in the login page$")
	public void user_is_in_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
		loginPage = new SauceDemoLoginPage(driver);
	}

	@When("^user insert valid username$")
	public void user_insert_valid_username() throws Throwable {
		loginPage.UserNameTextBox().sendKeys("standard_user");
		Thread.sleep(2000);
	}

	@When("^user insert valid password$")
	public void user_insert_valid_password() throws Throwable {
		loginPage.passwordTextBox().sendKeys("secret_sauce");
		Thread.sleep(2000);
	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		Assert.assertTrue(loginPage.signInB().isDisplayed());
		loginPage.signInB().click();
		Thread.sleep(5000);
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	}

}

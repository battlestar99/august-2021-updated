package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.SauceDemoLoginPage;

public class StepDefinition {
	WebDriver driver;
	SauceDemoLoginPage loginPage;
	@Then("^user shold able to see the username textbox$")
	public void user_shold_able_to_see_the_username_textbox() throws Throwable {
		loginPage.UserNameTextBox().isDisplayed();
	}

	@And("^user shold able to see the password textbox$")
	public void user_shold_able_to_see_the_password_textbox() throws Throwable {
		loginPage.passwordTextBox().isDisplayed();
	}

	@And("^user shold able to see the signin button$")
	public void user_shold_able_to_see_the_signin_button() throws Throwable {
		loginPage.signInB().isDisplayed();
	}
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
		loginPage = new SauceDemoLoginPage(driver);
	}

	@When("^user insert valid user name$")
	public void user_insert_valid_user_name() throws Throwable {
		loginPage.UserNameTextBox().sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@When("^user insert new valid \"([^\"]*)\"$")
	public void user_insert_new_valid(String username) throws Throwable {
		loginPage.UserNameTextBox().sendKeys(username);
	}

	@When("^user insert valid password$")
	public void user_insert_valid_password() throws Throwable {
		loginPage.passwordTextBox().sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@When("^user insert valid \"([^\"]*)\"$")
	public void user_insert_valid(String arg1) throws Throwable {
		loginPage.passwordTextBox().sendKeys(arg1);
	}

	@When("^user click in the signin button$")
	public void user_click_in_the_signin_button() throws Throwable {
		Assert.assertTrue(loginPage.signInB().isDisplayed());
		loginPage.signInB().click();
		Thread.sleep(5000);
	}

	@Then("^user should able to login$")
	public void user_should_able_to_login() throws Throwable {
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	}
	
	

	@After
	public void clodingBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	

}

package allStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SauceDemoLoginPage;

public class StepDefinition {
	WebDriver driver;
	SauceDemoLoginPage loginPage;
	
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
		loginPage = new SauceDemoLoginPage(driver);
	}

	@When("user insert valid username")
	public void user_insert_valid_username() throws InterruptedException {
		loginPage.UserNameTextBox().sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@When("user insert valid {string}")
	public void user_insert_valid(String username) throws InterruptedException {
		loginPage.UserNameTextBox().sendKeys(username);
		Thread.sleep(2000);
	}

	@When("user insert valid password")
	public void user_insert_valid_password() throws InterruptedException {
		loginPage.passwordTextBox().sendKeys("secret_sauce");
		Thread.sleep(2000);
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() throws InterruptedException {
		Assert.assertTrue(loginPage.signInB().isDisplayed());
		loginPage.signInB().click();
		Thread.sleep(5000);
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}

}

package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.SauceDemoLoginPage;
import pageObject.cartPage;

public class SauceDemo_Login {
	
	public WebDriver driver;
	SauceDemoLoginPage loginPage;
	cartPage cPage;

	@BeforeTest
	public void initializingBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
		loginPage = new SauceDemoLoginPage(driver);
		cPage = new cartPage();
	}
	
	@Test(priority = 1)
	public void userName() throws InterruptedException {
		loginPage.UserNameTextBox().sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void password() throws InterruptedException {
		loginPage.passwordTextBox().sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void loginButtonClick() throws InterruptedException {
		Assert.assertTrue(loginPage.signInB().isDisplayed());
		loginPage.signInB().click();
		Thread.sleep(5000);
		Assert.assertEquals("https://www.saucedemo.com/.html", driver.getCurrentUrl());
		
	}
	
	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}
	

}

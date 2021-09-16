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

public class SauceDemo_Login {
	
	int var = 12;
	
	WebDriver driver;

	@BeforeTest
	public void initializingBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
		
	}
	
	@Test(priority = 1)
	@Parameters({"userName"})
	public void userName(String userName) throws InterruptedException {
		WebElement userNameTextBox = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userNameTextBox.sendKeys(userName);
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	@Parameters({"password"})
	public void password(String password) throws InterruptedException {
		WebElement passwordTextBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwordTextBox.sendKeys(password);
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void loginButtonClick() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginButton.click();
		Thread.sleep(5000);
		Assert.assertEquals("https://www.saucedemo.com/.html", driver.getCurrentUrl());
	}
	
	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}
	

}

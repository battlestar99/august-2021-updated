package com.automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.signinPage;
import utilityPackage.UtilityClass;

public class RegistationOfAutomationPractice {
	WebDriver driver;
	signinPage signinPageObj;

	@BeforeTest
	@Parameters({"browser"})
	public void initializingBrowser(String browser) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
//		if (browser == "chrome") {
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
//			driver = new ChromeDriver();
//		} else if (browser == "firefox") {
//			System.setProperty("webdriver.firefox.driver",
//					"C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
//			driver = new FirefoxDriver();
//		} else {
//			System.setProperty("webdriver.ie.driver", "user.dir\\driver\\chromedriver.exe");
//			driver = new InternetExplorerDriver();
//		}
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		signinPageObj = new signinPage(driver);

	}

	@Test(priority = 1)
	public void Signin() {

		// Sign in Button
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

		Assert.assertTrue(signin.isDisplayed());
		signin.click();

	}

	@Test(priority = 2)
	@Parameters({ "emailAdd" })
	public void createaccount(String emailAdd) throws InterruptedException {

		// create account
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys(emailAdd);

		WebElement createanaccount = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		createanaccount.click();

		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void createAccountForm() {

		driver.findElement(By.id("uniform-id_gender2")).click();

	}

	@Test(priority = 4)
	@Parameters({ "firstName" })
	public void firstName(String firstName) {

		signinPageObj.firstNameTextBox().sendKeys(firstName);

	}

	@Test(priority = 5)
	public void lastName() {
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		lastname.sendKeys("khan");

	}

	@Test(priority = 6)
	public void password() {
		WebElement passwd = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		passwd.sendKeys("abc123");
	}

	@Test(priority = 7)
	public void dateOfBirth() throws InterruptedException {
		WebElement DateofBirth = driver.findElement(By.id("days"));

//		Select dofb = new Select(DateofBirth);
//
//		dofb.selectByValue("8");
		UtilityClass.selectFunction(DateofBirth, "8");
		
		Thread.sleep(3000);
		// day
		WebElement month = driver.findElement(By.name("months"));

//		Select md = new Select(month);
//
//		md.selectByIndex(2);
		
		UtilityClass.selectFunction(month, "5");

		// year
		WebElement year = driver.findElement(By.id("years"));

//		Select yd = new Select(year);
//
//		yd.selectByValue("1982");
		
		UtilityClass.selectFunction(year, "1990");
	}

	@Test(priority = 8)
	public void newsLetter() {

		WebElement checkbox = driver.findElement(By.id("uniform-newsletter"));
		checkbox.click();

	}

	@Test(priority = 9)
	public void address() throws InterruptedException {
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("capital one");
		// address

		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("1200 lincoln way");
		Thread.sleep(3000);

		// id_state

		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("vienna");

		WebElement state = driver.findElement(By.id("id_state"));

		Select st = new Select(state);

		st.selectByValue("53");
		Thread.sleep(3000);
		// zipcode

		WebElement postalcode = driver.findElement(By.id("postcode"));
		postalcode.sendKeys("22003");

	}

	@Test(priority = 10)
	public void mobile() {

		WebElement Mobile = driver.findElement(By.id("phone_mobile"));
		Mobile.sendKeys("571-111-3456");

		// Reference address
		WebElement reference = driver.findElement(By.id("alias"));
		reference.sendKeys("N/A");

	}

	@Test(priority = 11)
	public void validateUserAbleToRegister() {
		// Click on Register Button.
		WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
		register.click();

	}

	@Test(priority = 12)
	public void validateUserName() {
		// Click on Register Button.
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
		Assert.assertEquals("sobia khan", userName.getText());

	}

	@AfterTest
	public void closebrowser() {
		driver.quit();

	}

}

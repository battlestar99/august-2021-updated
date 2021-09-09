package learningTestNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooSignUpPage {

	WebDriver driver;

	@BeforeTest
	public void initializingBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
	}

	@Test(priority = 1)
	public void weadingHeader() throws InterruptedException {
		WebElement header = driver.findElement(By.xpath("//*[@id=\"account-attributes-challenge\"]/h1"));
		System.out.println(header.getText());
		Thread.sleep(3000);
}
	
	@Test(priority = 2, enabled = false)
	public void sendingText() throws InterruptedException {
		WebElement firstNameTextBox = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
		firstNameTextBox.sendKeys("GK");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}

}

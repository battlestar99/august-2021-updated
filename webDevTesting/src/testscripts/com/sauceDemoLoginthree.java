package testscripts.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginPage;

public class sauceDemoLoginthree {

	public static void main(String[] args) throws InterruptedException {
		
		String usernamevalue = "locked_out_user";
		String passwordValue = "secret_sauce";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		loginPage lp = new loginPage(driver);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		lp.getUsername().sendKeys(usernamevalue);
		lp.getPassword().sendKeys(passwordValue);
		lp.getloginButton().click();
		
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		driver.quit();

	}

}

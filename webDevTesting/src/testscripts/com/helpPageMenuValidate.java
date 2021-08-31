package testscripts.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class helpPageMenuValidate {

	public static void main(String[] args) {
		
// validate password and signin menu is available on the help page
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://help.yahoo.com/kb/account");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement passwordSignIN= driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[2]/a"));
		
		boolean passwordDisplay = passwordSignIN.isDisplayed();
		System.out.println(passwordDisplay);
		
		String passwordText = passwordSignIN.getText(); 
		System.out.println(passwordText);

	}

}

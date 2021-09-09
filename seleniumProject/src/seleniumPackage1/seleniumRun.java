package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRun {

	public static void main(String[] args) throws InterruptedException {
	
	// setting up the property for chromedriver  	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		
	// creating an object of the webdriver/chromedriver class 
	// this will also open a chrome browser 	
		WebDriver driver = new ChromeDriver();
		
		// navigating to the url 
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		WebElement header = driver.findElement(By.xpath("//*[@id=\"account-attributes-challenge\"]/h1"));
		
		System.out.println(header.getText());
		
		WebElement firstNameTextBox = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
		firstNameTextBox.sendKeys("GK");
		
		Thread.sleep(3000);
		
		
		driver.quit();
		

	}

}

package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRun {

	public static void main(String[] args) throws InterruptedException {
	
	// setting up the property for chromedriver  	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
		
	// creating an object of the webdriver/chromedriver class 
	// this will also open a chrome browser 	
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		
		// navigating to the url 
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		driver1.get("https://twitter.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}

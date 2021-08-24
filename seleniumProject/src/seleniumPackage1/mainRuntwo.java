package seleniumPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainRuntwo {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://login.yahoo.com/account/create");
		
		// reading the title of any web page 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.quit();

	}

}

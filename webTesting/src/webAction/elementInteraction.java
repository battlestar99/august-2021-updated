package webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\libraries\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			// maximizing your browser windows 
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			// deleting cookies 
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(2000);
			
			//driver.get("https://login.yahoo.com/account/create");
			
			driver.navigate().to("https://login.yahoo.com/account/create");
			
			
driver.findElement(By.name("firstName")).sendKeys("mike");

driver.findElement(By.id("usernamereg-lastName")).sendKeys("pence");

driver.findElement(By.name("yid")).sendKeys("pencemike717");
			
driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys("gsgfsafd++");





	}

}

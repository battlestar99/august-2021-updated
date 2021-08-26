package webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementOne {

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
	
		
WebElement firstName = driver.findElement(By.name("firstName")); 
firstName.sendKeys("mike");	
Thread.sleep(1000);
firstName.clear();

WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
lastName.sendKeys("pence");

Thread.sleep(1000);
WebElement username = driver.findElement(By.name("yid"));
username.sendKeys("pencemike717");

Thread.sleep(1000);
WebElement passWord = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
passWord.sendKeys("gsgfsafd++");

Thread.sleep(1000);
WebElement help = driver.findElement(By.linkText("Help"));
help.click();		


	}

}

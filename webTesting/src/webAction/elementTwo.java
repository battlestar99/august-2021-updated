package webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementTwo {

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

boolean flag = firstName.isDisplayed();
System.out.println(flag);

WebElement contButton = driver.findElement(By.id("reg-submit-button")); 
String x = contButton.getText();
System.out.println(x);

Thread.sleep(1000);
WebElement help = driver.findElement(By.linkText("Help"));

boolean flagOne = help.isEnabled();
System.out.println(flagOne);

//help.click();		

		
		

	}

}

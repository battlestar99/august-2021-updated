package webAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException, AWTException  {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		// Launching the site.
//		driver.get("http://demo.guru99.com/popup.php");
//		driver.manage().window().maximize();
//		String MainWindow = driver.getWindowHandle();
//		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
//
//		
//
//		// To handle all new opened window.
//		Set<String> s1 = driver.getWindowHandles();
//		Iterator<String> i1 = s1.iterator();
//
//		while (i1.hasNext()) {
//			String ChildWindow = i1.next();
//
//			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
//
//				// Switching to Child window
//				driver.switchTo().window(ChildWindow);
//				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
//
//				driver.findElement(By.name("btnLogin")).click();
//				Thread.sleep(3000);
//				// Closing the Child Window.
//				driver.close();
//			}
//		}
//		// Switching to Parent window i.e Main Window.
//		driver.switchTo().window(MainWindow);
//		Thread.sleep(3000);
//		driver.quit();

//		driver.get("https://demoqa.com/alerts");
//	    driver.manage().window().maximize();
//	  // This step will result in an alert on screen
//	    driver.findElement(By.id("alertButton")).click();
//	    
//	    Thread.sleep(3000);
//	    Alert simpleAlert = driver.switchTo().alert();
//	    simpleAlert.dismiss();
		
		
		
//		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.id("promtButton"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
//		Alert promptAlert = driver.switchTo().alert();
//		
//		String alertText = promptAlert.getText();
//		System.out.println("Alert text is " + alertText);
//		
//		// Send some text to the alert
//		Thread.sleep(5000);
//		promptAlert.sendKeys("Sanaa");
//		Thread.sleep(5000);
//		promptAlert.dismiss();
//		
//		Robot rob = new Robot();
		
//		accept();
//		dismiss();
//		getText();
//		sendKeys("");
		
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
        driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
        Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(5000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
    // press enter key of keyboard to perform above selected action	
		
	}

}

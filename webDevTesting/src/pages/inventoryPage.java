package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventoryPage {

	
WebDriver driver; 
	
	public inventoryPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getBackPackLink() {
		
		WebElement backpack =driver.findElement(By.linkText("Sauce Labs Backpack"));
		return backpack;
		
		}
	
	
	
	
	
}

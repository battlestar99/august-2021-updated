package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signinPage {
	WebDriver internalDriver;
	WebElement firstNameText;
	
	public signinPage(WebDriver driver) {
		this.internalDriver = driver;
	}
	
	
	
	
	public WebElement firstNameTextBox() {
		firstNameText = internalDriver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		return firstNameText;
	
	}

}

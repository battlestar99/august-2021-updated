package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoLoginPage {
	WebDriver internalDriver;
	WebElement userName;
	WebElement password;
	WebElement signInButton;
	
	public SauceDemoLoginPage(WebDriver driver) {
		internalDriver = driver;
	}
	
	public WebElement UserNameTextBox() {
		userName = internalDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		return userName;
	}
	
	public void UserNameTextBox(String userNameBox) {
		userName = internalDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.sendKeys(userNameBox);
	}
	
	public WebElement passwordTextBox() {
		password = internalDriver.findElement(By.xpath("//*[@id=\"password\"]"));
		return password;
	}
	
	public WebElement signInB() {
		signInButton = internalDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		return signInButton;
	}
	

}

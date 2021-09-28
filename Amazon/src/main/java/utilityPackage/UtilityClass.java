package utilityPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	
	
	public static void selectFunction(WebElement DateofBirth, String value) {
		Select sl = new Select(DateofBirth);
		sl.selectByValue(value);
	}
}

package learningTestng;

import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	@Test
	public static void beforeSuite() {
		System.out.println("Before Suite");
	}

}

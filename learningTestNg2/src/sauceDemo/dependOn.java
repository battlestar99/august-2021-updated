package sauceDemo;

import org.testng.annotations.Test;

public class dependOn {
	
	
	@Test(priority = 1)
	public static void TestB() {
		System.out.println("Test B");
	}
	
	@Test (priority = 2)
	public static void TestC() {
		System.out.println("Test C");
	}
	
	@Test(priority = 3)
	public static void TestA() {
		System.out.println("Test A");
	}
	
	@Test(dependsOnMethods = "TestB")
	public static void TestD() {
		System.out.println("Test D");
	}


}

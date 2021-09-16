package sauceDemo;

import org.testng.annotations.Test;

public class dependOn {
	
	
	@Test(groups = {"sanity"})
	public static void TestB() {
		System.out.println("Test B");
	}
	
	public static void TestE() {
		System.out.println("Test B");
	}
	
	@Test (groups = {"regression"})
	public static void TestC() {
		System.out.println("Test C");
	}
	
	@Test(groups = {"sanaa", "regression"})
	public static void TestA() {
		System.out.println("Test A");
	}
	
	@Test(groups = {"sanaa"})
	public static void TestD() {
		System.out.println("Test D");
	}


}

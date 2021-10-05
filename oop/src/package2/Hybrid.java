package package2;

import package1.Honda;

public class Hybrid implements test, test2{

	private int value = 10;

	
	public void settingValue(int val) {
		value = val;
	}

	public int gettingValue() {
		return value;
	}
	
	
	
	
	
	
	
	
	private void doors() {
		System.out.println("4");
		System.out.println();
	}

	@Override
	public void anyMethodName() {
		// TODO Auto-generated method stub
		
	}
}

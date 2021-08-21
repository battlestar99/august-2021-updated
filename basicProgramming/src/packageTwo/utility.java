package packageTwo;

public class utility {
	
	
	// create a method that will add two numbers
	// and return the summation of the two numbers
	
	public int go(int x, int y) {
		
		int sum = x+y; 
		//System.out.println(sum);
		
		return sum; 
	}
	
	public double celsiustoFar(double celsius) {
		
		double fahranheit; 
		fahranheit = (celsius*9)/5+32;
		//System.out.println(fahranheit);
		return fahranheit;  
		
	}
	
	public void printName(String name) {
		
		System.out.println(name);
		
	}
	
	
	
	
	
	
	
	

}

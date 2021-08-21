package packageTwo;

public class runMain {

	public static void main(String[] args) {
		
		
		// creating an object of the utility class
		
		utility ut = new utility();
		
		utilityOne uo = new utilityOne();
		
		int sum = uo.addThreeNumbers(12, 12, 23);
		
		ut.printName("dfhld");
		
		
		ut.go(12, 24);
		
		ut.go(34, 45);
		
		ut.celsiustoFar(30.23);
		
		ut.celsiustoFar(45.78);
		
		ut.printName("Michael");
		
	}

}

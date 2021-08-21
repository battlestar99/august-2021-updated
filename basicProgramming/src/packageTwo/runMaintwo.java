package packageTwo;

public class runMaintwo {

	public static void main(String[] args) {
		
		utility obj = new utility();
		
		utility xyz = new utility();
		
		utilityOne uo = new utilityOne();
		
		boolean test = uo.ifEligibleForLoan(710, 60000);
		
		System.out.println(test);
		double x; 
		
		x = obj.celsiustoFar(12.32);
       
		int y; 
		
		y = obj.go(12, 34);
		
		
		System.out.println(x);
		System.out.println(y);
		
		
		//xyz.printName("testing");
		
		
	}

}

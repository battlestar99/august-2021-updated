package carPaymentCalculator;

public class carPaymentV1 {

	public static void main(String[] args) {
		
		double basecarPrice = 20000; 
		double adminfee = 200; 
		double downPayment = 2000; 
		double tax = 8 ; 
		double apr = 0; 
		
		int creditscore = 660; 
		
		double totalPrice=0; 
		double financePrice; 
		double taxPay = 0; 
		double finalfinancePrice; 
		double monthlyPayment; 
		
		int months = 72; 
		
		
		
		taxPay = Utility.taxPayCalculation(basecarPrice, adminfee, tax);
		totalPrice = basecarPrice +adminfee+ taxPay;
		
		financePrice = totalPrice - downPayment; 
		
	//	System.out.println(financePrice);
		
		if(creditscore>750) {
			
			apr=1.5;
		}
     if(creditscore<=750 && creditscore>=650 ) {
			
			apr=2.5;
		}
		
     if(creditscore<650 && creditscore>=600 ) {
			
			apr=3;
		}
     
     else {
    	 
    	 apr = 8; 
    	 
     }
     
    // System.out.println(apr);
		
     finalfinancePrice = financePrice + financePrice*apr/100;

     monthlyPayment = finalfinancePrice/months; 
     
     System.out.println("Monthly payment is ....");
     System.out.println(monthlyPayment);

	}

}

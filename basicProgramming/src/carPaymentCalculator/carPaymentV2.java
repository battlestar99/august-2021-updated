package carPaymentCalculator;

import java.util.Scanner;

public class carPaymentV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base price of the car...");
		
		
		double basecarPrice = sc.nextDouble(); 
		double adminfee = 200; 
		
		System.out.println("Enter the down payment of the car...");
		double downPayment = sc.nextDouble(); 
		
		double tax = 5 ; 
		double apr = 0; 
		
		System.out.println("Enter credit score ...");
		int creditscore = sc.nextInt(); 
		
		double totalPrice=0; 
		double financePrice; 
		double taxPay = 0; 
		double finalfinancePrice; 
		double monthlyPayment; 
		System.out.println("Enter number of months ...");
		int months = sc.nextInt(); 
		
		
		
		taxPay = (basecarPrice+adminfee)*(tax/100);
		totalPrice = basecarPrice +adminfee+ taxPay;
		
		financePrice = totalPrice - downPayment; 
		
		//System.out.println(financePrice);
		
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

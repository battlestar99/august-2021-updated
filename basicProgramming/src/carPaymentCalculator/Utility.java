package carPaymentCalculator;

public class Utility {
	
	public static double taxPayCalculation(double basecarPrice, double adminfee, double taxPay) {
		double result = (basecarPrice+adminfee)*(taxPay/100);
		return result;
	}
	

}

package learningFunctions;

public class AddNumbers {
	
	int phoneNum;
	
	public AddNumbers(int phoneNumber) {
		
		phoneNum = phoneNumber;
		
	}
	
	public int addTwoNumbers(int numberOne, int numberTwo) {
		int sum = numberOne + numberTwo + phoneNum;
		int newPhoneNumber;
		
		return sum;
		
	}
	
	public double addTwoNumbers(double numberOne, double numberTwo) {
		double sum = numberOne + numberTwo;
		
		return sum;
	}
	
	public int addThreeNumbers(int numberOne, int numberTwo, int numberThree) {
		int sum = numberOne + numberTwo+numberThree;
		return sum;
	}
	
	public int addFourNumbers(int numberOne, int numberTwo, int numberThree, int numberFour) {
		int sum = numberOne + numberTwo + numberThree + numberFour;
		return sum;
	}
}

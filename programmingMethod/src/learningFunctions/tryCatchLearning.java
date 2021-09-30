package learningFunctions;

public class tryCatchLearning {
	
	public static void main(String[] args) {
		final int var = 10;
		
		
		int[] arr = {1,2,3};
 		
		
		try {
			System.out.println(arr[10]);
		}catch(Exception t) {
			t.printStackTrace();
//			System.out.println("any value cannot be devided by zero");
		}finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Test");
	}

}

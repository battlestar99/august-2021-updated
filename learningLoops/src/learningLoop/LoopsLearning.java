package learningLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopsLearning {

	public static void main(String[] args) {

//		for(int i=1; i<=10; i+=3) {
//			System.out.println(i);
//		}
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		
		int[] x = { 10, 20, 30, 40, 50 };
		String[] months = {"January","February", "March"};
//		System.out.println(Arrays.toString(x));
		
		List<String> monthList = new ArrayList<String>();
		monthList.add("January");
		monthList.add("February");
		monthList.add("March");
//		System.out.println(monthList);
		
		for (int i = 0; i < monthList.size(); i++) {
//			System.out.println(monthList.get(i));
		}
	}

}

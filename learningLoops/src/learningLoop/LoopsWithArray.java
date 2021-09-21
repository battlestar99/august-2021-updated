package learningLoop;

import java.util.Arrays;

public class LoopsWithArray {

	public static void main(String[] args) {

		String[] names = {"john", "mike", "sanaa", "sam", "hossain"};
//		System.out.println((names[2]));
		boolean isInList = true;
		int arraySize = names.length;
		System.out.println(arraySize);
		
		for(int i=0; i<names.length; i++) {
			if(names[i]=="sanaa") {
				isInList = true;
				break;
			}else {
				isInList= false;
			}
		}
		
		if(isInList == true) {
			System.out.println("Sanaa is in the list");
		}else {
			System.out.println("sanaa is not in the list");
		}
	}

}

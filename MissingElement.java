package week3.day2;

import java.util.ArrayList;
import java.util.List;

/* Here is the input
int[] arr = {1,2,3,4,7,6,8};
Sort the array	
loop through the array (start i from arr[0] till the length of the array)
check if the iterator variable is not equal to the array values respectively
print the number
once printed break the iteration*/

public class MissingElement {

	public static void main(String[] args) {
		List<Integer> firstList = new ArrayList<Integer>();
		int[] list1 = { 1, 2, 3, 4, 7, 6, 8 };
		for (int listvalue : list1) {
			firstList.add(listvalue);
		}
		for (int i = 1; i < firstList.size(); i++) {
			if (!firstList.contains(i)) {
				System.out.println("The missing Element is:: " + i);
			}
		}
	}

}

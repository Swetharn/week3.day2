package week3.day2;
/* Here is the input
 int[] data = {3,2,11,4,6,7};
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {

		List<Integer> firstList = new ArrayList<Integer>();
		int[] list1 = { 3, 2, 11, 4, 6, 7 };
		for (int listvalue : list1) {
			firstList.add(listvalue);
		}
		Collections.sort(firstList);
		int secondLargestNumber = (firstList.get(firstList.size() - 2));
		System.out.println("SecondLargestNumber is:: " + secondLargestNumber);
	}

}

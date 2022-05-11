package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
get the length of the array
declare an int variable named count
iterate from 0 to the array length-1 (outer loop starts here)
assign 0 to count 
iterate from i to the length of the array by adding 1 to it (inner loop starts here)
compare both the loop variables & check they're equal
increase the count if both the arrays are equal
Out of the inner loop, check and print the first array variable if count is more than 0*/

public class Duplicates {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> dupList = new ArrayList<>();
		list.addAll(Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20));
		for (int listValue : list) {
			if ((dupList.contains(listValue))) {
				list2.add(listValue);
			} else {
				dupList.add(listValue);
			}

		}
		System.out.println("The duplicate values are:: " + list2);
	}
}
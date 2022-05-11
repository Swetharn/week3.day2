package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {
	/*
	 * Pseudo Code
	 * 
	 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
	 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
	 * a nested for another array from 0 to array length e) Compare Both the arrays
	 * using a condition statement
	 * 
	 * f) Print the first array (shoud match item in both arrays)
	 */
	public static void main(String[] args) {
		int[] list1 = { 3, 2, 11, 4, 6, 7 };
		int[] list2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> firstList = new ArrayList<Integer>();
		List<Integer> secondList = new ArrayList<Integer>();
		for (int num : list1) {
			firstList.add(num);
		}
		for (int num1 : list2) {
			secondList.add(num1);
		}
		firstList.retainAll(secondList);
		System.out.println(firstList);

	}
}

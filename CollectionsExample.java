package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsExample {

	
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,1,4,5,1,6);
		int count =0;
		for(int i=0;i<list.size();i++) {
			Integer integer = list.get(i);
			if(integer==1) {
				count++;
				
			}
			
		}
		System.out.println("The no of 1's in the list :: " +count);
	}
}

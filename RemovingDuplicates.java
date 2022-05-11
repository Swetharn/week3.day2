package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */
public class RemovingDuplicates {
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String text2 = "";
		String[] str = text.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(str));
		for (String dupWord : set) {
			text2 = text2 + dupWord + " ";
		}
		System.out.println(text2);
	}

}

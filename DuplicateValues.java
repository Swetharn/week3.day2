package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "a", "g", "c");
		List<String> duplicatList = new ArrayList();
		List<String> duplicatvalue = new ArrayList();
		for (int i = 0; i < list.size(); i++) {

			if (duplicatList.contains(list.get(i))) {
				duplicatvalue.add(list.get(i));
			} else {
				duplicatList.add(list.get(i));
			}
		}
		System.out.println("The duplciate values are"+duplicatvalue);
	}

}

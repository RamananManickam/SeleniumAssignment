package week3.day4.feb08.classwork;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemoval {

	public static void main(String[] args) {
		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character> uniqueString = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			uniqueString.add(charArray[i]);
		}
		System.out.println(uniqueString);
	}

}

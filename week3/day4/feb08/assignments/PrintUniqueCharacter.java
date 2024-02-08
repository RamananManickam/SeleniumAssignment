package week3.day4.feb08.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// Take your name as input and Print all unique characters only (any order)
		String name = "manickam";
		
		char[] nameChar = name.toCharArray();
		
		Set<Character> nameSet = new HashSet<Character>();
		
		for (int i = 0; i < nameChar.length; i++) {
			if (nameSet.contains(nameChar[i])) {
				nameSet.remove(nameChar[i]);
			} else {
				nameSet.add(nameChar[i]);
			}
		}
		System.out.println(nameSet);
	}

}

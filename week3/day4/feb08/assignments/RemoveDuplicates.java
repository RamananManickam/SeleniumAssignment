package week3.day4.feb08.assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//	Declare a String as "PayPal India"
		String str = "PayPal India";
		
		//	Convert it into a character array
		char[] strArray = str.toCharArray();
		
		//	Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();
		
		//	Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();
		
		//	Iterate character array and add it into charSet
		for (int i = 0; i < strArray.length; i++) {
			charSet.add(strArray[i]);
			if (charSet.contains(strArray[i])) {
				dupCharSet.add(strArray[i]);
			}
		}
		System.out.println(charSet);
		//	if the character is already in the charSet then, add it to the dupCharSet
		
		System.out.println(dupCharSet);
		//	Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(dupCharSet);
		System.out.println(charSet);
		
		//	Iterate using charSet
		for (Character character : charSet) {
			//if( ! character.isSpace(' ')) {
				System.out.println(character);
			//}
		}
		//	Check the iterator variable isn't equals to an empty space
		
		//	print it

	}

}

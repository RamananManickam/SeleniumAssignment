package week3.day4.feb08.classwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("c");
		hashSet.add("B");
		//hashSet.add("B");
		System.out.println(hashSet.size());
		boolean remove = hashSet.remove("c");
		System.out.println(remove);
		hashSet.forEach(null);
		
		for (Iterator<String> iterator = hashSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

}

package week3.day3.feb07.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String [] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		int companiesLength = companies.length;

		List<String> companiesList = new ArrayList<String>();
		
		for (int i = 0; i < companiesLength; i++) {
			companiesList.add(companies[i]);
		}
		
		Collections.sort(companiesList);
		Collections.reverse(companiesList);
		
		System.out.println(companiesList);
		
	}

}

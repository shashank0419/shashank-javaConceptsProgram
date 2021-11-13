package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class String_DuplicateElementsInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if you implement only the first block then this Approach has a cavet that if the name occurs more than twice it'll print the name again.
		// you'll have to save the result in another hashSet and then print the names/elements from there this would solve the issue.
		
		String arr[] = { "Sank", "Sank", "Sank", "Sank", "Sank", "Sank" };
		Set<String> strSet = new HashSet<String>();
		Set<String> strSet2 = new HashSet<String>();
		for (String name: arr) {
			if(strSet.add(name)==false) {
				strSet2.add(name);
				System.out.println(name);
			}
		}
		System.out.println("-----------");
		for(String name: strSet2) {
			System.out.println(name);
		}

	}

}

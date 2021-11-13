package javaBasics;

public class String_CountofACharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My Name is Shashank Aggarwal";
		char c = 't';
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		if(count!=0) {
		System.out.println("Number of occurence of Char "+c+" is: "+count);}
		else
			System.out.println("No Occurence of Character \""+c+"\" is found in the String");
	}

}

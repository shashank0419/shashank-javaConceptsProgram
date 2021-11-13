package javaBasics;

public class String_CountTotalCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Shashank Aggarwal";
		String [] s = s1.split(" ");
		int totalChar = 0;
		for(int i=0;i<s.length;i++) {
			
			totalChar = totalChar+s[i].length();
		}
		System.out.println(totalChar);
	}

}

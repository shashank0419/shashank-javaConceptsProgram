package javaBasics;

public class String_CountAllWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is my zoom meeting";
		String [] sArray = s.split("\\s+");
		System.out.println(sArray.length);

	}

}

package javaBasics;

public class String_PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="madam";
		String snew="";
		for(int i=s.length()-1; i>=0;i--)
		{
			snew+=s.charAt(i);
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		if(s.equals(snew))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}

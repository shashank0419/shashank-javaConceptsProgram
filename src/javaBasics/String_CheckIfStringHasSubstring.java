package javaBasics;

public class String_CheckIfStringHasSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exits: " + substringCheck("Shashank", "ii"));

	}

	static boolean substringCheck(String original, String sub) {

		return original.matches(".*" + sub + ".*");
	}

}

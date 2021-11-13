package javaBasics;

public class String_ShiftZerosRightString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "101011010111011";
		String s = "0101";
		int ZeroPosition = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if (ch[i] == '0') {
				ZeroPosition = i;
				for (int j = ZeroPosition + 1; j < ch.length; j++) {
					if (ch[j] == '1') {
						ch[ZeroPosition] = '1';
						ch[j] = '0';
						break;
					}
				}
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}

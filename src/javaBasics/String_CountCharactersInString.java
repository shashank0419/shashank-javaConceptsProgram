package javaBasics;

public class String_CountCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is zoom meeting";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
				}
			}
			if(ch[i]!='0' && ch[i]!=' ')
			System.out.println(ch[i]+" "+count);
		}
	}
}
package javaBasics;

public class String_CountDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "New Delhi is very polluted";
		char[] ch = s.toCharArray();
		int elementCount =0;
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0' && ch[i]!=' ') {
				elementCount++;
				System.out.println(ch[i]+" "+count );
			}
		}
		System.out.println("Total Number of Duplicate Elements: "+ elementCount);
	}

}

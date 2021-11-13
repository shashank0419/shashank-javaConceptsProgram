package javaBasics;

public class String_CountDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Big black bug bit a big black dog on his big Black nose";
		s1 = s1.toLowerCase();
		String[] strArray = s1.split(" ");
		int wordCount=0;
		
		for (int i = 0; i < strArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					count++;
					strArray[j] = "0";
				}
			}
			if (strArray[i] != "0" && count>1) {
				wordCount++;
				System.out.println(strArray[i] + " " + count);
			}
		}
		System.out.println("Total Number of Duplicate Words: "+wordCount);

	}

}

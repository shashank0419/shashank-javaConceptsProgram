package javaBasics;

public class String_ShiftZerosLeftString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "101011010111011";
		char[] ch = s.toCharArray();
		int onePosition = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='1')
			{
				onePosition = i;
				for(int j=onePosition+1;j<ch.length;j++) {
					if(ch[j]=='0')
					{
						ch[onePosition]='0';
						ch[j]='1';
						break;
					}
				}
			}
		
			}
		//System.out.println(Arrays.toString(ch));
		for(int i=0; i<ch.length;i++) {
			System.out.print(ch[i]);
			}

	}

}

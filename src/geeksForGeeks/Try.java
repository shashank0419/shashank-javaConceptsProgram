package geeksForGeeks;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		result = hcf(270,192);
		System.out.println("HCF is:" + result);
		//int lcmre = lcm(2,4);
		//System.out.println("LCM is:" + lcmre);
		int[] a = {12,14,15,16};
		
	}
	
	public static int hcf(int a, int b) {
			if(a==0) {
				return b;
			}
			return hcf(b%a,a);
		
	}
	
	public static int lcm(int a, int b) {
		
		int gcd = hcf(a,b);
		int temp = (a*b)/gcd;
		return temp;
	}
	

}

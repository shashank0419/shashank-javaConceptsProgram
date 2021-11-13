package javaBasics;

public class Number_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 370;
		int OriginalNum = num;
		int rem;
		int sum = 0;
		while(num!=0) {
			rem = num%10;
			sum = sum+(int) Math.pow(rem, 3);
			//sum = sum + (rem*rem*rem);
			num =num/10;
		}
		if(sum == OriginalNum)
		{
			System.out.println(OriginalNum + " is Armstrong Number");
		}
		else
			System.out.println(OriginalNum + " is not an Armstrong Number");
	}

}

package geeksForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Number of test:");
		int test = sc.nextInt();
		int[] result = new int[2*test];
		if (test > 0) {
			for (int i = 0; i <= test - 1; i++) {
				System.out.println("Enter the array size and sum:");
				String size = br.readLine();
				String[] sizesum = size.trim().split("\\s+");
				int[] a = new int[2];
				for (int k = 0; k <= sizesum.length - 1; k++) {
					a[k] = Integer.parseInt(sizesum[k]);
					//System.out.println(a[k]);
				}
				int[] arr = new int[a[0]];
				String arrElements = br.readLine();
				String[] arrel = arrElements.trim().split("\\s+");
				for (int l = 0; l <= arrel.length - 1; l++) {
					arr[l] = Integer.parseInt(arrel[l]);
					//System.out.println(arr[l]);
				}
				int sum = 0;
				int counter=0;
				int temp=0;
				int firstindex=0;
				int diff=0;
				while(counter<=arr.length-1) {
					sum = sum + arr[counter];
					if(sum == a[1]) {
						int temp1 = counter+1;
						diff = temp1-firstindex;
						if (diff>diff) {
						System.out.println("Result Matched First index is:" + firstindex + " " + temp1);
						//break;
						}
					}
					if(counter == arr.length-1) {
						counter = temp;
						sum = 0;
						temp++;
						firstindex = temp+1;
					}
					counter++;
				}
			}
		}
	}
}

package javaBasics;

public class Number_DuplicateElementsInNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {1,1,2,1,1,1,2,0,0,1};
		int elementCount=0;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=null;
				}
			}
			if(count>1 && arr[i]!=null) {
				elementCount++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("Total Number of Duplicate Elements: "+ elementCount );
	}
}

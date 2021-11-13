package javaBasics;

public class Number_SmallestInMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{2,4,5},{3,0,7},{1,2,9}};
		int smallest=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]<smallest)
				{
					smallest = arr[i][j];
				}
			}
		}
	
	System.out.println(smallest);	
	}

}

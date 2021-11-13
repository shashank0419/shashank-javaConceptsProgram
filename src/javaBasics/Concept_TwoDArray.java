package javaBasics;

class ArrayDemo {

	int[][] arr;

	public ArrayDemo(int row, int col) {
		arr = new int[row][col];
	}

	public void InitializeArray() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	public void TraverseArray() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	public void InsertArray(int locRow, int locCol, int value) {
		try {
			if (arr[locRow][locCol] == Integer.MIN_VALUE) {
				arr[locRow][locCol] = value;
			} else {
				System.out.println("Location is already occupied with some other value");
			}
		}

		catch (Exception e) {
			System.out.println("Location provided is invalid");
		}
	}

	public void SearchArray(int value) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == value) {
					System.out.println("Value is found at loc: " + i + " " + j);
				}
			}
		}

	}

	public void DeleteValue(int value) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == value) {
					arr[i][j] = Integer.MIN_VALUE;
					System.out.println("Value is Deleted");
				}
			}
		}
	}
}

public class Concept_TwoDArray {

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo(5, 4);
		ad.InitializeArray();
		ad.TraverseArray();
		System.out.println("");

		ad.InsertArray(1, 3, 100);
		ad.TraverseArray();
		System.out.println("");

		ad.InsertArray(6, 6, 50);
		System.out.println("");

		ad.SearchArray(100);
		System.out.println("");

		ad.DeleteValue(100);
		ad.TraverseArray();
	}

}

package javaBasics;

class A {
	int factorial(int n) {

		if (n < 1) {

			return 1;
		}

		else {

			return (n * factorial(n - 1));
		}
	}

	int fibonnaci(int m) {

		if (m < 1)
			return -1;
		else if (m == 1 || m == 2)
			return m - 1;
		else
			return fibonnaci(m - 1) + fibonnaci(m - 2);
	}

	/*int fibprint(int o) {

		if (o < 1) {
			return -1;
		} else if (o == 1 || o == 2) {
			//System.out.print(o - 1 + ",");
			return o - 1;
		} else {
			System.out.print(fibprint(o - 1) + fibprint(o - 2) + ",");
			return fibprint(o - 1) + fibprint(o - 2);
		}
	}*/
}

public class Concept_Recurssion {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("Factorial is: " + a.factorial(9));
		System.out.println("Fibbonaci number is: " + a.fibonnaci(4));
		//a.fibprint(4);
	}
}

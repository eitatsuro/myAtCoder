package abc;

import java.util.Scanner;


public class ABC_212_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			double a = (double) sc.nextInt(); // űkúłA
			double b = (double) sc.nextInt(); // gŁúłB
			double c = (a-b)/3.0 + b; // ˝ĎłC
			
			System.out.println(c);
		}
	}
}
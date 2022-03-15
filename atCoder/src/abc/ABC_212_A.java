package abc;

import java.util.Scanner;


public class ABC_212_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			double a = (double) sc.nextInt(); // ûkŠúŒŒˆ³A
			double b = (double) sc.nextInt(); // Šg’£ŠúŒŒˆ³B
			double c = (a-b)/3.0 + b; // •½‹ÏŒŒˆ³C
			
			System.out.println(c);
		}
	}
}
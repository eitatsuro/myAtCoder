package abc;

import java.util.Scanner;

public class ABC_207_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ®”‚Ì“ü—Í
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int min = c;
			if ( min > a ) {
				min = a;
			}
			
			if ( min > b) {
				min = b;
			}
			
			System.out.println(a+b+c-min);

		}
	}
}

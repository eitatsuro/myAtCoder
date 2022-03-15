package abc;

import java.util.Scanner;

public class ABC_086_A {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ®”‚Ì“ü—Í
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ( a*b % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}

	}

}

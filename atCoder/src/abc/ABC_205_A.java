package abc;

import java.util.Scanner;
public class ABC_205_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ®”‚Ì“ü—Í
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ( a == 0 || b == 0) {
				System.out.println(0); 
			} else {
			System.out.println( ((double)a*b/100) );
			}
		}
	}
}

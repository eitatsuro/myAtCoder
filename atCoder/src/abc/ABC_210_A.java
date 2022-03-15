package abc;

import java.util.Scanner;


public class ABC_210_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // N ”ƒ‚¢‚½‚¢ƒLƒƒƒxƒc‚ÌŒÂ”
			int a = sc.nextInt(); // A ŒÂ‚Ü‚Å‚Í X‰~
			int x = sc.nextInt(); // A ŒÂ‚Ü‚Å‚Í X‰~
			int y = sc.nextInt(); // A+1 ŒÂˆÈ~‚Í Y‰~

			if ( n <= a ) {
				System.out.println( x*n );
			} else if ( n > a) {
				System.out.println( x*a + y*( n - a ) );
			}

		}
	}
}
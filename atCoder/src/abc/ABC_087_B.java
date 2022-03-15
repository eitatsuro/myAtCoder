package abc;

import java.util.Scanner;

public class ABC_087_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ®”‚Ì“ü—Í
			int a = sc.nextInt(); // 500‰~‹Ê‚Ì–‡”
			int b = sc.nextInt(); // 100‰~‹Ê‚Ì–‡”
			int c = sc.nextInt(); //  50‰~‹Ê‚Ì–‡”
			int x = sc.nextInt(); // x•¥‚¢‹àŠz
			
			// x•¥‚¢ƒpƒ^[ƒ“
			int combination = 0;
			
			// x    = 500*a + 100*b + 50*c
			// x/50 =  10*a +   2*b +    c  = Y  ( 1 <= Y <= 20000/50 = 400 ) 
			for ( int i = 0; i<=40; i++) {
				for ( int j = 0; j<=200; j++ ) {
					for ( int k = 0; k<=400; k++ ) {
						if ( 10*i + 2*j + k == x/50
								&& i <= a && j <= b && k <= c ) {
							combination++;
						}
					}
				}
			}

			System.out.println(combination);


		}
	}
}

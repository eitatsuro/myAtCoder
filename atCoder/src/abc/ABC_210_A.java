package abc;

import java.util.Scanner;


public class ABC_210_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // N 買いたいキャベツの個数
			int a = sc.nextInt(); // A 個までは X円
			int x = sc.nextInt(); // A 個までは X円
			int y = sc.nextInt(); // A+1 個以降は Y円

			if ( n <= a ) {
				System.out.println( x*n );
			} else if ( n > a) {
				System.out.println( x*a + y*( n - a ) );
			}

		}
	}
}
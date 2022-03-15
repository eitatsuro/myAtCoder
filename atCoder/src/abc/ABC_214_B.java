package abc;

import java.util.Scanner;


public class ABC_214_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int s = sc.nextInt(); // S
			int t = sc.nextInt(); // T

			int answer = 0;
			for (int a = 0 ; a <= s ; a++) {
				for ( int b = 0; a + b <= s; b++ ) {
					for ( int c = 0; a + b + c <= s; c++) {
						if ( a*b*c <= t) {
							answer++;
						}
					}
				}
			}
			System.out.println(answer);


		}
	}
}
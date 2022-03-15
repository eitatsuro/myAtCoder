package abc;

import java.util.Scanner;


public class ABC_227_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();
			long numOfCombination = 0;

			for ( int a=1; a<=n; a++) {
				for ( int b=a; b<=Math.ceil(n/a); b++) {
					for ( int c=b; c<=Math.ceil(n/(a*b)); c++) {
						if ( a*b*c <= n ) {
							numOfCombination++;
						}
					}
				}
			}

			System.out.println(numOfCombination);

		}
	}
}
package abc;

import java.util.Scanner;


public class ABC_227_C2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();
			long numOfCombination = 0;

			for ( long a=1; a*a*a <= n; a++) {
				for ( long b=a; a*b*b <= n; b++) {
					numOfCombination += Math.floor(n/(a*b)) -b +1;
				}
			}

			System.out.println(numOfCombination);

		}
	}
}
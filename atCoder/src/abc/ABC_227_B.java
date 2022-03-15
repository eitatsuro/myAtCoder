package abc;

import java.util.Scanner;


public class ABC_227_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] s = new int[n];
			for ( int i=0; i<n; i++) {
				s[i] = sc.nextInt();
			}

			// 1 <= a, b <= 150
			int numOfWrongAnswer = 0;
			for ( int menseki : s) {
				boolean isMightbeCorrect = false;	

				for ( int a=1; a<=150; a++) {
					for ( int b=1; b<=150; b++) {
						if ( menseki == getMensaki(a, b) ) {
							// might be correct
							isMightbeCorrect = true;
							break;
						}
					}
					if ( isMightbeCorrect ) break;
				}
				if (!isMightbeCorrect) numOfWrongAnswer++;
			}

			System.out.println(numOfWrongAnswer);

		}
	}

	private static int getMensaki ( int a, int b ) {
		return 4*a*b + 3*(a+b);
	}
}
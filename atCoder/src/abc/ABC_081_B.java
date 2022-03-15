package abc;

import java.util.Scanner;

public class ABC_081_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ®”‚Ì“ü—Í
			int n = sc.nextInt();
			int[] a = new int[n];

			// ”—ñ‚Ìæ“¾
			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}

			// 2‚ÅŠ„‚Á‚½’l‚ğb’è‚ÅŠi”[‚·‚é”z—ñ
			int[] buf = new int[n];

			int count = 0;
			boolean isOddNumbersContained = false;
			while(!isOddNumbersContained) {
				for( int i = 0; i<n; i++ ) {
					if( a[i] % 2 != 0 ) {
						isOddNumbersContained = true;
						break;
					} else {
						buf[i] = a[i]/2;
					}
				}

				if ( !isOddNumbersContained ) {
					count++;
					a = buf;
				}
			}
			System.out.println(count);

		}
	}
}

package abc;

import java.util.Scanner;

public class ABC_083_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ®”‚Ì“ü—Í
			int n = sc.nextInt();  // 1<=n<=10000
			int a = sc.nextInt();  // 1<=a,b<=36
			int b = sc.nextInt();

			// Œ…–ˆ‚Ì”‚ğ•Û‘¶
			int[] digits = new int[5];

			// answer
			int answer = 0;

			// ‘“–‚½‚è
			for ( int i = 1; i<=n; i++) {

				digits[0] = i%10;
				digits[1] = ( i%100    - digits[0] )/10;
				digits[2] = ( i%1000   - digits[0] - digits[1]  )/100;
				digits[3] = ( i%10000  - digits[0] - digits[1] - digits[2])/1000;
				digits[4] = ( i%100000 - digits[0] - digits[1] - digits[2] - digits[3])/10000;

				int sumOfDigits = 0;
				for (int temp:digits) {
					sumOfDigits+=temp;
				}

				if ( sumOfDigits >= a && sumOfDigits <= b) {
					answer+=i;
				}
			}

			System.out.println(answer);
		}
	}
}

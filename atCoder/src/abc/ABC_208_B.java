package abc;

import java.util.Scanner;

public class ABC_208_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final int p = sc.nextInt(); // p‰~

			int[] n  = new int[10];
			int change = p;

			while ( change > 0 ) {
				if ( fact(10) <= change && n[9] <= 100) {
					n[9]++;
					change = change - fact(10);
				} else if ( fact(9) <= change && change<fact(10) && n[8] <= 100 ) {
					n[8]++;
					change = change - fact(9);
				} else if ( fact(8) <= change && change<fact(9)  && n[7] <= 100 ) {
					n[7]++;
					change = change - fact(8);
				} else if ( fact(7) <= change && change<fact(8)  && n[6] <= 100 ) {
					n[6]++;
					change = change - fact(7);
				} else if ( fact(6) <= change && change<fact(7)  && n[5] <= 100 ) {
					n[5]++;
					change = change - fact(6);
				} else if ( fact(5) <= change && change<fact(6)  && n[4] <= 100 ) {
					n[4]++;
					change = change - fact(5);
				} else if ( fact(4) <= change && change<fact(5)  && n[3] <= 100 ) {
					n[3]++;
					change = change - fact(4);
				} else if ( fact(3) <= change && change<fact(4)  && n[2] <= 100 ) {
					n[2]++;
					change = change - fact(3);
				} else if ( fact(2) <= change && change<fact(3)  && n[2] <= 100 ) {
					n[1]++;
					change = change - fact(2);
				} else if ( fact(1) <= change && change<fact(2)  && n[0] <= 100 ) {
					n[0]++;
					change = change - fact(1);
				} else {
					// Žx•¥‚¢‚Å‚«‚È‚¢
				}
			}

			int ans = 0;
			for ( int temp : n) {
				ans += temp;
			}
			System.out.println(ans);

		}
	}

	private static int fact(int n) {
		int ans = 1;
		for (int i=1; i<=n; i++) {
			ans = ans*i;
		}
		return ans;
	}
}

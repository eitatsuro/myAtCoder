package abc;

import java.util.Scanner;

public class ABC_278_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int M = sc.nextInt();

			int i = H;
			int j = M;
			for(; i<24 ;i++) {
				if ( i != H ) j = 0; 
				for( ; j<60; j++) {
					if ( isAmbiguousTime(i, j) ) {
						System.out.println(i+" "+j);
						System.exit(0);
					}
				}
			}
			
			for(int k=0; k<H ;k++) {
				for( int m=0 ; m<60; m++) {
					if ( isAmbiguousTime(k, m) ) {
						System.out.println(k+" "+m);
						System.exit(0);
					}
				}
			}
		}
	}

	private static boolean isAmbiguousTime(int H, int M) {
		boolean ans = false;
		int A = (int)H/10;
		int B = H%10;
		int C = (int)M/10;
		int D = M%10;

		if ( ( 0 <= A*10+C && A*10+C <= 23 )
				&& (0 <= B*10+D && B*10+D <= 59 ) ) {
			ans = true;
		}

		return ans;
	}
}
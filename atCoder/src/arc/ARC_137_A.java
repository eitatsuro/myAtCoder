package arc;

import java.util.Scanner;

public class ARC_137_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			
			long L = sc.nextLong();
			long R = sc.nextLong();
			
			long max_answer = -1;
			long d = 1500;
			// 探索範囲
			// L <= x <= min (R, L + d)
			// max (L, R -d) < y <= R
			for (long x = L; x < Math.min(R, L+d); x++) {
				for (long y = R; y > Math.max(L, R-d); y--) {
					if ( gcd(x,y) == 1) {
						long temp_max = y-x;
						if (max_answer < temp_max) {
							max_answer = temp_max;
						}
					}
				}
			}
			
			System.out.println(max_answer);
			
			
		}
	}


	//最大公約数gcd ( Greatest Common Divisor )
	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

	
	
}
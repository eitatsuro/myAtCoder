package abc;

import java.util.Scanner;

public class ABC_266_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long N = sc.nextLong();
			final long givenNum = 998244353;

			long n = 0;
			if ( N >= 0) {
				n = N%givenNum;		
			} else {
				n = -1*(-1*N%givenNum);
			}
			
			for ( long i=0; ;i++) {
				if ( (n-i)%givenNum == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
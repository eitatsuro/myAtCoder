package abc;

import java.util.Scanner;

public class ABC_283_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			int[] A = new int[N];
			for(int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			
			int Q = sc.nextInt();
			for (int i=0; i<Q; i++) {
				int qType = sc.nextInt();
				if ( 1 == qType ) {
					int k = sc.nextInt();
					int x = sc.nextInt();
					A[k-1] = x;
					
				} else if ( 2 == qType ) {
					int k = sc.nextInt();
					System.out.println(A[k-1]);
				}
			}

		}
	}
}

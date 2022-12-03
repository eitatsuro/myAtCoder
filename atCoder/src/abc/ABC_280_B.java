package abc;

import java.util.Scanner;

public class ABC_280_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] S = new int[N];

			for(int i=0; i<N; i++) {
				S[i] = sc.nextInt();
			}

			int[] A = new int[N];

			A[0] = S[0];
			System.out.print(A[0]+" ");
			for ( int j=1; j<N; j++) {
				A[j] = S[j] - S[j-1];
				System.out.print(A[j]);
				if ( j != N-1 ) System.out.print(" ");
			}
		}
	}
}
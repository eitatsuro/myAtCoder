package abc;

import java.util.Scanner;

public class ABC_278_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] A = new int[N];
			for(int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}

			if ( K < N ) {
				for (int j=K; j<N; j++) {
					if ( j != K ) System.out.print(" ");
					System.out.print(A[j]);
				}
				for (int j=0; j<K; j++) {
					System.out.print(" ");
					System.out.print(0);
				} 
			} else {
				for (int j=0; j<N; j++) {
					if( j != 0 ) System.out.print(" ");
					System.out.print(0);
				} 
			}
		}
	}
}
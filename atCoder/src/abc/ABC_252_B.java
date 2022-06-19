package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_252_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] A = new int[N];
			int[] B = new int[K];

			for (int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}

			for (int i=0; i<K; i++) {
				B[i]=sc.nextInt();
			}

			// 嫌いな食品のおいしさの配列
			int[] C = new int[K];
			for (int i=0; i<K; i++) {
				C[i] = A[B[i] - 1];
			}

			Arrays.sort(C);
			Arrays.sort(A);

			if( A[N-1] == C[K-1] ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
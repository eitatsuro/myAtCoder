package abc;

import java.util.Scanner;

public class ABC_290_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] A = new int[N];
			int[] B = new int[M];
			
			for( int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}
			
			for( int i=0; i<M; i++) {
				B[i]=sc.nextInt();
			}
			
			int soutokuten = 0;
			for( int i=0; i<M; i++) {
				soutokuten = soutokuten + A[B[i]-1];
			}
			
			System.out.print(soutokuten);
			

		}
	}
}

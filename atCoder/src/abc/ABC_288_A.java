package abc;

import java.util.Scanner;

public class ABC_288_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];

			for(int i=0; i<N; i++) {
				A[i]=sc.nextInt();
				B[i]=sc.nextInt();
				System.out.println(A[i]+B[i]);
			}
			
			

		}
	}
}

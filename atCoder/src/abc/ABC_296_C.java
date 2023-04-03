package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_296_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int[] A = new int[N];

			for(int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}
			
			Arrays.sort(A);
			
			for(int i=0; i<N; i++) {
				for(int j=i; j<N; j++) {
					if ( Math.abs(A[i]-A[j]) == X ) {
						System.out.println("Yes");
						System.exit(0);
					} else if ( Math.abs(A[i]-A[j]) > X ) {
						break;
					}
				}
			}
			
			System.out.println("No");

		}
	}
}

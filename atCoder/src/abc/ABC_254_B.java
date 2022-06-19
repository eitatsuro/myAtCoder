package abc;

import java.util.Scanner;

public class ABC_254_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int N = sc.nextInt();
			
			int[][] a = new int[N][];
			for (int i=0; i<N; i++) {
				a[i] = new int [i+1];
			}
			
			for (int i=0; i<N; i++) {
				for ( int j=0; j<=i; j++) {
					if ( j==0 || j == i) {
						a[i][j] = 1;
					} else {
						a[i][j] = a[i-1][j-1] + a[i-1][j];
					}
				}
			}

			for (int i=0; i<N; i++) {
				for ( int j=0; j<=i; j++) {
					System.out.print(a[i][j]);
					if (! (j == i) ) System.out.print(" ");
				}
				System.out.println();
			}
			
		}


	}

}
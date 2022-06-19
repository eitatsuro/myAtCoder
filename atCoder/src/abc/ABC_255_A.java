package abc;

import java.util.Scanner;

public class ABC_255_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			int [][] A = new int[2][2];
			
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			System.out.println(A[R-1][C-1]);
		
		}
	}

}
package abc;

import java.util.Scanner;

public class ABC_256_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			int P=0;
			
			for (int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			
			// 駒がある1, 駒はない0
			int[] B = new int[4];
			// initialize
			for (int i=0; i<4; i++) {
				B[i] = 0;
			}
			
			for (int temp : A) {
				B[0] = 1;
				for(int i=3; i>=0; i--) {
					if (B[i] == 0) {
						// do nothing
					} else {
						if (i+temp>=4) {
							P++;
						} else {
							B[i+temp]++;
							// error
							if (B[i+temp]>1) System.out.println("Unexpected error...");
						}
						B[i]=0;
					}
				}
			}
			
			System.out.println(P);
		
		}
	}

}
package abc;

import java.util.Scanner;

public class ABC_285_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			
			int[] A = new int[N];  // A[i]円硬貨
			int[] B = new int[N];  // B[i]枚
			
			for(int i=0; i<N; i++) {
				A[i]=sc.nextInt();
				B[i]=sc.nextInt();
			}
			
			int shojikin = 0;
			for(int i=0; i<N; i++) {
				shojikin += A[i]*B[i];
			}			
			
			if ( shojikin < X ) {
				System.out.println("No");
				System.exit(0);
			}
			
			
			

		}
	}
}

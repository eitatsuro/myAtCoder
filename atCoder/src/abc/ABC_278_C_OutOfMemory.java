package abc;

import java.util.Scanner;

public class ABC_278_C_OutOfMemory {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int Q = sc.nextInt();

			byte[][] rinsetsu = new byte[N][N];

			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					rinsetsu[i][j]=0;
				}
			}

			for (int i=0; i<Q; i++) {
				int T = sc.nextInt();
				int A = sc.nextInt();
				int B = sc.nextInt();

				if ( T == 1 ) {
					rinsetsu[A-1][B-1] = 1;
				} else if ( T == 2) {
					rinsetsu[A-1][B-1] = 0;
				} else {
					if ( rinsetsu[A-1][B-1]==1 && rinsetsu[B-1][A-1]==1) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}		
			}
		}
	}
}
package abc;

import java.util.Scanner;

public class ABC_292_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int Q = sc.nextInt();

			int[] taijyo = new int[N];
			// 0 -> none
			// 1 -> yellow 1
			// 2 -> taijyo zumi
			for(int i=0; i<N; i++) {
				taijyo[i]=0;				
			}

			for(int i=0; i<Q; i++) {
				int eventType = sc.nextInt();
				int target = sc.nextInt();
				if( eventType == 1) {
					if ( taijyo[target-1] == 0 ) {
						taijyo[target-1] = 1;
					} else if ( taijyo[target-1] == 1) {
						taijyo[target-1] = 2;
					}
				} else if ( eventType == 2) {
					taijyo[target-1] = 2;
				} else if ( eventType == 3) {
					if(taijyo[target-1]==2) {
						System.out.println("Yes");						
					} else {
						System.out.println("No");
					}
				} else {
					// do nothing.
				}
			}

		}
	}
}

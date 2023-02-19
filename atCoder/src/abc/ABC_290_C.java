package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_290_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] A = new int[N];
			
			for(int i=0; i<N; i++) {
				A[i]=sc.nextInt();
			}
			
			Arrays.sort(A);
			int sequentialMaxFromZero = 0;

			// 0が存在しない場合
			if(A[0] > 0) {
				System.out.print(0);
				System.exit(0);
			}
			
			for(int i=0; i<N; i++) {
				if( A[i] == sequentialMaxFromZero ) {
					sequentialMaxFromZero++;
					continue;
				} else if ( A[i] > sequentialMaxFromZero ) {
					if ( sequentialMaxFromZero -1 >= 0) sequentialMaxFromZero--;
					break;
				}
				
				if(i == N-1) sequentialMaxFromZero--;
			}
			
			
			if( sequentialMaxFromZero+1 <= K) {
				System.out.println(sequentialMaxFromZero+1);
			} else {
				System.out.println(K);
			}
			
		}
	}
}

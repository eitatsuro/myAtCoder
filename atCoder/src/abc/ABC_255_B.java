package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_255_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int [] a = new int[K];

			int [] x = new int[N];
			int [] y = new int[N];

			// あかりを持つメンバで一番近いメンバまでの距離
			double [] r_min = new double[N];


			for(int i=0; i<K; i++) {
				a[i] = sc.nextInt();
			}

			for(int i=0; i<N; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			for(int i=0; i<N; i++) {
				double min_dist = Double.MAX_VALUE;
				for(int j=0; j<N; j++) {
					// あかりがあったらば計算する
					if ( isLightUp_j(a, K, j+1) ) {
						double dist = Math.pow( x[j]-x[i] ,2) + Math.pow( y[j]-y[i] ,2);
						if ( min_dist > dist) {
							min_dist = dist;
						}
					} else {
						// do nothing
					}
				}
				r_min[i] = min_dist;
			}
			
			Arrays.sort(r_min);
			System.out.println( Math.sqrt(r_min[N-1]));
		}
	}

	private static boolean isLightUp_j(int[] a, int K, int j) {
		boolean answer = false;

		for (int i=0; i<K; i++) {
			if (a[i] == j) answer = true;
		}

		return answer;
	}

} 
package abc;

import java.util.Scanner;

public class ABC_250_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] x = new int[Q];
			for(int i=0; i<Q; i++) {
				x[i] = sc.nextInt();
			}

			// 初期状態
			int[] a = new int[N];
			for(int i=0; i<N; i++) {
				a[i] = i+1;
			}

			// 整数iが書かれた玉の位置（配列aの添え字）を管理
			// 初期値
			int[] pos = new int[N+1];
			for(int i=0; i<=N; i++) {
				pos[i] = i-1;
			}			

			for(int i=0; i<Q; i++) {
				int current = pos[x[i]];
				if (current == N-1 ) {
					pos[x[i]]--;
					pos[a[current-1]]++;
					
					int temp = a[current-1];
					a[current-1] = a[current];
					a[current] = temp;

				} else {
					pos[x[i]]++;
					pos[a[current+1]]--;
					
					int temp = a[current+1];
					a[current+1] = a[current];			 
					a[current] = temp;
				}
			}

			//	System.out.println(String.join(" ", a));
			for (int i=0; i<N; i++) {
				if ( i==N-1) {
					System.out.print(a[i]);	
				} else {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
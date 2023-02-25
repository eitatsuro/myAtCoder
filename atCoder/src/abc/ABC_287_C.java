package abc;

import java.util.Scanner;

public class ABC_287_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			// すべての頂点について頂点から接続している辺の数を数える.
			// 一本道ならば、2点のみが1個、それ以外は2個の辺につながっているはず.
			// ↑の条件では不足していて、連結している条件が足りない。
			// （反例）　(1)---(2), (3)---(4)---(5)---(3) ※2番目はループ
			// TODO: グラフが連結であることの判定
			
			int[] u = new int[M];
			int[] v = new int[M];
			int[] hen = new int[N];

			for(int i=0; i<M; i++) {
				u[i]=0;
				v[i]=0;
			}
			
			for(int i=0; i<N; i++) {
				hen[i]=0;
			}
			
			for(int i=0; i<M; i++) {
				u[i] = sc.nextInt();
				v[i] = sc.nextInt();
				hen[u[i]-1] ++;
				hen[v[i]-1] ++;
				
				if ( u[i] == v[i] || M != N-1) {
					System.out.println("No");
					System.exit(0);
				}
				
			}

			// 頂点iの辺の数 hen[i-1]
			int count_2ji = 0;
			int count_1ji = 0;
			for ( int i=0; i<N; i++) {
				if ( hen[i] == 1) {
					count_1ji++;
				} else if ( hen[i] == 2) {
					count_2ji++;
				} else {
					System.out.println("No");
					System.exit(0);
				}
			}			
		
			
			if ( count_2ji == N-2 && count_1ji == 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}
	}
}

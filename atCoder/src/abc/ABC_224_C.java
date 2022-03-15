package abc;

import java.util.Scanner;


public class ABC_224_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // 点の個数
			long[] x = new long[n];
			long[] y = new long[n];

			// 点iの座標を取得
			for(int i=0; i<n; i++) {
				x[i] = sc.nextLong();
				y[i] = sc.nextLong();
			}

			int answer = 0;

			// 3点選んだ時に3角形となる条件
			// => 任意の2点を結ぶ直線上に、残り1点が存在しない.
			for (int i=0; i<n-2; i++) {
				for (int j=i+1; j<n-1; j++) {
					for (int k=j+1; k<n; k++) {
						// 以下の条件を満たすと一直線に存在するためＮＧ
						// 問題の制約より3点はすべてことなる座標となっているのでこれが３角形ができない条件
						//							if ( x[i] != x[j] && y[k]*(x[j]-x[i]) == (y[j]-y[i])*x[k] + y[i]*(x[j]-x[i]) - x[i] ) {
						//								// do nothing.
						//							} else if ( x[i] == x[j] && x[j] == x[k] ) {
						//								// do nothing.
						//							} else if ( y[i] == y[j] && y[j] == y[k] ) {
						//								// do nothing.
						//							} else if ( x[i] != x[j] && y[k]*(x[j]-x[i]) == x[k]*(y[j]-y[i]) ) {
						//								// do nothing.
						if ( y[k]*(x[j]-x[i]) == (y[j]-y[i])*x[k] + y[i]*(x[j]-x[i]) - x[i]*(y[j]-y[i]) ) {
							// do nothing.
						} else if ( x[i] == x[j] && x[j] == x[k] ) {
							// do nothing
						} else { 
							answer++;
						}
					}
				}
			}
			System.out.println(answer);


		}
	}
}
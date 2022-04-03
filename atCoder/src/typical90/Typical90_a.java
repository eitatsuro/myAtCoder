package typical90;

import java.util.Scanner;

public class Typical90_a {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();  // 切る場所候補
			int L = sc.nextInt();  // ようかんの長さ
			int K = sc.nextInt();  // 選ぶ切る場所の個数
			int [] A = new int[N];
			for (int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}


			// 答えの範囲が分かっているので、範囲を２分探索で絞っていく
			// スコアLの範囲は 0 < score < L
			// (1) スコア L/2以上となるように分割することができるか？
			//   ・・・スコア（長さ）がL/2以上になるように切れ目を選んでいき、すべてがL/2以上とできるか判定する
			// (2) 上記(1)の結果、
			//         L/2以上とできなければ、 0 < score < L/2 で再探索
			//         L/2以上とできたならば、 L/2 < score < L  で再探索
			
			int score = (int) L/2;
			int answer = 0;
			
			int lower = 0;
			int upper = L;
			while( true ) {
				int cuttingEdge = 0;
				int cuttingTime = 0;
				boolean isPossible = false;
				score = (int)( (lower+upper)/2 );
				
				// score以上の断片でカットできるかを評価.
				for (int i=0; i<N; i++) {
					if (A[i] - cuttingEdge >= score ) {
						cuttingEdge = A[i];
						cuttingTime++;
					}
					
					if (cuttingTime < K) {
						continue;
					} else {
						if (L-cuttingEdge >= score) isPossible=true;
						break;
					}
				}

				// カットできなかった場合
				if ( cuttingTime < K) isPossible=false;
				
				
				if (isPossible) {
					lower = score;
				} else {
					upper = score;
				}
				
				if ( upper - lower <= 1) {
					answer = lower;
					break;
				}
			}
			System.out.println(answer);

		}

	}

}
